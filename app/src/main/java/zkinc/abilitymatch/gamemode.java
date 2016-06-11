package zkinc.abilitymatch;

import android.content.Intent;
import android.graphics.Color;
import android.os.CountDownTimer;
import android.os.Vibrator;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;


public class gamemode extends ActionBarActivity {
    int gamemode=0;//SET THIS TO WHAT GAMEMODE USER CHOOSES   6 TOTAL
    CountDownTimer timer;
    champion champ = new champion();
    long seconds;
    int points=0;
    String[] buttonTexts;
    ArrayList<Integer> collection=new ArrayList<>();
    ArrayList<Button> buttons=new ArrayList<>();
    private String[] champnames = {"Aatrox","Ahri", "Akali", "Alistar", "Amumu", "Anivia","Annie","Ashe","Azir","Blitzcrank","Brand","Braum","Caitlyn","Cassiopeia","Cho'Gath","Corki","Darius","Diana","Dr. Mundo","Draven","Elise","Evelynn","Ezreal","Fiddlesticks","Fiora","Fizz","Galio","Gangplank","Garen","Gnar","Gragas","Graves","Hecarim","Heimerdinger","Irelia","Janna","Jarvan IV","Jax","Jayce","Jinx","Kalista","Karma","Karthus","Kassadin","Katarina","Kayle","Kennen","Kha'Zix","Kog'Maw","LeBlanc","Lee Sin","Leona","Lissandra","Lucian","Lulu","Lux","Malphite","Malzahar","Maokai","Master Yi","Miss Fortune","Mordekaiser","Morgana","Nami","Nasus","Nautilus","Nidalee","Nocturne","Nunu","Olaf","Orianna","Pantheon","Poppy","Quinn","Rammus","Rek'Sai","Renekton","Rengar","Riven","Rumble","Ryze","Sejuani","Shaco","Shen","Shyvana","Singed","Sion","Sivir","Skarner","Sona","Soraka","Swain","Syndra","Talon","Taric","Teemo","Thresh","Tristana","Trundle","Tryndamere","Twisted Fate","Twitch","Udyr","Urgot","Varus","Vayne","Veigar","Vel'Koz","Vi","Viktor","Vladimir","Volibear","Warwick","Wukong","Xerath","Xin Zhao","Yasuo","Yorick","Zac","Zed","Ziggs","Zilean","Zyra"};
    private String[]champtitle= {"the Darkin Blade","the Nine-Tailed Fox","the Fist of Shadow","the Minotaur","the Sad Mummy","the Cryophoenix","the Dark Child","the Frost Archer","the Emperor of the Sands","the Great Steam Golem","the Burning Vengeance","the Heart of the Freljord","the Sheriff of Piltover","the Serpent's Embrace","the Terror of the Void","the Daring Bombardier","the Hand of Noxus","Scorn of the Moon","the Madman of Zaun","the Glorious Executioner","the Spider Queen","the Widowmaker","the Prodigal Explorer","the Harbinger of Doom","the Grand Duelist","the Tidal Trickster","the Sentinel's Sorrow","the Saltwater Scourge","the Might of Demacia","the Missing Link","the Rabble Rouser","the Outlaw","the Rabble Rouser","the Revered Inventor","the Will of the Blades","the Storm's Fury","the Exemplar of Demacia","Grandmaster at Arms","the Defender of Tomorrow","the Loose Cannon","the Spear of Vengeance","the Enlightened One","the Deathsinger","the Void Walker","the Sinister Blade","the Judicator","the Heart of the Tempest","the Voidreaver","the Mouth of the Abyss","the Deceiver","the Blind Monk","the Radiant Dawn","the Ice Witch","the Purifier","the Fae Sorceress","the Lady of Luminosity","Shard of the Monolith","the Prophet of the Void","the Twisted Treant","the Wuju Bladesman","the Bounty Hunter","the Master of Metal","Fallen Angel","the Tidecaller","the Curator of the Sands","the Titan of the Depths","the Bestial Huntress","the Eternal Nightmare","the Yeti Rider","the Berserker","the Lady of Clockwork","the Artisan of War","the Iron Ambassador","Demacia's Wings","the Armordillo","the Void Burrower","the Butcher of the Sands","the Pridestalker","the Exile","the Mechanized Menace","the Rogue Mage","the Winter's Wrath","the Demon Jester","Eye of Twilight","the Half-Dragon","the Mad Chemist","the Undead Juggernaut","the Battle Mistress","the Crystal Vanguard","Maven of the Strings","the Starchild","the Master Tactician","the Dark Sovereign","the Blade's Shadow","the Gem Knight","the Swift Scout","the Chain Warden","the Megling Gunner","the Troll King","the Barbarian King","the Card Master","the Plague Rat","the Spirit Walker","the Headsman's Pride","the Arrow of Retribution","the Night Hunter","the Tiny Master of Evil","the Eye of the Void","the Piltover Enforcer","the Machine Herald","the Crimson Reaper","the Thunder's Roar","the Blood Hunter","the Monkey King","the Magus Ascendant","the Seneschal of Demacia","the Unforgiven","the Gravedigger","the Secret Weapon","the Master of Shadows","the Hexplosives Expert","the Chronokeeper","Rise of the Thorns"};
    private String[]passivename = {"Blood Well","Essence Theft","Twin Disciplines","Trample","Cursed Touch","Rebirth","Pyromania","Focus","Shurima's Legacy","Mana Barrier","Blaze","Concussive Blows","Headshot","Aspect of the Serpent","Carnivore","Hextech Shrapnel Shells","Hemorrhage","Moonsilver Blade","Infected Cleaver","League of Draven","Spider Swarm","Shadow Walk","Rising Spell Force","Dread","Duelist","Nimble Fighter","Runic Skin","Grog-Soaked Blade","Perseverance","Rage Gene","Happy Hour","True Grit","Warpath","Techmaturgical Repair Bots","Ionian Fervor","Tailwind","Martial Cadence","Relentless Assault","Hextech Capacitor","Get Excited!","Martial Pose","Gathering Fire","Death Defied","Void Stone","Voracity","Holy Fervor","Mark of the Storm","Unseen Threat","Icathian Surprise","Mirror Image","Flurry","Sunlight","Iceborn","Lightslinger","Pix, Faerie Companion","Illumination","Granite Shield","Summon Voidling","Sap Magic","Double Strike","Strut","Iron Man","Soul Siphon","Surging Tides","Soul Eater","Staggering Blow","Prowl","Umbra Blades","Visionary","Berserker Rage","Clockwork Windup","Aegis Protection","Valiant Fighter","Harrier","Spiked Shell","Fury of the Xer’Sai","Reign of Anger","Unseen Predator","Runic Blade","Junkyard Titan","Arcane Mastery","Frost","Backstab","Ki Strike","Dragonborn","Empowered Bulwark","Glory in Death","Fleet in Foot","Crystallizing Sting","Power Chord","Salvation","Carrion Renewal","Transcendent","Mercy","Gemcraft","Camouflage","Damnation","Draw a Bead","King's Tribute","Battle Fury","Loaded Dice","Deadly Venom","Monkey's Agility","Zaun-Touched Bolt Augmenter","Living Vengeance","Night Hunter","Equilibrium","Organic Deconstruction","Blast Shield","Glorious Evolution","Crimson Pact","Chosen of the Storm","Eternal Thirst","Stone Skin","Mana Surge","Challenge","Way of the Wanderer","Unholy Covenant","Cell Division","Contempt for the Weak","Short Fuse","Heightened Learning","Rise of the Thorns"};
    private String[]qnames = {"Dark Flight","Orb of Deception","Mark of the Assassin","Pulverize","Bandage Toss","Flash Frost","Disintegrate","Frost Shot","Conquering Sands","Rocket Grab","Sear","Winter's Bite","Piltover Peacemaker","Noxious Blast","Rupture","Phosphorus Bomb","Decimate","Crescent Strike","Burning Agony","Spinning Axe","Neurotoxin / Venomous Bite","Hate Spike","Mystic Shot","Terrify","Lunge","Urchin Strike","Resolute Smite","Parrrley","Decisive Strike","Boomerang Throw / Boulder Toss","Barrel Roll","Buckshot","Rampage","H-28G Evolution Turret","Bladesurge","Howling Gale","Dragon Strike","Leap Strike","To the Skies! / Shock Blast","Switcheroo!","Pierce","Inner Flame","Lay Waste","Null Sphere","Bouncing Blades","Reckoning","Thundering Shuriken","Taste Their Fear","Caustic Spittle","Sigil of Malice","Sonic Wave / Resonating Strike","Shield of Daybreak","Ice Shard","Piercing Light","Glitterlance","Light Binding","Seismic Shard","Call of the Void","Arcane Smash","Alpha Strike","Double Up","Mace of Spades","Dark Binding","Aqua Prison","Siphoning Strike","Dredge Line","Javelin Toss / Takedown","Duskbringer","Consume","Undertow","Command: Attack","Spear Shot","Devastating Blow","Blinding Assault","Powerball","Queen’s Wrath/Prey Seeker","Cull of the Meek","Savagery","Broken Wings","Flamespitter","Overload","Arctic Assault","Deceive","Vorpal Blade","Twin Bite","Poison Trail","Decimating Smash","Boomerang Blade","Crystal Slash","Hymn of Valor","Starcall","Decrepify","Dark Sphere","Noxian Diplomacy","Imbue","Blinding Dart","Death Sentence","Rapid Fire","Chomp","Bloodlust","Wild Cards","Ambush","Tiger Stance","Acid Hunter","Piercing Arrow","Tumble","Baleful Strike","Plasma Fission","Vault Breaker","Siphon Power","Transfusion","Rolling Thunder","Hungering Strike","Crushing Blow","Arcanopulse","Three Talon Strike","Steel Tempest","Omen of War","Stretching Strike","Razor Shuriken","Bouncing Bomb","Time Bomb","Deadly Blossom"};
    private String[]wnames = {"Blood Thirst / Blood Price","Fox-Fire","Twilight Shroud","Headbutt","Despair","Crystallize","Incinerate","Volley","Arise!","Overdrive","Pillar of Flame","Stand Behind Me","Yordle Snap Trap","Miasma","Feral Scream","Valkyrie","Crippling Strike","Pale Cascade","Masochism","Blood Rush","Volatile Spiderling / Skittering Frenzy","Dark Frenzy","Essence Flux","Drain","Riposte","Seastone Trident","Bulwark","Remove Scurvy","Courage","Hyper / Wallop","Drunken Rage","Smokescreen","Spirit of Dread","Hextech Micro-Rockets","Hiten Style","Zephyr","Golden Aegis","Empower","Lightning Field / Hyper Charge","Zap!","Sentinel","Focused Resolve","Wall of Pain","Nether Blade","Sinister Steel","Divine Blessing","Electrical Surge","Void Spike","Bio-Arcane Barrage","Distortion","Safeguard / Iron Will","Eclipse","Ring of Frost","Ardent Blaze","Whimsy","Prismatic Barrier","Brutal Strikes","Null Zone","Twisted Advance","Meditate","Impure Shots","Creeping Death","Tormented Soil","Ebb and Flow","Wither","Titan's Wrath","Bushwhack / Pounce","Shroud of Darkness","Blood Boil","Vicious Strikes","Command: Dissonance","Aegis of Zeonia","Paragon of Demacia","Heightened Senses","Defensive Ball Curl","Burrow/Unburrow","Ruthless Predator","Battle Roar","Ki Burst","Scrap Shield","Rune Prison","Flail of the Northern Winds","Jack In The Box","Feint","Burnout","Mega Adhesive","Soul Furnace","Richochet","Crystalline Exoskeleton","Aria of Perseverance","Astral Infusion","Torment","Force of Will","Rake","Shatter","Move Quick","Dark Passage","Rocket Jump","Frozen Domain","Mocking Shout","Pick A Card","Venom Cask","Turtle Stance","Terror Capacitor","Blighted Quiver","Silver Bolts","Dark Matter","Void Rift","Denting Blows","Gravity Field","Sanguine Pool","Frenzy","Hunters Call","Decoy","Eye of Destruction","Battle Cry","Wind Wall","Omen of Pestilence","Unstable Matter","Living Shadow","Satchel Charge","Rewind","Rampant Growth"};
    private String[]enames = {"Blades of Torment","Charm","Crescent Slash","Triumphant Roar","Tantrum","Frostbite","Molten Shield","Hawkshot","Shifting Sand","Power Fist","Pyroclasm","Unbreakable","90 Caliber Net","Twin Fang","Vorpal Spikes","Gatling Gun","Apprehend","Moonfall","Sadism","Stand Aside","Cocoon / Rappel","Ravage","Arcane Shift","Dark Wind","Burst of Speed","Playful/Trickster","Righteous Gust","Raise Morale","Judgement","Hop / Crunch","Body Slam","Quickdraw","Devestating Charge","CH-2 Electron Storm Grenade","Equilibrium Strike","Eye of the Storm","Demacian Standard","Counterstrike","Thundering Blow / Acceleration Gate","Flame Chompers!","Rend","Inspire","Defile","Force Pulse","Shunpo","Righteous Fury","Lightning Rush","Leap","Void Ooze","Ethereal Chains","Tempest / Cripple","Zenith Blade","Glacial Path","Relentless Pursuit","Help, Pix!","Lucent Singularity","Ground Slam","Malefic Visions","Sapling Toss","Wuju Style","Make it Rain","Children of the Grave","Black Shield","Tidecaller's Blessing","Spirit Fire","Riptide","Primal Surge / Swipe","Unspeakable Horror","Ice Blast","Reckless Swing","Command: Protect","Heartseeker Strike","Heroic Charge","Vault","Puncturing Taunt","Furious Bite/Tunnel","Slice and Dice","Bola Strike","Valor","Electro Harpoon","Spell Flux","Permafrost","Two-Shiv Poison","Shadow Dash","Flame Breath","Fling","Roar of the Slayer","Spell Shield","Fracture","Song of Celerity","Equinox","Torment","Scatter the Weak","Cutthroat","Dazzle","Toxic Shot","Flay","Explosive Shot","Pillar of Ice","Spinning Slash","Stacked Deck","Contaminate","Bear Stance","Noxian Corrosive Charge","Hail of Arrows","Condemn","Event Horizon","Tectonic Disruption","Excessive Force","Death Ray","Tides of Blood","Majestic Roar","Blood Scent","Nimbus Strike","Shocking Orb","Audacious Charge","Sweeping Blade","Omen of Famine","Elastic Slingshot","Shadow Slash","Hexplosive Minefield","Time Warp","Grasping Roots"};
    private String[]ultnames ={"Massacre","Spirit Rush","Shadow Dance","Unbreakable Will","Curse of the Sad Mummy","Glacial Storm","Summon Tibbers","Enchanted Crystal Arrow","Emperor's Divide","Static Field","Pyroclasm","Glacial Fissure","Ace in the Hole","Petrifying Gaze","Feast","Missile Barrage","Noxian Guillotine","Lunar Rush","Sadism","Whirling Death","Spider Form/Human Form","Agony's Embrace","Trueshot Barrage","Crowstorm","Blade Waltz","Chum the Waters","Idol of Durand","Cannon Barrage","Demacian Justice","GNAR!","Explosive Cask","Collateral Damage","Onslaught of Shadows","UPGRADE!!!","Transcendent Blades","Monsoon","Cataclysm","Grandmaster's Might","Mercury Cannon/Mercury Hammer","Super Mega Death Rocket!","Mantra","Fate's Call","Requiem","Riftwalk","Death Lotus","Intervention","Slicing Maelstrom","Void Assault","Living Artillery","Mimic","Dragon's Rage","Solar Flare","Frozen Tomb","The Culling","Wild Growth","Final Spark","Unstoppable Force","Nether Grasp","Vengeful Maelstrom","Highlander","Bullet Time","Children of the Grave","Soul Shackles","Tidal Wave","Fury of the Sands","Depth Charge","Aspect of the Cougar","Paranoia","Absolute Zero","Ragnarok","Command: Shockwave","Grand Skyfall","Diplomatic Immunity","Tag Team","Tremors","Void Rush","Dominus","Thrill of the Hunt","Blade of the Exile/Wind Slash","The Equalizer","Desparate Power","Glacial Prison","Hallucinate","Stand United","Dragon's Decent","Insanity Potion","Unstoppable Onslaught","On the Hunt","Impale","Crescendo","Wish","Ravenous Flock","Unleashed Power","Shadow Assault","Radiance","Noxious Trap","The Box","Buster Shot","Subjugate","Undying Rage","Destiny/Gate","Rat-Ta-Tat-Tat","Phoenix Stance","Hyper-Kinetic Position Reverser","Chain of Corruption","Final Hour","Primordial Burst","Lifeform Disintegration Ray","Assault and Battery","Chaos Storm","Hemoplague","Thunder Claws","Infinite Duress","Cyclone","Rite of the Arcane","Crescent Sweep","Last Breath","Omen of Death","Let’s Bounce!","Death Mark","Mega Inferno Bomb","Chrono Shift","Stranglethorns"};

