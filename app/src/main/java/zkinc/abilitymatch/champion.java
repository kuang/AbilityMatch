package zkinc.abilitymatch;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Yiyi on 12/10/2014.
 */
public class champion {
    private String[] champnames = {"Aatrox","Ahri", "Akali", "Alistar", "Amumu", "Anivia","Annie","Ashe","Azir","Blitzcrank","Brand","Braum","Caitlyn","Cassiopeia","Cho'Gath","Corki","Darius","Diana","Dr. Mundo","Draven","Elise","Evelynn","Ezreal","Fiddlesticks","Fiora","Fizz","Galio","Gangplank","Garen","Gnar","Gragas","Graves","Hecarim","Heimerdinger","Irelia","Janna","Jarvan IV","Jax","Jayce","Jinx","Kalista","Karma","Karthus","Kassadin","Katarina","Kayle","Kennen","Kha'Zix","Kog'Maw","LeBlanc","Lee Sin","Leona","Lissandra","Lucian","Lulu","Lux","Malphite","Malzahar","Maokai","Master Yi","Miss Fortune","Mordekaiser","Morgana","Nami","Nasus","Nautilus","Nidalee","Nocturne","Nunu","Olaf","Orianna","Pantheon","Poppy","Quinn","Rammus","Rek'Sai","Renekton","Rengar","Riven","Rumble","Ryze","Sejuani","Shaco","Shen","Shyvana","Singed","Sion","Sivir","Skarner","Sona","Soraka","Swain","Syndra","Talon","Taric","Teemo","Thresh","Tristana","Trundle","Tryndamere","Twisted Fate","Twitch","Udyr","Urgot","Varus","Vayne","Veigar","Vel'Koz","Vi","Viktor","Vladimir","Volibear","Warwick","Wukong","Xerath","Xin Zhao","Yasuo","Yorick","Zac","Zed","Ziggs","Zilean","Zyra"};
    private String[]champtitle= {"the Darkin Blade","the Nine-Tailed Fox","the Fist of Shadow","the Minotaur","the Sad Mummy","the Cryophoenix","the Dark Child","the Frost Archer","the Emperor of the Sands","the Great Steam Golem","the Burning Vengeance","the Heart of the Freljord","the Sheriff of Piltover","the Serpent's Embrace","the Terror of the Void","the Daring Bombardier","the Hand of Noxus","Scorn of the Moon","the Madman of Zaun","the Glorious Executioner","the Spider Queen","the Widowmaker","the Prodigal Explorer","the Harbinger of Doom","the Grand Duelist","the Tidal Trickster","the Sentinel's Sorrow","the Saltwater Scourge","the Might of Demacia","the Missing Link","the Rabble Rouser","the Outlaw","the Rabble Rouser","the Revered Inventor","the Will of the Blades","the Storm's Fury","the Exemplar of Demacia","Grandmaster at Arms","the Defender of Tomorrow","the Loose Cannon","the Spear of Vengeance","the Enlightened One","the Deathsinger","the Void Walker","the Sinister Blade","the Judicator","the Heart of the Tempest","the Voidreaver","the Mouth of the Abyss","the Deceiver","the Blind Monk","the Radiant Dawn","the Ice Witch","the Purifier","the Fae Sorceress","the Lady of Luminosity","Shard of the Monolith","the Prophet of the Void","the Twisted Treant","the Wuju Bladesman","the Bounty Hunter","the Master of Metal","Fallen Angel","the Tidecaller","the Curator of the Sands","the Titan of the Depths","the Bestial Huntress","the Eternal Nightmare","the Yeti Rider","the Berserker","the Lady of Clockwork","the Artisan of War","the Iron Ambassador","Demacia's Wings","the Armordillo","the Void Burrower","the Butcher of the Sands","the Pridestalker","the Exile","the Mechanized Menace","the Rogue Mage","the Winter's Wrath","the Demon Jester","Eye of Twilight","the Half-Dragon","the Mad Chemist","the Undead Juggernaut","the Battle Mistress","the Crystal Vanguard","Maven of the Strings","the Starchild","the Master Tactician","the Dark Sovereign","the Blade's Shadow","the Gem Knight","the Swift Scout","the Chain Warden","the Megling Gunner","the Troll King","the Barbarian King","the Card Master","the Plague Rat","the Spirit Walker","the Headsman's Pride","the Arrow of Retribution","the Night Hunter","the Tiny Master of Evil","the Eye of the Void","the Piltover Enforcer","the Machine Herald","the Crimson Reaper","the Thunder's Roar","the Blood Hunter","the Monkey King","the Magus Ascendant","the Seneschal of Demacia","the Unforgiven","the Gravedigger","the Secret Weapon","the Master of Shadows","the Hexplosives Expert","the Chronokeeper","Rise of the Thorns"};
    private String[]passivename = {"Blood Well","Essence Theft","Twin Disciplines","Trample","Cursed Touch","Rebirth","Pyromania","Focus","Shurima's Legacy","Mana Barrier","Blaze","Concussive Blows","Headshot","Aspect of the Serpent","Carnivore","Hextech Shrapnel Shells","Hemorrhage","Moonsilver Blade","Infected Cleaver","League of Draven","Spider Swarm","Shadow Walk","Rising Spell Force","Dread","Duelist","Nimble Fighter","Runic Skin","Grog-Soaked Blade","Perseverance","Rage Gene","Happy Hour","True Grit","Warpath","Techmaturgical Repair Bots","Ionian Fervor","Tailwind","Martial Cadence","Relentless Assault","Hextech Capacitor","Get Excited!","Martial Pose","Gathering Fire","Death Defied","Void Stone","Voracity","Holy Fervor","Mark of the Storm","Unseen Threat","Icathian Surprise","Mirror Image","Flurry","Sunlight","Iceborn","Lightslinger","Pix, Faerie Companion","Illumination","Granite Shield","Summon Voidling","Sap Magic","Double Strike","Strut","Iron Man","Soul Siphon","Surging Tides","Soul Eater","Staggering Blow","Prowl","Umbra Blades","Visionary","Berserker Rage","Clockwork Windup","Aegis Protection","Valiant Fighter","Harrier","Spiked Shell","Fury of the Xer’Sai","Reign of Anger","Unseen Predator","Runic Blade","Junkyard Titan","Arcane Mastery","Frost","Backstab","Ki Strike","Dragonborn","Empowered Bulwark","Glory in Death","Fleet in Foot","Crystallizing Sting","Power Chord","Salvation","Carrion Renewal","Transcendent","Mercy","Gemcraft","Camouflage","Damnation","Draw a Bead","King's Tribute","Battle Fury","Loaded Dice","Deadly Venom","Monkey's Agility","Zaun-Touched Bolt Augmenter","Living Vengeance","Night Hunter","Equilibrium","Organic Deconstruction","Blast Shield","Glorious Evolution","Crimson Pact","Chosen of the Storm","Eternal Thirst","Stone Skin","Mana Surge","Challenge","Way of the Wanderer","Unholy Covenant","Cell Division","Contempt for the Weak","Short Fuse","Heightened Learning","Rise of the Thorns"};
    private String[]qnames = {"Dark Flight","Orb of Deception","Mark of the Assassin","Pulverize","Bandage Toss","Flash Frost","Disintegrate","Frost Shot","Conquering Sands","Rocket Grab","Sear","Winter's Bite","Piltover Peacemaker","Noxious Blast","Rupture","Phosphorus Bomb","Decimate","Crescent Strike","Burning Agony","Spinning Axe","Neurotoxin / Venomous Bite","Hate Spike","Mystic Shot","Terrify","Lunge","Urchin Strike","Resolute Smite","Parrrley","Decisive Strike","Boomerang Throw / Boulder Toss","Barrel Roll","Buckshot","Rampage","H-28G Evolution Turret","Bladesurge","Howling Gale","Dragon Strike","Leap Strike","To the Skies! / Shock Blast","Switcheroo!","Pierce","Inner Flame","Lay Waste","Null Sphere","Bouncing Blades","Reckoning","Thundering Shuriken","Taste Their Fear","Caustic Spittle","Sigil of Malice","Sonic Wave / Resonating Strike","Shield of Daybreak","Ice Shard","Piercing Light","Glitterlance","Light Binding","Seismic Shard","Call of the Void","Arcane Smash","Alpha Strike","Double Up","Mace of Spades","Dark Binding","Aqua Prison","Siphoning Strike","Dredge Line","Javelin Toss / Takedown","Duskbringer","Consume","Undertow","Command: Attack","Spear Shot","Devastating Blow","Blinding Assault","Powerball","Queen’s Wrath/Prey Seeker","Cull of the Meek","Savagery","Broken Wings","Flamespitter","Overload","Arctic Assault","Deceive","Vorpal Blade","Twin Bite","Poison Trail","Decimating Smash","Boomerang Blade","Crystal Slash","Hymn of Valor","Starcall","Decrepify","Dark Sphere","Noxian Diplomacy","Imbue","Blinding Dart","Death Sentence","Rapid Fire","Chomp","Bloodlust","Wild Cards","Ambush","Tiger Stance","Acid Hunter","Piercing Arrow","Tumble","Baleful Strike","Plasma Fission","Vault Breaker","Siphon Power","Transfusion","Rolling Thunder","Hungering Strike","Crushing Blow","Arcanopulse","Three Talon Strike","Steel Tempest","Omen of War","Stretching Strike","Razor Shuriken","Bouncing Bomb","Time Bomb","Deadly Blossom"};
    private String[]wnames = {"Blood Thirst / Blood Price","Fox-Fire","Twilight Shroud","Headbutt","Despair","Crystallize","Incinerate","Volley","Arise!","Overdrive","Pillar of Flame","Stand Behind Me","Yordle Snap Trap","Miasma","Feral Scream","Valkyrie","Crippling Strike","Pale Cascade","Masochism","Blood Rush","Volatile Spiderling / Skittering Frenzy","Dark Frenzy","Essence Flux","Drain","Riposte","Seastone Trident","Bulwark","Remove Scurvy","Courage","Hyper / Wallop","Drunken Rage","Smokescreen","Spirit of Dread","Hextech Micro-Rockets","Hiten Style","Zephyr","Golden Aegis","Empower","Lightning Field / Hyper Charge","Zap!","Sentinel","Focused Resolve","Wall of Pain","Nether Blade","Sinister Steel","Divine Blessing","Electrical Surge","Void Spike","Bio-Arcane Barrage","Distortion","Safeguard / Iron Will","Eclipse","Ring of Frost","Ardent Blaze","Whimsy","Prismatic Barrier","Brutal Strikes","Null Zone","Twisted Advance","Meditate","Impure Shots","Creeping Death","Tormented Soil","Ebb and Flow","Wither","Titan's Wrath","Bushwhack / Pounce","Shroud of Darkness","Blood Boil","Vicious Strikes","Command: Dissonance","Aegis of Zeonia","Paragon of Demacia","Heightened Senses","Defensive Ball Curl","Burrow/Unburrow","Ruthless Predator","Battle Roar","Ki Burst","Scrap Shield","Rune Prison","Flail of the Northern Winds","Jack In The Box","Feint","Burnout","Mega Adhesive","Soul Furnace","Richochet","Crystalline Exoskeleton","Aria of Perseverance","Astral Infusion","Torment","Force of Will","Rake","Shatter","Move Quick","Dark Passage","Rocket Jump","Frozen Domain","Mocking Shout","Pick A Card","Venom Cask","Turtle Stance","Terror Capacitor","Blighted Quiver","Silver Bolts","Dark Matter","Void Rift","Denting Blows","Gravity Field","Sanguine Pool","Frenzy","Hunters Call","Decoy","Eye of Destruction","Battle Cry","Wind Wall","Omen of Pestilence","Unstable Matter","Living Shadow","Satchel Charge","Rewind","Rampant Growth"};
    private String[]enames = {"Blades of Torment","Charm","Crescent Slash","Triumphant Roar","Tantrum","Frostbite","Molten Shield","Hawkshot","Shifting Sand","Power Fist","Pyroclasm","Unbreakable","90 Caliber Net","Twin Fang","Vorpal Spikes","Gatling Gun","Apprehend","Moonfall","Sadism","Stand Aside","Cocoon / Rappel","Ravage","Arcane Shift","Dark Wind","Burst of Speed","Playful/Trickster","Righteous Gust","Raise Morale","Judgement","Hop / Crunch","Body Slam","Quickdraw","Devestating Charge","CH-2 Electron Storm Grenade","Equilibrium Strike","Eye of the Storm","Demacian Standard","Counterstrike","Thundering Blow / Acceleration Gate","Flame Chompers!","Rend","Inspire","Defile","Force Pulse","Shunpo","Righteous Fury","Lightning Rush","Leap","Void Ooze","Ethereal Chains","Tempest / Cripple","Zenith Blade","Glacial Path","Relentless Pursuit","Help, Pix!","Lucent Singularity","Ground Slam","Malefic Visions","Sapling Toss","Wuju Style","Make it Rain","Children of the Grave","Black Shield","Tidecaller's Blessing","Spirit Fire","Riptide","Primal Surge / Swipe","Unspeakable Horror","Ice Blast","Reckless Swing","Command: Protect","Heartseeker Strike","Heroic Charge","Vault","Puncturing Taunt","Furious Bite/Tunnel","Slice and Dice","Bola Strike","Valor","Electro Harpoon","Spell Flux","Permafrost","Two-Shiv Poison","Shadow Dash","Flame Breath","Fling","Roar of the Slayer","Spell Shield","Fracture","Song of Celerity","Equinox","Torment","Scatter the Weak","Cutthroat","Dazzle","Toxic Shot","Flay","Explosive Shot","Pillar of Ice","Spinning Slash","Stacked Deck","Contaminate","Bear Stance","Noxian Corrosive Charge","Hail of Arrows","Condemn","Event Horizon","Tectonic Disruption","Excessive Force","Death Ray","Tides of Blood","Majestic Roar","Blood Scent","Nimbus Strike","Shocking Orb","Audacious Charge","Sweeping Blade","Omen of Famine","Elastic Slingshot","Shadow Slash","Hexplosive Minefield","Time Warp","Grasping Roots"};
    private String[]ultnames ={"Massacre","Spirit Rush","Shadow Dance","Unbreakable Will","Curse of the Sad Mummy","Glacial Storm","Summon Tibbers","Enchanted Crystal Arrow","Emperor's Divide","Static Field","Pyroclasm","Glacial Fissure","Ace in the Hole","Petrifying Gaze","Feast","Missile Barrage","Noxian Guillotine","Lunar Rush","Sadism","Whirling Death","Spider Form/Human Form","Agony's Embrace","Trueshot Barrage","Crowstorm","Blade Waltz","Chum the Waters","Idol of Durand","Cannon Barrage","Demacian Justice","GNAR!","Explosive Cask","Collateral Damage","Onslaught of Shadows","UPGRADE!!!","Transcendent Blades","Monsoon","Cataclysm","Grandmaster's Might","Mercury Cannon/Mercury Hammer","Super Mega Death Rocket!","Mantra","Fate's Call","Requiem","Riftwalk","Death Lotus","Intervention","Slicing Maelstrom","Void Assault","Living Artillery","Mimic","Dragon's Rage","Solar Flare","Frozen Tomb","The Culling","Wild Growth","Final Spark","Unstoppable Force","Nether Grasp","Vengeful Maelstrom","Highlander","Bullet Time","Children of the Grave","Soul Shackles","Tidal Wave","Fury of the Sands","Depth Charge","Aspect of the Cougar","Paranoia","Absolute Zero","Ragnarok","Command: Shockwave","Grand Skyfall","Diplomatic Immunity","Tag Team","Tremors","Void Rush","Dominus","Thrill of the Hunt","Blade of the Exile/Wind Slash","The Equalizer","Desparate Power","Glacial Prison","Hallucinate","Stand United","Dragon's Decent","Insanity Potion","Unstoppable Onslaught","On the Hunt","Impale","Crescendo","Wish","Ravenous Flock","Unleashed Power","Shadow Assault","Radiance","Noxious Trap","The Box","Buster Shot","Subjugate","Undying Rage","Destiny/Gate","Rat-Ta-Tat-Tat","Phoenix Stance","Hyper-Kinetic Position Reverser","Chain of Corruption","Final Hour","Primordial Burst","Lifeform Disintegration Ray","Assault and Battery","Chaos Storm","Hemoplague","Thunder Claws","Infinite Duress","Cyclone","Rite of the Arcane","Crescent Sweep","Last Breath","Omen of Death","Let’s Bounce!","Death Mark","Mega Inferno Bomb","Chrono Shift","Stranglethorns"};


