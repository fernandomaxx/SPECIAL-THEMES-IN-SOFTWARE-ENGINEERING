import React from 'react';
import { StyleSheet, Text, View } from 'react-native';
import Header from './components/src/header';
import axios from 'axios';
import PeopleList from './components/src/peoplelist'

export default class App extends React.Component {

  constructor(props) {
    super(props)
    
    this.state = {
      people: []
    };

  }
  
  componentDidMount() {
    axios
      .get('https://randomuser.me/api/?nat=br&results=5')
      .then(response => {
        const {results} = response.data;
        this.setState({people: results })
      })

  }
   
  render() {
    return (
      <View>
        <Header title = "People"/>
        <PeopleList peoples = {this.state.people} />
      </View>
    );
  }
}
