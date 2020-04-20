import React,{Component} from 'react'
import './Query.scss'
import '../node_modules/font-awesome/css/font-awesome.min.css'

class Query extends Component{
    constructor(props){
        super(props)
    }

    wrapperFunction=() =>{
       
           
    }
   
    render(){
        return(
            <div>
                <body>
                    <div className="wrap">
                        <div className="search">
                            <input type="text" class="searchTerm" placeholder="Search by Movie Name"/>
                            <button type="submit" className="searchButton">
                            <i className="fa fa-search"></i>
                        </button>
                        </div>
                    </div>
                    <button className="myButton">Query</button>
                </body>
               
            </div>
         
        )
    }
}

export default Query;
