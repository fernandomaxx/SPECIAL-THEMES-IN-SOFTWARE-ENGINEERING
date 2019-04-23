import React from 'react';
import {View, Text, StyleSheet} from 'react-native';
import PeopleListItem from './peoplelistitem'

const PeopleList = props => {
    const {peoples} = props;
    const itens = peoples.map(people => 
      <PeopleListItem 
        key={people.name.first}
        people={people} />
      );
      
    return (
      <View style={styles.container}>
        {itens ? itens : <Text> Esta Vazio </Text>}
      </View>
    );
};

const styles = StyleSheet.create ({
  container: {
    backgroundColor: '#FFFAFA'
  },
})

export default PeopleList;