    private int id;
    private String name;
    private String title;
    private String passive;
    private String q;
    private String w;
    private String e;
    private String ult;
    public champion(int id)
    {
        this.id=id;
        this.name=champnames[id];
        this.title=champtitle[id];
        this.passive=passivename[id];
        this.ult=ultnames[id];
        this.w=wnames[id];
        this.q=qnames[id];
        this.e=enames[id];
    }
    public champion()
    {
        Random r = new Random();
        int id = r.nextInt(123);
        this.id=id;
        this.name=champnames[id];
        this.title=champtitle[id];
        this.passive=passivename[id];
        this.ult=ultnames[id];
        this.w=wnames[id];
        this.q=qnames[id];
        this.e=enames[id];
    }
    public ArrayList<Integer> gen3(int x) {
        Random random = new Random();
        int count = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(x);
        while (count < 3) {
            int num = random.nextInt(123);
            if (!(list.contains(num))) {
                list.add(num);
                count++;
            }
        }
        return list;
    }
    public String get(int x)
    {
        switch(x){
            case 0:
                return title;

            case 1:
                return passive;

            case 2:
                return q;

            case 3:
                return w;

            case 4:
                return e;

            case 5:
                return ult;
        }
        return name;//default


    }
    public String getPassive(){return passive;}
    public int getId(){return id;}
    public String getName(){return name;}
    public String getTitle(){return title;}
    public String getQ(){return q;}
    public String getW(){return w;}
    public String getE(){return e;}
    public String getUlt(){return ult;}
    }
