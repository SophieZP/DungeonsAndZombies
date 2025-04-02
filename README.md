# Zombie Dodge

**Zombie Dodge** es un juego en 2D en el que dos jugadores deben sobrevivir en un mundo lleno de zombies. El juego cuenta con varios modos, como un modo de jugador único y un modo de dos jugadores, donde cada jugador controlará a su propio personaje para evitar ser infectado o devorado por los zombies.

## Características

- **Controles**:
  - Jugador 1: WASD
  - Jugador 2: Flechas (↑↓←→)
  
- **Modos de juego**:
  - **Modo Normal**: Menos zombies y más objetos de curación.
  - **Modo Hardcore**: Más zombies y menos objetos de curación.

- **Estados de los jugadores**:
  - Sano
  - Rasguño: 30% de probabilidad de convertirse en zombie.
  - Laceración: 50% de probabilidad de convertirse en zombie.
  - Mordedura: 100% de probabilidad de convertirse en zombie.

- **Objetos**:
  - **Vendas**: Recuperan vida.
  - **Antídoto**: Elimina la probabilidad de infección por rasguños o laceraciones.

- **Eventos especiales**:
  - **Helicóptero**: Atrae zombies, aparece aleatoriamente.
  
- **Cinemática de inicio**:
  - "Y el fin del mundo llegó, la civilización colapsó y así es como moriste."

## Requisitos

- **Java 8 o superior**.
- **Greenfoot**: La biblioteca utilizada para desarrollar este juego.

## Cómo ejecutar el juego

1. **Clonar el repositorio**:
   
   ```bash
   git clone https://github.com/tu-usuario/zombiedodge.git
