import React, { Component, Table, Container } from 'react';
import axios from 'axios';

class GenreList extends Component {

    constructor(props){
        super(props);
        this.state = {
            genres : []
        };
    }

    componentDidMount(){
        axios.get("http://localhost:8080/api/NetflixDB/category")
        .then(response => response.data)
        .then((data) => 
            this.setState({genres : data})
        );
    }

    render() {
        return (
                <div>
                    <p>Total available Genres are : {this.state.genres.length}</p>

                    {
                        this.state.genres.map((genre) => (
                            <table border="1">
                                <tbody>
                                    <tr key={genre.genreID}>
                                        <td>{genre.genre}</td>
                                        <td>{genre.duration}</td>
                                        <td>{genre.imdbRating}</td>
                                        <td>{genre.totalRevenue}</td>
                                    </tr>
                                </tbody>
                            </table>
                        ))
                    }
                </div>
        );
    }
}

export default GenreList;