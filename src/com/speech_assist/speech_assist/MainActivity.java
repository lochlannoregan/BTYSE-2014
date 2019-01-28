package com.speech_assist.speech_assist;

import java.util.Locale;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.speech.tts.TextToSpeech.OnInitListener;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener, OnInitListener {
	String save;
	//TTS object
private TextToSpeech myTTS;
    //status check code
private int MY_DATA_CHECK_CODE = 0;
    //create the Activity
public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    
    this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);
    this.getWindow().getDecorView()
    .setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION); 
           
      //check for TTS data
        Intent checkTTSIntent = new Intent();
        checkTTSIntent.setAction(TextToSpeech.Engine.ACTION_CHECK_TTS_DATA);
        startActivityForResult(checkTTSIntent, MY_DATA_CHECK_CODE);


//buttons for table view
Button the =(Button) findViewById(R.id.the);
the.setOnClickListener(new View.OnClickListener(){
    public void onClick(View v){
        EditText enter =(EditText) findViewById(R.id.enter);
        String save = enter.getText().toString();
        enter.setText(save + " the");
        enter.setSelection(enter.getText().length());
    }});

Button be =(Button) findViewById(R.id.be);
be.setOnClickListener(new View.OnClickListener(){
    public void onClick(View v){
        EditText enter =(EditText) findViewById(R.id.enter);
        String save = enter.getText().toString();
        enter.setText(save + " be");
        enter.setSelection(enter.getText().length());
    }});

Button to =(Button) findViewById(R.id.to);
to.setOnClickListener(new View.OnClickListener(){
    public void onClick(View v){
        EditText enter =(EditText) findViewById(R.id.enter);
        String save = enter.getText().toString();
        enter.setText(save + " to");
        enter.setSelection(enter.getText().length());
    }});

Button of =(Button) findViewById(R.id.of);
of.setOnClickListener(new View.OnClickListener(){
    public void onClick(View v){
        EditText enter =(EditText) findViewById(R.id.enter);
        String save = enter.getText().toString();
        enter.setText(save + " of");
        enter.setSelection(enter.getText().length());
    }});

Button and =(Button) findViewById(R.id.and);
and.setOnClickListener(new View.OnClickListener(){
    public void onClick(View v){
        EditText enter =(EditText) findViewById(R.id.enter);
        String save = enter.getText().toString();
        enter.setText(save + " and");
        enter.setSelection(enter.getText().length());
    }});

Button a =(Button) findViewById(R.id.a);
a.setOnClickListener(new View.OnClickListener(){
    public void onClick(View v){
        EditText enter =(EditText) findViewById(R.id.enter);
        String save = enter.getText().toString();
        enter.setText(save + " a");
        enter.setSelection(enter.getText().length());
    }});

Button in =(Button) findViewById(R.id.in);
in.setOnClickListener(new View.OnClickListener(){
    public void onClick(View v){
        EditText enter =(EditText) findViewById(R.id.enter);
        String save = enter.getText().toString();
        enter.setText(save + " in");
        enter.setSelection(enter.getText().length());
    }});

Button that =(Button) findViewById(R.id.that);
that.setOnClickListener(new View.OnClickListener(){
    public void onClick(View v){
        EditText enter =(EditText) findViewById(R.id.enter);
        String save = enter.getText().toString();
        enter.setText(save + " that");
        enter.setSelection(enter.getText().length());
    }});

Button have =(Button) findViewById(R.id.have);
have.setOnClickListener(new View.OnClickListener(){
    public void onClick(View v){
        EditText enter =(EditText) findViewById(R.id.enter);
        String save = enter.getText().toString();
        enter.setText(save + " have");
        enter.setSelection(enter.getText().length());
    }});

Button I =(Button) findViewById(R.id.I);
I.setOnClickListener(new View.OnClickListener(){
    public void onClick(View v){
        EditText enter =(EditText) findViewById(R.id.enter);
        String save = enter.getText().toString();
        enter.setText(save + " I");
        enter.setSelection(enter.getText().length());
    }});

Button it =(Button) findViewById(R.id.it);
it.setOnClickListener(new View.OnClickListener(){
    public void onClick(View v){
        EditText enter =(EditText) findViewById(R.id.enter);
        String save = enter.getText().toString();
        enter.setText(save + " it");
        enter.setSelection(enter.getText().length());
    }});

Button but =(Button) findViewById(R.id.but);
but.setOnClickListener(new View.OnClickListener(){
    public void onClick(View v){
        EditText enter =(EditText) findViewById(R.id.enter);
        String save = enter.getText().toString();
        enter.setText(save + " but");
        enter.setSelection(enter.getText().length());
    }});

