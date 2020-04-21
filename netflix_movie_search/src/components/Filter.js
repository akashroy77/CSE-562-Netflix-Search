import React from 'react';
import {Form, Container, DropdownButton, Dropdown, Row, Col, Button} from 'react-bootstrap';
import './componentCSS.css';
import PaymentList from './PaymentList';
import GenreList from './GenreList';

// function handleChange(event) {
//     // this.setState({ selectValue: e.target.value });
//     console.log("Changed to : ",event);
//     this.setState({
//         value: event.target.value
//     });
//   }

// tables = [ "X-Small", "Small", "Medium", "Large", "X-Large", "2X-Large" ];
// state = { value : "Large"};

// function Filter(props) {
//     return (
//         <Container className="spacing filter">
//            <Form>
//                 <Row>
//                     <Col>
//                         {/* <DropdownButton id="dropdown-basic-button" title="Select.." onSelect={function(evt){console.log(evt)}}>
//                             <Dropdown.Item eventKey="Movie">Movie</Dropdown.Item>
//                             <Dropdown.Item eventKey="Cast">Cast</Dropdown.Item>
//                             <Dropdown.Item eventKey="Payment Plan">Payment Plan</Dropdown.Item>
//                             <Dropdown.Item eventKey="Genre">Genre</Dropdown.Item>
//                         </DropdownButton> */}

//                         <DropDownList
//                             data={this.tables}
//                             value={this.state.value}
//                             onChange={this.handleChange}
//                         />




//                     </Col>
//                     <Col>
//                         <DropdownButton id="dropdown-basic-button" title="Genre">
//                             <Dropdown.Item href="#/action-1">Genre</Dropdown.Item>
//                             <Dropdown.Item href="#/action-2">Another action</Dropdown.Item>
//                             <Dropdown.Item href="#/action-3">Something else</Dropdown.Item>
//                         </DropdownButton>
//                     </Col>
//                     <Col>
//                         <DropdownButton id="dropdown-basic-button" title="Genre">
//                             <Dropdown.Item href="#/action-1">Genre</Dropdown.Item>
//                             <Dropdown.Item href="#/action-2">Another action</Dropdown.Item>
//                             <Dropdown.Item href="#/action-3">Something else</Dropdown.Item>
//                         </DropdownButton>
//                     </Col>
//                     <Col>
//                         <DropdownButton id="dropdown-basic-button" title="Payment">
//                             <Dropdown.Item href="#/action-1">Basic</Dropdown.Item>
//                             <Dropdown.Item href="#/action-2">Standard</Dropdown.Item>
//                             <Dropdown.Item href="#/action-3">Premium</Dropdown.Item>
//                         </DropdownButton>
//                     </Col>
//                     <Col>
//                         <DropdownButton id="dropdown-basic-button" title="Streams">
//                             <Dropdown.Item href="#/action-1">480p</Dropdown.Item>
//                             <Dropdown.Item href="#/action-2">720p</Dropdown.Item>
//                             <Dropdown.Item href="#/action-3">1080p</Dropdown.Item>
//                             <Dropdown.Item href="#/action-3">2160p</Dropdown.Item>
//                             <Dropdown.Item href="#/action-3">4320p</Dropdown.Item>
//                         </DropdownButton>
//                     </Col>
//                 </Row>
//                 <br></br>
//                 <br></br>
//                 <Button variant="primary" type="submit">
//                     Submit
//                 </Button>
//             </Form>
//         </Container>
//     );
// }


class Filter extends React.Component {
    constructor(props) {
      super(props);
      this.state = {
        selectValue: "",
        category: "",
        plan: "",
        stream: ""
      };
  
      this.handleCategoryChange = this.handleCategoryChange.bind(this);
      this.handlePlanChange = this.handlePlanChange.bind(this);
      this.handleStreamChange = this.handleStreamChange.bind(this);
    }
  
    handleCategoryChange(e) {
      this.setState({ category: e.target.value });
      console.log(this.state);
      this.display();
    }

    handlePlanChange(e) {
        this.setState({ plan: e.target.value });
        this.display();
    }

    handleStreamChange(e) {
        this.setState({ stream: e.target.value });
        this.display();
    }

    display = () =>{
        console.log(this.state);
    }
  
    render() {
        if(this.state.category === "Adventure"){
            var temp = <PaymentList/>
        }else if(this.state.category === "Horror"){
            var temp = <GenreList/>
        }else{
            var temp = null;
        }
      return (
        <Container className="spacing">
          <div>
            
              <select className="ddspacing" id="dropdown" name="category" onChange={this.handleCategoryChange}>
                <option value="Action">Action</option>
                <option value="Adventure">Adventure</option>
                <option value="Romance">Romance</option>
                <option value="Horror">Horror</option>
              </select>
            
            
              <select className="ddspacing" id="dropdown" name="plan" onChange={this.handlePlanChange}>
                <option value="basic">Basic</option>
                <option value="stsandard">Standard</option>
                <option value="premium">Premium</option>
              </select>
          
              <select className="ddspacing" id="dropdown" name="stream" onChange={this.handleStreamChange}>
                <option value="normal">480p</option>
                <option value="HD">720p</option>
                <option value="fullHD">1080p</option>
                <option value="2k">2160p</option>
              </select>
        
  
            <div>Selected value is : {this.state.selectValue}</div>
            {/* {this.state.selectValue === "PaymentPlan" ? <PaymentList/> : <GenreList/>} */}
            {/* {this.state.selectValue === "Genre" ? <GenreList/> : null} */}
            {temp}
          </div>
        </Container>
      );
    }
  }

export default Filter;