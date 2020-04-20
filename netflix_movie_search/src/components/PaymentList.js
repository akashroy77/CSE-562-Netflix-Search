import React, { Component, Table, Container } from 'react';
import axios from 'axios';

class PaymentList extends Component {

    constructor(props){
        super(props);
        this.state = {
            plans : []
        };
    }

    componentDidMount(){
        axios.get("http://localhost:8080/api/NetflixDB")
        .then(response => response.data)
        .then((data) => 
            this.setState({plans : data})
        );
    }

    render() {
        return (
            // <Container>
                <div>
                    <p>Total available plans are : {this.state.plans.length}</p>

                    {
                        this.state.plans.map((plan) => (
                            <table border="1">
                                <tbody>
                                    <tr key={plan.paymentPlan}>
                                        <td>{plan.paymentPlan}</td>
                                        <td>{plan.paymentAmount}</td>
                                        <td>{plan.lateCharge}</td>
                                    </tr>
                                </tbody>
                            </table>
                            // <div>
                            // <Table stripped bordered hover variant="dark">
                            //     {/* <thead>
                            //         <tr>
                            //             <th>#</th>
                            //             <th>Movie Name</th>
                            //             <th>Genre</th>
                            //             <th>Total Views</th>
                            //         </tr>
                            //     </thead> */}
                            //     <tbody>
                            //         <tr>
                            //             <td>{plan.paymentPlan}</td>
                            //             <td>{plan.paymentAmount}</td>
                            //             <td>{plan.lateCharge}</td>
                            //         </tr>
                            //     </tbody>
                            // </Table>
                            // </div>
                    
                        ))
                    }
                </div>
            // </Container>
        );
    }
}

export default PaymentList;