Button not =(Button) findViewById(R.id.not);
not.setOnClickListener(new View.OnClickListener(){
    public void onClick(View v){
        EditText enter =(EditText) findViewById(R.id.enter);
        String save = enter.getText().toString();
        enter.setText(save + " not");
        enter.setSelection(enter.getText().length());
    }});

Button on =(Button) findViewById(R.id.on);
on.setOnClickListener(new View.OnClickListener(){
    public void onClick(View v){
        EditText enter =(EditText) findViewById(R.id.enter);
        String save = enter.getText().toString();
        enter.setText(save + " on");
        enter.setSelection(enter.getText().length());
    }});

Button with =(Button) findViewById(R.id.with);
with.setOnClickListener(new View.OnClickListener(){
    public void onClick(View v){
        EditText enter =(EditText) findViewById(R.id.enter);
        String save = enter.getText().toString();
        enter.setText(save + " with");
        enter.setSelection(enter.getText().length());
    }});

Button he =(Button) findViewById(R.id.he);
he.setOnClickListener(new View.OnClickListener(){
    public void onClick(View v){
        EditText enter =(EditText) findViewById(R.id.enter);
        String save = enter.getText().toString();
        enter.setText(save + " he");
        enter.setSelection(enter.getText().length());
    }});

Button as =(Button) findViewById(R.id.as);
as.setOnClickListener(new View.OnClickListener(){
    public void onClick(View v){
        EditText enter =(EditText) findViewById(R.id.enter);
        String save = enter.getText().toString();
        enter.setText(save + " as");
        enter.setSelection(enter.getText().length());
    }});

Button you =(Button) findViewById(R.id.you);
you.setOnClickListener(new View.OnClickListener(){
    public void onClick(View v){
        EditText enter =(EditText) findViewById(R.id.enter);
        String save = enter.getText().toString();
        enter.setText(save + " you");
        enter.setSelection(enter.getText().length());
    }});

Button his =(Button) findViewById(R.id.his);
his.setOnClickListener(new View.OnClickListener(){
    public void onClick(View v){
        EditText enter =(EditText) findViewById(R.id.enter);
        String save = enter.getText().toString();
        enter.setText(save + " his");
        enter.setSelection(enter.getText().length());
    }});

Button at =(Button) findViewById(R.id.at);
at.setOnClickListener(new View.OnClickListener(){
    public void onClick(View v){
        EditText enter =(EditText) findViewById(R.id.enter);
        String save = enter.getText().toString();
        enter.setText(save + " at");
        enter.setSelection(enter.getText().length());
    }});

Button by =(Button) findViewById(R.id.by);
by.setOnClickListener(new View.OnClickListener(){
    public void onClick(View v){
        EditText enter =(EditText) findViewById(R.id.enter);
        String save = enter.getText().toString();
        enter.setText(save + " by");
        enter.setSelection(enter.getText().length());
    }});

Button from =(Button) findViewById(R.id.from);
from.setOnClickListener(new View.OnClickListener(){
    public void onClick(View v){
        EditText enter =(EditText) findViewById(R.id.enter);
        String save = enter.getText().toString();
        enter.setText(save + " from");
        enter.setSelection(enter.getText().length());
    }});

Button they =(Button) findViewById(R.id.they);
they.setOnClickListener(new View.OnClickListener(){
    public void onClick(View v){
        EditText enter =(EditText) findViewById(R.id.enter);
        String save = enter.getText().toString();
        enter.setText(save + " they");
        enter.setSelection(enter.getText().length());
    }});

Button we =(Button) findViewById(R.id.we);
we.setOnClickListener(new View.OnClickListener(){
    public void onClick(View v){
        EditText enter =(EditText) findViewById(R.id.enter);
        String save = enter.getText().toString();
        enter.setText(save + " we");
        enter.setSelection(enter.getText().length());
    }});

Button say =(Button) findViewById(R.id.say);
say.setOnClickListener(new View.OnClickListener(){
    public void onClick(View v){
        EditText enter =(EditText) findViewById(R.id.enter);
        String save = enter.getText().toString();
        enter.setText(save + " say");
        enter.setSelection(enter.getText().length());
    }});

Button her =(Button) findViewById(R.id.her);
her.setOnClickListener(new View.OnClickListener(){
    public void onClick(View v){
        EditText enter =(EditText) findViewById(R.id.enter);
        String save = enter.getText().toString();
        enter.setText(save + " her");
        enter.setSelection(enter.getText().length());
    }});
Button she =(Button) findViewById(R.id.she);
she.setOnClickListener(new View.OnClickListener(){
    public void onClick(View v){
        EditText enter =(EditText) findViewById(R.id.enter);
        String save = enter.getText().toString();
        enter.setText(save + " she");
        enter.setSelection(enter.getText().length());
    }});

