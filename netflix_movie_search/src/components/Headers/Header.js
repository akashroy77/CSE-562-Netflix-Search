import React from "react";
import 'bootstrap/dist/css/bootstrap.min.css';
import { Navbar} from 'react-bootstrap';


const Header = (props) => {
  return (
    <Navbar bg="dark" variant="dark">
      <Navbar.Brand href="#home">
        <img
          alt=""
          src="../../netflixLogo.svg"
          width="30"
          height="30"
          className="d-inline-block align-top"
        />{' '}
        Netflix Search
      </Navbar.Brand>
    </Navbar>
  );
};

export default Header;