import React from 'react';
import './App.css';
import Header from './components/Headers/Header';
import Search from './components/Search';
import View from './components/View';
import Filter from './components/Filter';
import PaymentList from './components/PaymentList';

class App extends React.Component{
 
  render(){

    return(
      <div>
        <Header/>
        <Search/>
        <Filter/>
        <View/>
        {/* <PaymentList/> */}
      </div>
    )
  }
}

export default App;
