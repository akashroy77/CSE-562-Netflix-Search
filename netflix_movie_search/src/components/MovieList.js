import React, { Component, Table, Container } from 'react';
import axios from 'axios';

class MovieList extends Component {

    constructor(props){
        super(props);
        this.state = {
            movies : [],
        };
        // this.setState({passed : this.props.data})
    }

    componentDidMount(){
        axios.get("http://localhost:8080/api/NetflixDB")
        .then(response => response.data)
        .then((data) => 
            this.setState({movies : data})
        );
    }


    render() {
        // const {passed} = this.props;
        return (
                <div>
                    {/* <p>Total available Movies are : {this.state.passed.length}</p> */}
                    
                    {
                        this.state.movies.map((movie) => (
                            <table border="1">
                                <tbody>
                                    <tr>
                                        <td>{movie.streamid}</td>
                                        <td>{movie.id}</td>
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

export default MovieList;