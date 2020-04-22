import React, {Component} from 'react'
import { Container } from 'react-bootstrap'
import axios from 'axios';

class Insert extends Component{
    constructor(props){
        super(props)
        this.state={
            FirstName: "",
            LastName:' ',
            Country:' ',
            DateOfBirth:' ',
            paymentPlan:"Basic",
        };
        this.updateInput = this.updateInput.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);
    }

    updateInput(event){
        this.setState({FirstName : event.target.value})
      }

    handleSubmit(){
        axios.get("http://localhost:8080/api/NetflixDB/add/user?selectedNumber=" + this.state.FirstName)
      .then(response => response.data)
      .then((data) => 
          this.setState({returned : data})
      );
      }
    
    render(){
        const {FirstName,LastName,Country,DateOfBirth,paymentPlan}=this.state
        return(
            <Container className="search">
            <div className="main">
                <p className="sign" align="center">Sign in</p>
                    <div>
                        <label className="labelStyle">First Name</label>
                        <input type="text" onChange={this.updateInput}></input>

                        <input type="submit" onClick={this.handleSubmit} ></input>
                        {console.log(this.state.returned)}
                    </div>
                    {/* <div>
                        <label className="labelStyle">Last Name</label>
                        <input className="inputStyle" type="text" name="LastName" value={LastName} onChange={this.changeHandler}/>
                    </div>
                    <div>
                        <label className="labelStyle">Country</label>
                        <input className="inputStyle" type="text" name="Country" value={Country} onChange={this.changeHandler}/>
                    </div>
                    <div id="inputbox">
                        <label className="labelStyle">Date of Birth</label>
                        <input className="inputStyle" type="text" name="DateOfBirth" value={DateOfBirth} onChange={this.changeHandler}/>
                    </div>
                    <div className="inputStyle">
                        <label> Choose A Payment Plan</label>
                    </div>
                    <div className="styled-select">
                        <select defaultValue={this.state.paymentPlan} name="paymentPlan"onChange={this.changeHandler}>
                            <option value="Basic" >Premium</option>
                            <option value="Standard" >Standard</option>
                            <option value="Premium">Basic</option>
                        </select>
                    </div> */}
                    {/* <div>
                        <button onClick={this.handleSubmit} type="submit" > Submit </button>
                        {console.log(this.state.returned)}
                    </div> */}
            </div>
            </Container>
        )
    }
}

export default Insert; 