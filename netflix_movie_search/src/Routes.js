import React, { Component } from "react";
import { Router, Switch, Route } from "react-router-dom";
import './OperationSelect.css'
import Login from "./Login"
import Insert from "./Insert"
import Query from "./Query"
import history from './history';

const OperationSelect= (props) => {
    return (
        <div>
        <header>
        <div class="overlay">
            {console.log(props)}
            <h1>Welcome {props.location.state.username} </h1>
            <h3>Choose One of the operation from following</h3>
            <div>
                <button className="myButton"> Insert</button>
                <button className="myButton"> Query</button>
            </div>
        </div>
        </header>
        </div>
       
    )
}

export default class Routes extends Component {
    render() {
        return (
            <Router history={history}>
                <Switch>
                    <Route path="/" exact component={Login}/>
                    <Route path="/user" component={OperationSelect}/>
                    <Route path="/insert" component={Insert}/>
                    <Route path="/query" component={Query}/>
                </Switch>
            </Router>
        )
    }
}