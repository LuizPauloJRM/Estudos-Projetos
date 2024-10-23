import React from 'react';
import { StyleSheet, Text, View, Button } from 'react-native';
import { StatusBar } from 'expo-status-bar';

export default function App() {
  return (
    <View style={styles.container}>
      <Text>Olá, bem-vindo ao app Expo!
        Luiz
      </Text>
      <StatusBar style="auto" />
      <Button title="Clique aqui" onPress={() => alert('Botão clicado!')} />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
});