Button or =(Button) findViewById(R.id.or);
or.setOnClickListener(new View.OnClickListener(){
    public void onClick(View v){
        EditText enter =(EditText) findViewById(R.id.enter);
        String save = enter.getText().toString();
        enter.setText(save + " or");
        enter.setSelection(enter.getText().length());
    }});

Button an =(Button) findViewById(R.id.an);
an.setOnClickListener(new View.OnClickListener(){
    public void onClick(View v){
        EditText enter =(EditText) findViewById(R.id.enter);
        String save = enter.getText().toString();
        enter.setText(save + " an");
        enter.setSelection(enter.getText().length());
    }});

Button will =(Button) findViewById(R.id.will);
will.setOnClickListener(new View.OnClickListener(){
    public void onClick(View v){
        EditText enter =(EditText) findViewById(R.id.enter);
        String save = enter.getText().toString();
        enter.setText(save + " will");
        enter.setSelection(enter.getText().length());
    }});

Button my =(Button) findViewById(R.id.my);
my.setOnClickListener(new View.OnClickListener(){
    public void onClick(View v){
        EditText enter =(EditText) findViewById(R.id.enter);
        String save = enter.getText().toString();
        enter.setText(save + " my");
        enter.setSelection(enter.getText().length());
    }});

Button one =(Button) findViewById(R.id.one);
one.setOnClickListener(new View.OnClickListener(){
    public void onClick(View v){
        EditText enter =(EditText) findViewById(R.id.enter);
        String save = enter.getText().toString();
        enter.setText(save + " one");
        enter.setSelection(enter.getText().length());
    }});

Button all =(Button) findViewById(R.id.all);
all.setOnClickListener(new View.OnClickListener(){
    public void onClick(View v){
        EditText enter =(EditText) findViewById(R.id.enter);
        String save = enter.getText().toString();
        enter.setText(save + " all");
        enter.setSelection(enter.getText().length());
    }});

Button would =(Button) findViewById(R.id.would);
would.setOnClickListener(new View.OnClickListener(){
    public void onClick(View v){
        EditText enter =(EditText) findViewById(R.id.enter);
        String save = enter.getText().toString();
        enter.setText(save + " would");
        enter.setSelection(enter.getText().length());
    }});

Button there =(Button) findViewById(R.id.there);
there.setOnClickListener(new View.OnClickListener(){
    public void onClick(View v){
        EditText enter =(EditText) findViewById(R.id.enter);
        String save = enter.getText().toString();
        enter.setText(save + " there");
        enter.setSelection(enter.getText().length());
    }});

Button their =(Button) findViewById(R.id.their);
their.setOnClickListener(new View.OnClickListener(){
    public void onClick(View v){
        EditText enter =(EditText) findViewById(R.id.enter);
        String save = enter.getText().toString();
        enter.setText(save + " their");
        enter.setSelection(enter.getText().length());
    }});

Button what =(Button) findViewById(R.id.what);
what.setOnClickListener(new View.OnClickListener(){
    public void onClick(View v){
        EditText enter =(EditText) findViewById(R.id.enter);
        String save = enter.getText().toString();
        enter.setText(save + " what");
        enter.setSelection(enter.getText().length());
    }});

Button so =(Button) findViewById(R.id.so);
so.setOnClickListener(new View.OnClickListener(){
    public void onClick(View v){
        EditText enter =(EditText) findViewById(R.id.enter);
        String save = enter.getText().toString();
        enter.setText(save + " so");
        enter.setSelection(enter.getText().length());
    }});

Button up =(Button) findViewById(R.id.up);
up.setOnClickListener(new View.OnClickListener(){
    public void onClick(View v){
        EditText enter =(EditText) findViewById(R.id.enter);
        String save = enter.getText().toString();
        enter.setText(save + " up");
        enter.setSelection(enter.getText().length());
    }});

Button out =(Button) findViewById(R.id.out);
out.setOnClickListener(new View.OnClickListener(){
    public void onClick(View v){
        EditText enter =(EditText) findViewById(R.id.enter);
        String save = enter.getText().toString();
        enter.setText(save + " out");
        enter.setSelection(enter.getText().length());
    }});

Button time =(Button) findViewById(R.id.time);
time.setOnClickListener(new View.OnClickListener(){
    public void onClick(View v){
        EditText enter =(EditText) findViewById(R.id.enter);
        String save = enter.getText().toString();
        enter.setText(save + " time");
        enter.setSelection(enter.getText().length());
    }});

Button about =(Button) findViewById(R.id.about);
about.setOnClickListener(new View.OnClickListener(){
    public void onClick(View v){
        EditText enter =(EditText) findViewById(R.id.enter);
        String save = enter.getText().toString();
        enter.setText(save + " about");
        enter.setSelection(enter.getText().length());
    }});

Button who =(Button) findViewById(R.id.who);
who.setOnClickListener(new View.OnClickListener(){
    public void onClick(View v){
        EditText enter =(EditText) findViewById(R.id.enter);
        String save = enter.getText().toString();
        enter.setText(save + " who");
        enter.setSelection(enter.getText().length());
    }});

