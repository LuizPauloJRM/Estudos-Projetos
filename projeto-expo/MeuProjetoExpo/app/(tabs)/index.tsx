import React from 'react';
import { View, Text, StyleSheet, Button, Alert } from 'react-native';

export default function Home() {
  return (
    <View style={styles.container}>
      <Text style={styles.title}>Bem-vindo ao App React!</Text>
      <Text style={styles.subtitle}>Clique no botão para saber mais.</Text>
      <Button 
        title="Mostrar Alerta"
        onPress={() => Alert.alert('Olá!', 'Este é um alerta personalizado.')}
      />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#e6f7ff', // Fundo azul claro
  },
  title: {
    fontSize: 24,
    fontWeight: 'bold',
    color: '#007acc', // Azul
    marginBottom: 10,
  },
  subtitle: {
    fontSize: 18,
    color: '#333',
    marginBottom: 20,
  },
});
