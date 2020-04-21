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

                    <table stripped bordered hover variant="dark" border = "1">
                                <thead>
                                    <tr>
                                        <th>Payment Plan</th>
                                        <th>Payment Amount</th>
                                        <th>Late Charge</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    {
                                        this.state.plans.map((plan) => (
                                            
                                            <tr key={plan.paymentPlan}>
                                                <td>{plan.paymentPlan}</td>
                                                <td>{plan.paymentAmount}</td>
                                                <td>{plan.lateCharge}</td>
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

export default PaymentList;