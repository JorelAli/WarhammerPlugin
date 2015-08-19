# Warhammer
An example of a plugin using AllAssets' CustomItem and ItemBuilder API

Here's an example of how to use the [AllAssets API](https://github.com/Skepter/AllAssets/tree/master/Plugin%20-%20AllAssets/src/io/github/skepter/allassets/api) to create customized items.

API classes used:
* [CustomItem](https://github.com/Skepter/AllAssets/blob/master/Plugin%20-%20AllAssets/src/io/github/skepter/allassets/api/CustomItem.java) - Used to create the customized item and give it 'functions' when right/left clicked.
* [ItemBuilder](https://github.com/Skepter/AllAssets/blob/master/Plugin%20-%20AllAssets/src/io/github/skepter/allassets/api/builders/ItemBuilder.java) - Used to create the customized ItemStack and give it a fancy display name, lore and glowing effect.

Example usage (Shown by [WarhammerItem](https://github.com/Skepter/Warhammer/blob/master/Plugin%20-%20Warhammer/src/io/github/Skepter/Warhammer/WarhammerItem.java):
* Have your class extend the [CustomItem]((https://github.com/Skepter/AllAssets/blob/master/Plugin%20-%20AllAssets/src/io/github/skepter/allassets/api/CustomItem.java) class.
* Choose a constructor - 
  ```java
  public CustomItem(JavaPlugin plugin, ItemStack itemStack, String itemName)
  
  public CustomItem(JavaPlugin plugin, ItemStack itemStack, String itemName, String permission)
  ```
* Sort out what you want to get done when the player does whatever and you're good to go.