    Random random = new Random();
    Random random1 = new Random();
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    TextView champname;
    TextView countdown;
    TextView score;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamemode);
        final Vibrator vibrator = (Vibrator)getSystemService(VIBRATOR_SERVICE);
        getWindow().getDecorView().setBackgroundColor(Color.parseColor("#003366"));
        Intent getMode = getIntent();
        gamemode= getMode.getIntExtra("gamemode",0);
        b1 = (Button)findViewById(R.id.button);
        b2 = (Button)findViewById(R.id.button2);
        b3 = (Button)findViewById(R.id.button3);
        b4 = (Button)findViewById(R.id.button4);
        champname = (TextView)findViewById(R.id.Champname);
        countdown = (TextView)findViewById(R.id.countdown);
        score = (TextView)findViewById(R.id.score);
        champname.setText(champ.getName());
        setTexts();
        timer = new CountDownTimer(30000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                seconds=millisUntilFinished;
                String timeAsSecond=Long.toString(millisUntilFinished/1000);
                countdown.setText("Time: "+timeAsSecond);
            }

            @Override
            public void onFinish() {
                timer.cancel();
                Intent i = new Intent(gamemode.this,end.class);
                i.putExtra("gamemode",gamemode);
                startActivity(i);
            }
        };
        timer.start();
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                vibrator.vibrate(100);
                if(b1.getText().toString().equals(champ.get(gamemode))){
                    points++;
                    champ=new champion();
                    setTexts();
                }
                else{
                    timerWrong();
                    b1.setText("WRONG");
                    b1.setBackgroundColor(Color.RED);
                }

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                vibrator.vibrate(100);
                if(b2.getText().toString().equals(champ.get(gamemode))){
                    points++;
                    champ=new champion();
                    setTexts();
                }
                else{
                    timerWrong();
                    b2.setText("WRONG");
                    b2.setBackgroundColor(Color.RED);
                }

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                vibrator.vibrate(100);
                if(b3.getText().toString().equals(champ.get(gamemode))){
                    points++;
                    champ=new champion();
                    setTexts();
                }
                else{
                    timerWrong();
                    b3.setText("WRONG");
                    b3.setBackgroundColor(Color.RED);
                }

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                vibrator.vibrate(100);
                if(b3.getText().toString().equals(champ.get(gamemode))){
                    points++;
                    champ=new champion();
                    setTexts();
                }
                else{
                    timerWrong();
                    b3.setText("WRONG");
                    b3.setBackgroundColor(Color.RED);
                }

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                vibrator.vibrate(100);
                if(b4.getText().toString().equals(champ.get(gamemode))){
                    points++;
                    champ=new champion();
                    setTexts();
                }
                else{
                    timerWrong();
                    b4.setText("WRONG");
                    b4.setBackgroundColor(Color.RED);
                }

            }
        });



        }
    public void setTexts(){
        score.setText("Score: "+Integer.toString(points));
        champname.setText(champ.getName());
        collection.add(0);collection.add(1);collection.add(2);collection.add(3);
        buttons.add(b1);buttons.add(b2);buttons.add(b3);buttons.add(b4);
        ArrayList<Integer> other = champ.gen3(champ.getId());
        switch(gamemode) {//set buttons for first time
            case 0://title
                buttonTexts = new String[]{getTitle(other.get(0)), getTitle(other.get(1)), getTitle(other.get(2)), getTitle(other.get(3))};
                break;
            case 1://passive
                buttonTexts = new String[]{getPassive(other.get(0)), getPassive(other.get(1)), getPassive(other.get(2)), getPassive(other.get(3))};

                break;
            case 2://q
                buttonTexts = new String[]{getQ(other.get(0)), getQ(other.get(1)), getQ(other.get(2)), getQ(other.get(3))};

                break;
            case 3://w
                buttonTexts = new String[]{getW(other.get(0)), getW(other.get(1)), getW(other.get(2)), getW(other.get(3))};

                break;
            case 4://e
                buttonTexts = new String[]{getE(other.get(0)), getE(other.get(1)), getE(other.get(2)), getE(other.get(3))};

                break;
            case 5://ult
                buttonTexts = new String[]{getUlt(other.get(0)), getUlt(other.get(1)), getUlt(other.get(2)), getUlt(other.get(3))};
                break;
        }
        for(int i = 0;i<4;i++){
            int ran = random.nextInt(4-i);
            int ran1 = random1.nextInt(4-i);
            buttons.get(ran).setText(buttonTexts[collection.get(ran1)]);
            collection.remove(ran1);
            buttons.remove(ran);
        }
        b1.setBackgroundColor(Color.TRANSPARENT);
        b2.setBackgroundColor(Color.TRANSPARENT);
        b3.setBackgroundColor(Color.TRANSPARENT);
        b4.setBackgroundColor(Color.TRANSPARENT);

    }
    public void timerWrong(){
        timer.cancel();
        timer = new CountDownTimer(seconds-5000,1000) {
            public void onTick(long millisUntilFinished) {
                seconds=millisUntilFinished;
                String timeAsSecond=Long.toString(millisUntilFinished/1000);
                countdown.setText("Time: "+timeAsSecond);
            }
            public void onFinish() {
                Intent i = new Intent(gamemode.this,end.class);
                i.putExtra("score",points);
                i.putExtra("gamemode",gamemode);
                timer.cancel();
                startActivity(i);

            }
        };
        timer.start();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_gamemode, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public String getPassive(int y){return passivename[y];}
    public String getName(int y){return champnames[y];}
    public String getTitle(int y){return champtitle[y];}
    public String getQ(int y){return qnames[y];}
    public String getW(int y){return wnames[y];}
    public String getE(int y){return enames[y];}
    public String getUlt(int y){return ultnames[y];}
}
