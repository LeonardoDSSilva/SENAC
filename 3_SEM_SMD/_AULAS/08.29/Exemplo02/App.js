import React, {useState} from 'react';
import {View, Text} from 'react-native';

function Exemplo01(){
	return(
		<View style={{flex:1, justifyContent:'center', alignItems:'center'}}>
			<Text>Olá Mundo - Exemplo 01</Text>
		</View>
	);
};

const Exemplo02 = () => {
	return(
		<View style={{flex:1, justifyContent:'center', alignItems:'center'}}>
			<Text>Olá Mundo - Exemplo 02</Text>
		</View>
	);
};

const Exemplo03 = () => <View style={{flex:1, justifyContent:'center', alignItems:'center'}}><Text>Olá Mundo - Exemplo 03</Text></View>;

const Exemplo04 = ({nome = "João", idade = 18}) => {
	return(
		<View style={{flex:1, justifyContent:'center', alignItems:'center'}}>
			<Text>Olá {nome}, você tem {idade} anos.</Text>
		</View>
	);
};

export {Exemplo01, Exemplo02, Exemplo03, Exemplo04};

export default function App(){
  return(
    <View style={{flex:1, justifyContent:'center', alignItems:'center'}}>
      <Text>Olá Mundo</Text>
    </View>
  );
};