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
        selectValue: ""
      };
  
      this.handleDropdownChange = this.handleDropdownChange.bind(this);
    }
  
    handleDropdownChange(e) {
      this.setState({ selectValue: e.target.value });
    }
  
    render() {
        if(this.state.selectValue === "PaymentPlan"){
            var temp = <PaymentList/>
        }else if(this.state.selectValue === "Genre"){
            var temp = <GenreList/>
        }else{
            var temp = null;
        }
      return (
        <Container>
          <div>
            <div>
              <select id="dropdown" onChange={this.handleDropdownChange}>
                <option value="Movies">Movies</option>
                <option value="PaymentPlan">Payment Plan</option>
                <option value="Cast">Cast</option>
                <option value="Genre">Genre</option>
              </select>
            </div>
  
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