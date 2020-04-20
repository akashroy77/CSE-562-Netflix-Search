import React from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import {Table, Container} from 'react-bootstrap';


function View(props) {
    return (
        <Container className="spacing">
            <div>
            <Table striped bordered hover variant="dark">
                <thead>
                    <tr>
                        <th>#</th>
                        <th>Movie Name</th>
                        <th>Genre</th>
                        <th>Total Views</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>1</td>
                        <td>Movie 1</td>
                        <td>Genre 1</td>
                        <td>123456789</td>
                    </tr>
                    <tr>
                        <td>2</td>
                        <td>Movie 2</td>
                        <td>Genre 2</td>
                        <td>897654321</td>
                    </tr>
                    <tr>
                        <td>3</td>
                        <td>Movie 3</td>
                        <td>Genre 3</td>
                        <td>45678921</td>
                    </tr>
                </tbody>
                </Table> 
            </div>
        </Container>
        
    );
}

export default View;