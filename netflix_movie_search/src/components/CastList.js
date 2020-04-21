import React, { Component, Table, Container } from 'react';
import axios from 'axios';

class CastList extends Component {

    constructor(props){
        super(props);
        this.state = {
            casts : []
        };
    }

    componentDidMount(){
        axios.get("http://localhost:8080/api/NetflixDB/cast")
        .then(response => response.data)
        .then((data) => 
            this.setState({casts : data})
        );
        console.log(this.state.casts);
    }

    render() {
        return (
            // <Container>
                <div>
                    <p>Total Actors are : {this.state.casts.length}</p>

                    <table stripped bordered hover variant="dark" border = "1">
                                <thead>
                                    <tr>
                                        <th>ID</th>
                                        <th>Name</th>
                                        <th>Country</th>
                                        <th>Address</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    {
                                        
                                        this.state.casts.map((cast) => (
                                            
                                            <tr>
                                                <td>{cast.actorid}</td>
                                                <td>{cast.actorname}</td>
                                                <td>{cast.country}</td>
                                                <td>{cast.address}</td>
                                            </tr>
                                        ))
                                        
                                    }
                                </tbody>
                    </table> 

                </div>
            // </Container>
        );
    }
}

export default CastList;