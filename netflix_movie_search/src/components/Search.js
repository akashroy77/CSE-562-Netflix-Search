import React, { Component } from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import { Container, InputGroup, Button, FormControl, Dropdown, DropdownButton } from 'react-bootstrap';
import PaymentList from './PaymentList';
import GenreList from './GenreList';
import axios from 'axios';

class Search extends Component{
    constructor(props) {
        super(props);
        this.state = {
          selectValue: "",
          greeting: "This is a false greeting",
          selectedNumber : 1,
          table: "Movie",
          returned: []
        };
    
        this.handleDropdownChange = this.handleDropdownChange.bind(this);
        this.updateInput = this.updateInput.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);
        this.updateTable = this.updateTable.bind(this);
      }

      // componentDidMount() {
      //   // fetch("/NetflixDB/category/search?selectedNumber=" + this.state.selectedNumber).then(function(response) {
      //   //        return response.text();
      //   //     }).then((response) => {
      //   //           console.log(response);
      //   //        });

      //   axios.get("http://localhost:8080/api/NetflixDB/category/search?selectedNumber="+ this.state.selectedNumber)
      //   .then(response => response.data)
      //   .then((data) => 
      //       this.setState({selectValue : data})
      //   );
      // }

    
      handleDropdownChange(e) {
        this.setState({ selectValue: e.target.value });
        // console.log("Selected : " ,this.state.selectValue);
      }

      handleSearchClick(){
        this.setState({selectedNumber : 1})
      }

      updateInput(event){
        this.setState({selectedNumber : event.target.value})
      }

      updateTable(event){
        this.setState({table : event.target.value})
        console.log(this.state.table)
      }
        
        
        handleSubmit(){
          if(this.state.table === "Movie"){
            var caller = "http://localhost:8080/api/NetflixDB/category/search/movie?selectedNumber=" + this.state.selectedNumber; 
          }else if(this.state.table === "Category"){
            var caller = "http://localhost:8080/api/NetflixDB/category/search?selectedNumber=" + this.state.selectedNumber;
          }else{
            var caller = "http://localhost:8080/api/NetflixDB/category/search?selectedNumber=" + this.state.selectedNumber;
          }
          console.log('Your input value is: ' + this.state.selectedNumber + " And table is : " + this.state.table)
          axios.get(caller)
        .then(response => response.data)
        .then((data) => 
            this.setState({returned : data})
        );
        }

      render() {
        // if(this.state.selectValue === "PaymentPlan"){
        //     temp = <PaymentList/>
        // }else if(this.state.selectValue === "Genre"){
        //     var temp = <GenreList/>
        // }else{
        //     temp = null;
        // }
        console.log(this.state.returned);
      return (
        <Container className="spacing">
          <input type="text" onChange={this.updateInput}></input>
          <select id="tables" name="tables" onChange={this.updateTable}>
            <option value="Movie">Movie</option>
            <option value="Category">Category</option>
            <option value="Stream">Stream</option>
            <option value="Cast">Cast</option>
        </select>
          <input type="submit" onClick={this.handleSubmit} ></input>
          <div>
                    <p>The Genres with imdb rating : {this.state.selectedNumber}</p>

                    <table stripped bordered hover variant="dark" border = "1">
                                <thead>
                                    <tr>
                                        <th>Movie Name</th>
                                        <th>Language</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    {
                                        this.state.returned.map((element) => (
                                            
                                            <tr>
                                                <td>{element[0]}</td>
                                                <td>{element[1]}</td>
                                            </tr>
                                        ))
                                        
                                    }
                                </tbody>
                    </table> 
                </div>
        </Container>
      );
    }
}

export default Search;
