import React, { Component } from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import { Container, InputGroup, Button, FormControl, Dropdown, DropdownButton } from 'react-bootstrap';
import PaymentList from './PaymentList';
import GenreList from './GenreList';

class Search extends Component{
    constructor(props) {
        super(props);
        this.state = {
          selectValue: ""
        };
    
        this.handleDropdownChange = this.handleDropdownChange.bind(this);
      }

    
      handleDropdownChange(e) {
        this.setState({ selectValue: e.target.value });
        console.log("Selected : " ,this.state.selectValue);
      }

      render() {
        if(this.state.selectValue === "PaymentPlan"){
            temp = <PaymentList/>
        }else if(this.state.selectValue === "Genre"){
            var temp = <GenreList/>
        }else{
            temp = null;
        }
      return (
        <Container className="spacing">
          <InputGroup>
                <FormControl
                placeholder="Select type and search.."
                aria-label="Search Bar"
                aria-describedby="basic-addon2"
                />
                <InputGroup.Append>
                    <select id="dropdown" onChange={this.handleDropdownChange}>
                        <option value="Movies">Movies</option>
                        <option value="PaymentPlan">Payment Plan</option>
                        <option value="Cast">Cast</option>
                        <option value="Genre">Genre</option>
                    </select>


                    <Button variant="outline-secondary">Search</Button>

                </InputGroup.Append>
            </InputGroup>
        </Container>
      );
    }
}

export default Search;
