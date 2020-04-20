import React from 'react';
import {render} from 'react-dom';
import 'bootstrap/dist/css/bootstrap.min.css';
import { Button } from '@material-ui/core';
import axios from 'axios';

class Temp extends React.Component{

    handleClick(){
        axios.get('http://localhost:8080/api/get/NetflixDB')
        .then(response => console.log(response))
      }


    render() {
        return (
            <div>
                <Button variant="contained" color="primary" onClick={this.handleClick}>Query</Button>

                <Button variant="contained" color="secondary">
                    Query
                </Button>
            </div>
        )
      }
}

export default Temp;

