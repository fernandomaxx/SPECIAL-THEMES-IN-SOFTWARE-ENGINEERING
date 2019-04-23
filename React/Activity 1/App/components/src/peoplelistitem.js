import React from 'react';
import {View, Text, StyleSheet, Image} from 'react-native';
import ToUpper from './toupper';

const PeopleListItem = props => {
    const {people} = props;
    const {title, first, last} = people.name;
    return (
      <View key = { first } style = {styles.line}>
          <Image style = {styles.photo}
            source = {{uri: people.picture.thumbnail}}/>
          <ToUpper
            t = {title} f = {first} l = {last}
          />
      </View>
    );
};

const styles = StyleSheet.create ({

  line: {
    height: 60,
    borderBottomWidth: 1,
    borderBottomColor: '#bbb',
    flexDirection: 'row',
    alignItems: 'center',
    paddingLeft: 15
  },

  photo: {
    height: 40,
    width: 40,
    borderRadius: 20,
  }
});

export default PeopleListItem;