Button get =(Button) findViewById(R.id.get);
get.setOnClickListener(new View.OnClickListener(){
    public void onClick(View v){
        EditText enter =(EditText) findViewById(R.id.enter);
        String save = enter.getText().toString();
        enter.setText(save + " get");
        enter.setSelection(enter.getText().length());
    }});

Button which =(Button) findViewById(R.id.which);
which.setOnClickListener(new View.OnClickListener(){
    public void onClick(View v){
        EditText enter =(EditText) findViewById(R.id.enter);
        String save = enter.getText().toString();
        enter.setText(save + " which");
        enter.setSelection(enter.getText().length());
    }});

Button go =(Button) findViewById(R.id.go);
go.setOnClickListener(new View.OnClickListener(){
    public void onClick(View v){
        EditText enter =(EditText) findViewById(R.id.enter);
        String save = enter.getText().toString();
        enter.setText(save + " go");
        enter.setSelection(enter.getText().length());
    }});

Button me =(Button) findViewById(R.id.me);
me.setOnClickListener(new View.OnClickListener(){
    public void onClick(View v){
        EditText enter =(EditText) findViewById(R.id.enter);
        String save = enter.getText().toString();
        enter.setText(save + " me");
        enter.setSelection(enter.getText().length());
    }});

Button when =(Button) findViewById(R.id.when);
when.setOnClickListener(new View.OnClickListener(){
    public void onClick(View v){
        EditText enter =(EditText) findViewById(R.id.enter);
        String save = enter.getText().toString();
        enter.setText(save + " when");
        enter.setSelection(enter.getText().length());
    }});

Button make =(Button) findViewById(R.id.make);
make.setOnClickListener(new View.OnClickListener(){
    public void onClick(View v){
        EditText enter =(EditText) findViewById(R.id.enter);
        String save = enter.getText().toString();
        enter.setText(save + " make");
        enter.setSelection(enter.getText().length());
    }});

Button can =(Button) findViewById(R.id.can);
can.setOnClickListener(new View.OnClickListener(){
    public void onClick(View v){
        EditText enter =(EditText) findViewById(R.id.enter);
        String save = enter.getText().toString();
        enter.setText(save + " can");
        enter.setSelection(enter.getText().length());
    }});

Button like =(Button) findViewById(R.id.like);
like.setOnClickListener(new View.OnClickListener(){
    public void onClick(View v){
        EditText enter =(EditText) findViewById(R.id.enter);
        String save = enter.getText().toString();
        enter.setText(save + " like");
        enter.setSelection(enter.getText().length());
    }});}
@Override

//menu
public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.main, menu);
    return true;
}

@Override
public boolean onOptionsItemSelected(MenuItem item) {
    if (item.getItemId() == R.id.menu_settings) {
        startActivity(new Intent(this, About.class));
    }
    //clear option on action bar
    if (item.getItemId() == R.id.menu_clear) {
    	EditText enter=(EditText) findViewById(R.id.enter);
        enter.setText("");
    }
    if (item.getItemId() == R.id.menu_speak){
    	EditText enteredText = (EditText)findViewById(R.id.enter);
        String words = enteredText.getText().toString();
        speakWords(words);
    }
    
    return super.onOptionsItemSelected(item);

}



//respond to button clicks
public void onClick(View v) {
        //get the text entered
        EditText enteredText = (EditText)findViewById(R.id.enter);
        String words = enteredText.getText().toString();
        speakWords(words);
   }



    //speak the user text
private void speakWords(String speech) {
        //speak straight away
        myTTS.speak(speech, TextToSpeech.QUEUE_FLUSH, null);
}
    //act on result of TTS data check
protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    if (requestCode == MY_DATA_CHECK_CODE) {
        if (resultCode == TextToSpeech.Engine.CHECK_VOICE_DATA_PASS) {
            //the user has the necessary data - create the TTS
        myTTS = new TextToSpeech(this, this);
        }
        else {
                //no data - install it now
            Intent installTTSIntent = new Intent();
            installTTSIntent.setAction(TextToSpeech.Engine.ACTION_INSTALL_TTS_DATA);
            startActivity(installTTSIntent);
        }
    }
}
    //setup TTS
public void onInit(int initStatus) {
        //check for successful instantiation
    if (initStatus == TextToSpeech.SUCCESS) {
        if(myTTS.isLanguageAvailable(Locale.UK)==TextToSpeech.LANG_AVAILABLE)
            myTTS.setLanguage(Locale.UK);
    }
    else if (initStatus == TextToSpeech.ERROR) {
        Toast.makeText(this, "Sorry! Text To Speech failed...", Toast.LENGTH_LONG).show();}}};