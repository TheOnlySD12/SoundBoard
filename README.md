[<img alt="github-singular" height="56" src="https://cdn.jsdelivr.net/npm/@intergrav/devins-badges@3/assets/cozy/social/github-singular_vector.svg">](https://github.com/TheOnlySD12) <img alt="modrinth" height="56" src="https://cdn.jsdelivr.net/npm/@intergrav/devins-badges@3/assets/cozy/available/modrinth_vector.svg">

# SoundBoard

**SoundBoard** is a must-have mod for Minecraft players using [Fabric](https://fabricmc.net). It introduces an ingenious *client-side* sound board that not only enhances your own auditory experience but also transforms multiplayer interactions. When combined with the server-side version, **SoundBoard** enables you to share your favorite sounds with other players, fostering a vibrant community atmosphere that adds a whole new dimension to your gameplay. Elevate your Minecraft experience to new heights by immersing yourself in the world of customizable sounds and collaborative audio exploration.

## Features

- Immerse yourself in either the *Light* or *Dark* themes that cater to your style.
- Customize your gameplay with *Normal*, *Compact*, and *Extended* modes to suit your preferences.
- Express yourself by adding your own personalized sounds to the sound board, transforming your Minecraft world into a symphony of creativity.
- And that's not all – discover even more exciting features as you explore the mod!

## Getting Started

Embark on your sound adventure with **SoundBoard** by downloading and installing the version tailored for your Minecraft setup. Find your groove and redefine how you interact with the game. This table that can help you choose the correct versions:

| Minecraft | Client | Server |
| -- | -- | -- |
| 1.20.1 | 3.0.0 | 1.0 |
| 1.19.4 | 2.5.0 | Not Supported *yet*|


## Configuration

Once you've successfully installed **SoundBoard** into your Minecraft environment, fine-tune your experience using the user-friendly [ModMenu](https://modrinth.com/mod/modmenu) interface. Accessible through the *Mods* button on the main menu screen, you can effortlessly modify themes and modes to your liking by pressing on the mod's icon.

## Custom Sounds

To add custom sounds you must use a resource pack and if you want other to hear your sounds they must also have that resource pack. I have created a [template](https://github.com/TheOnlySD12/SoundBoardResourcePack) that can be used to easily add sounds.

### Guide

1. Download the template resource pack and unzip it
2. Download a `.mp3` file with your desired sound
3. Convert your `.mp3` to `.ogg`
   - [Online Converter](https://convertio.co/mp3-ogg/)
4. Rename it `custom1.ogg`
   - To add more sounds just rename them `custom2.ogg`, `custom3.ogg` etc.
   - Six sounds is the limit (8 in *Extended* Mode)
5. Put the sound in `assets\soundboard\sounds`
6. Zip the resource pack and put it in the `resources` folder of you Minecraft installation

> Note: Make sure that you didn't zip the folder of the resource pack. The path to the `pack.mcmeta` file should look like this: `ResourcepackName.zip\pack.mcmeta`

#### Subtitles

To add subtitles you can do this:

1. Open `assets\soundboard\lang\en_us.json`
2. Add subtitles or change button names

#### More Sounds

To add a few more custom sounds you can change the default ones. Simply follow the guide for adding sounds but instead of naming the files `custom1.ogg`, `custom2.ogg` etc. Name them `among.ogg`, `smg.ogg`, `sui.ogg` and  `wow.ogg`.

## Support

For any inquiries or concerns related to the **SoundBoard** client-mod, navigate to our dedicated [issue tracker](https://github.com/TheOnlySD12/SoundBoard/issues). If you encounter issues with the server-side mod, you're encouraged to utilize our [server-side issue tracker](https://github.com/TheOnlySD12/SoundBoard-Server-Fabric/issues).

## Credits

**SoundBoard** was developed by [TheOnlySD12](https://github.com/TheOnlySD12) and is licensed under the **MIT License**. Special thanks to the following people for their contributions to the project:

- Me (Code Review)
- Myself (Ideas)
- I (Testing)

I hope you enjoy using **SoundBoard**! Please don't hesitate to use *the issue tracker* if you have any feedback or suggestions.