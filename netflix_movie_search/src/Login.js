import React, {Component} from 'react'
import './Login.css'
import history from './history'

class Login extends Component{
    constructor(props){
        super(props)
        this.state={
            FirstName:' ',
            LastName:' ',
            Country:' ',
            DateOfBirth:' ',
            paymentPlan:"Basic",
        }
    }

    changeHandler= e=>{
       this.setState({[e.target.name]:e.target.value})
    }
    
    wrapperFunction = () =>{
        console.log(this.state)
        history.push('/user',{username:this.state.FirstName})
    }
    
    render(){
        const {FirstName,LastName,Country,DateOfBirth,paymentPlan}=this.state
        return(
            <body>
            <div className="main">
                <p className="sign" align="center">Sign in</p>
                <form className="formStyle">
                    <div>
                        <label className="labelStyle">First Name</label>
                        <input className="inputStyle"  type="text" name="FirstName" value={FirstName} onChange={this.changeHandler}/>
                    </div>
                    <div>
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
                    </div>
                    <div>
                        <button onClick={this.wrapperFunction} className="submitButton" type="submit"> Submit </button>
                    </div>
                </form>
            </div>
            </body>
        )
    }
}

export default Login; 
