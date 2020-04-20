import React, { Component, Table, Container } from 'react';
import axios from 'axios';

class MovieList extends Component {

    constructor(props){
        super(props);
        this.state = {
            movies : []
        };
    }

    componentDidMount(){
        axios.get("http://localhost:8080/api/NetflixDB")
        .then(response => response.data)
        .then((data) => 
            this.setState({movies : data})
        );
    }

    render() {
        return (
                <div>
                    <p>Total available Movies are : {this.state.movies.length}</p>

                    {
                        this.state.movies.map((movie) => (
                            <table border="1">
                                <tbody>
                                    <tr key={movie.paymentPlan}>
                                        <td>{movie.paymentPlan}</td>
                                        <td>{movie.paymentAmount}</td>
                                        <td>{movie.lateCharge}</td>
                                    </tr>
                                </tbody>
                            </table>
                        ))
                    }
                </div>
        );
    }
}

export default PaymentList;