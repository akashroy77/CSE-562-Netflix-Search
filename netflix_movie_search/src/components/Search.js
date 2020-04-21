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
        };
    
        this.handleDropdownChange = this.handleDropdownChange.bind(this);
        this.updateInput = this.updateInput.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);
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
        console.log("Selected : " ,this.state.selectValue);
      }

      handleSearchClick(){
        this.setState({selectedNumber : 1})
      }

      updateInput(event){
        this.setState({selectedNumber : event.target.value})
        }
        
        
        handleSubmit(){
          console.log('Your input value is: ' + this.state.selectedNumber)
          axios.get("http://localhost:8080/api/NetflixDB/category/search?selectedNumber="+ this.state.selectedNumber)
        .then(response => response.data)
        .then((data) => 
            this.setState({selectValue : data})
        );
        }

      render() {
        if(this.state.selectValue === "PaymentPlan"){
            temp = <PaymentList/>
        }else if(this.state.selectValue === "Genre"){
            var temp = <GenreList/>
        }else{
            temp = null;
        }
        console.log(this.state.selectValue);
      return (
        <Container className="spacing">
          <input type="text" onChange={this.updateInput}></input>
          <input type="submit" onClick={this.handleSubmit} ></input>

          <div>
                    <p>The Genres with imdb rating : {this.state.selectedNumber}</p>

                    {
                        <p>{this.state.selectValue}</p>
                    }
                </div>
        </Container>
      );
    }
}

export default Search;
