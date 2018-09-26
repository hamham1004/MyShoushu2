package foo.bar2;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;

public class MyShoushu2 extends Activity implements OnTouchListener {
	ViewFlipper viewflipper;
	float posX;
    Animation in_from_left;
    Animation in_from_right;
    Animation out_to_left;
    Animation out_to_right;
	/** Called when the activity is first created. */
	private MediaPlayer mp1;
	private MediaPlayer mp2;
	private MediaPlayer mp3;
	private MediaPlayer mp4;
	private MediaPlayer mp5;
	private MediaPlayer mp6;
	private MediaPlayer mp7;
	private MediaPlayer mp10;
	private MediaPlayer mp11;
	private MediaPlayer mp12;
	private MediaPlayer mp13;
	private MediaPlayer mp14;
	private MediaPlayer mp15;
	private MediaPlayer mp16;
	private MediaPlayer mp17;
	private MediaPlayer mp21;
	private MediaPlayer mp22;
	private MediaPlayer mp23;
	private MediaPlayer mp24;
	private MediaPlayer mp25;
	private MediaPlayer mp26;
	private MediaPlayer mp27;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        viewflipper = (ViewFlipper)this.findViewById(R.id.viewflipper);

        viewflipper.setOnTouchListener(this);

        in_from_left = AnimationUtils.loadAnimation(this, R.anim.in_from_left);
        in_from_right = AnimationUtils.loadAnimation(this, R.anim.in_from_right);
        out_to_left = AnimationUtils.loadAnimation(this, R.anim.out_to_left);
        out_to_right = AnimationUtils.loadAnimation(this, R.anim.out_to_right);

    }

    @Override
    public void onStart() {
        super.onStart();

        	Button bButton1 = (Button)findViewById(R.id.bButton1);
        	mp1 = MediaPlayer.create(this, R.raw.beatriz_1);

        	bButton1.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
                	mp1.seekTo(0);
        			mp1.start();
        		}
        	});

        	Button bButton2 = (Button)findViewById(R.id.bButton2);
        	mp2 = MediaPlayer.create(this, R.raw.beatriz_2);

        	bButton2.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp2.seekTo(0);
        			mp2.start();
        		}
        	});

        	Button bButton3 = (Button)findViewById(R.id.bButton3);
        	mp3 = MediaPlayer.create(this, R.raw.beatriz_3);

        	bButton3.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp3.seekTo(0);
        			mp3.start();
        		}
        	});

        	Button bButton4 = (Button)findViewById(R.id.bButton4);
        	mp4 = MediaPlayer.create(this, R.raw.beatriz_4);

        	bButton4.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp4.seekTo(0);
        			mp4.start();
        		}
        	});

        	Button bButton5 = (Button)findViewById(R.id.bButton5);
        	mp5 = MediaPlayer.create(this, R.raw.beatriz_jido);

        	bButton5.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp5.seekTo(0);
        			mp5.start();
                }
        	});

        	Button bButton6 = (Button)findViewById(R.id.bButton6);
        	mp6 = MediaPlayer.create(this, R.raw.beatriz_syupa);

        	bButton6.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp6.seekTo(0);
        			mp6.start();
        		}
        	});

        	Button bButton7 = (Button)findViewById(R.id.bButton7);
        	mp7 = MediaPlayer.create(this, R.raw.beatriz_plug);

        	bButton7.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp7.seekTo(0);
        			mp7.start();
        		}
        	});

        	Button bButton10 = (Button)findViewById(R.id.bButton10);
        	mp10 = MediaPlayer.create(this, R.raw.sound_st);

        	bButton10.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp10.seekTo(0);
        			mp10.start();
        		}
        	});


        	Button bButton11 = (Button)findViewById(R.id.bButton11);
        	mp11 = MediaPlayer.create(this, R.raw.leonor_1);

        	bButton11.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp11.seekTo(0);
        			mp11.start();
        		}
        	});

        	Button bButton12 = (Button)findViewById(R.id.bButton12);
        	mp12 = MediaPlayer.create(this, R.raw.leonor_2);

        	bButton12.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp12.seekTo(0);
        			mp12.start();
        		}
        	});

        	Button bButton13 = (Button)findViewById(R.id.bButton13);
        	mp13 = MediaPlayer.create(this, R.raw.leonor_3);

        	bButton13.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp13.seekTo(0);
        			mp13.start();
        		}
        	});

        	Button bButton14 = (Button)findViewById(R.id.bButton14);
        	mp14 = MediaPlayer.create(this, R.raw.leonor_4);

        	bButton14.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp14.seekTo(0);
        			mp14.start();
        		}
        	});

        	Button bButton15 = (Button)findViewById(R.id.bButton15);
        	mp15 = MediaPlayer.create(this, R.raw.leonor_jido);

        	bButton15.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp15.seekTo(0);
        			mp15.start();
        		}
        	});

        	Button bButton16 = (Button)findViewById(R.id.bButton16);
        	mp16 = MediaPlayer.create(this, R.raw.leonor_syupa);

        	bButton16.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp16.seekTo(0);
        			mp16.start();
        		}
        	});


        	Button bButton17 = (Button)findViewById(R.id.bButton17);
        	mp17 = MediaPlayer.create(this, R.raw.leonor_plug);

        	bButton17.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp17.seekTo(0);
        			mp17.start();
        		}
        	});

        	Button bButton18 = (Button)findViewById(R.id.bButton18);

        	bButton18.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp10.seekTo(0);
        			mp10.start();
        		}
        	});

        	Button bButton21 = (Button)findViewById(R.id.bButton21);
        	mp21 = MediaPlayer.create(this, R.raw.margarida_1);

        	bButton21.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp21.seekTo(0);
        			mp21.start();
        		}
        	});

        	Button bButton22 = (Button)findViewById(R.id.bButton22);
        	mp22 = MediaPlayer.create(this, R.raw.margarida_2);

        	bButton22.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp22.seekTo(0);
        			mp22.start();
        		}
        	});

        	Button bButton23 = (Button)findViewById(R.id.bButton23);
        	mp23 = MediaPlayer.create(this, R.raw.margarida_3);

        	bButton23.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp23.seekTo(0);
        			mp23.start();
        		}
        	});

        	Button bButton24 = (Button)findViewById(R.id.bButton24);
        	mp24 = MediaPlayer.create(this, R.raw.margarida_4);

        	bButton24.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp24.seekTo(0);
        			mp24.start();
        		}
        	});

        	Button bButton25 = (Button)findViewById(R.id.bButton25);
        	mp25 = MediaPlayer.create(this, R.raw.margarida_jido);

        	bButton25.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp25.seekTo(0);
        			mp25.start();
        		}
        	});

        	Button bButton26 = (Button)findViewById(R.id.bButton26);
        	mp26 = MediaPlayer.create(this, R.raw.margarida_syupa);

        	bButton26.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp26.seekTo(0);
        			mp26.start();
        		}
        	});

        	Button bButton27 = (Button)findViewById(R.id.bButton27);
        	mp27 = MediaPlayer.create(this, R.raw.margarida_plug);

        	bButton27.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp27.seekTo(0);
        			mp27.start();
        		}
        	});

        	Button bButton28 = (Button)findViewById(R.id.bButton28);

        	bButton28.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp10.seekTo(0);
        			mp10.start();
        		}
        	});
        }

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		switch (event.getAction()) {
			case MotionEvent.ACTION_DOWN:
				posX = event.getX();
				break;
			case MotionEvent.ACTION_UP:
				if ( posX > event.getX() ){
					viewflipper.setInAnimation(in_from_right);
					viewflipper.setOutAnimation(out_to_left);
					viewflipper.showNext();
				}else if (posX < event.getX() ){
					viewflipper.setInAnimation(in_from_left);
					viewflipper.setOutAnimation(out_to_right);
					viewflipper.showPrevious();
				}
				break;
		}
		return true;
	}

	@Override
	protected void onStop() {
		super.onStop();
		mp1.release();
		mp2.release();
		mp3.release();
		mp4.release();
		mp5.release();
		mp6.release();
		mp7.release();
		mp10.release();
		mp11.release();
		mp12.release();
		mp13.release();
		mp14.release();
		mp15.release();
		mp16.release();
		mp17.release();
		mp21.release();
		mp22.release();
		mp23.release();
		mp24.release();
		mp25.release();
		mp26.release();
		mp27.release();
	}


}

