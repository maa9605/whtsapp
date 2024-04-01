package X;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.contact.picker.SharedFilePreviewDialogFragment;
import com.whatsapp.util.ViewOnClickCListenerShape3S0200000_I0;
import com.whatsapp.voicerecorder.VoiceNoteSeekBar;
import java.io.File;

/* renamed from: X.2Vy */
/* loaded from: classes2.dex */
public class C2Vy extends AbstractC51322Vz {
    public LinearLayout A00;
    public SharedFilePreviewDialogFragment A01;
    public C09560eJ A02;
    public C42381ve A03;
    public C03120Eg A04;
    public C002301c A05;
    public C42461vm A06;

    public C2Vy(Context context) {
        super(context);
    }

    public void A00(SharedFilePreviewDialogFragment sharedFilePreviewDialogFragment, File file) {
        long j;
        this.A01 = sharedFilePreviewDialogFragment;
        ActivityC02330At A09 = sharedFilePreviewDialogFragment.A09();
        if (A09 != null) {
            A09.getLayoutInflater().inflate(R.layout.audio_data_view, (ViewGroup) this, true);
            this.A00 = (LinearLayout) findViewById(R.id.display);
            ImageView imageView = (ImageView) findViewById(R.id.image);
            ImageView imageView2 = (ImageView) findViewById(R.id.icon);
            TextView textView = (TextView) findViewById(R.id.audio_length);
            if (Build.VERSION.SDK_INT >= 21) {
                this.A00.setClipToOutline(true);
            }
            onConfigurationChanged(getResources().getConfiguration());
            if (file != null) {
                j = file.length();
            } else {
                j = 0;
            }
            String A0k = C02180Ae.A0k(this.A05, j);
            int A03 = C0DD.A03(file);
            String A0g = AnonymousClass029.A0g(this.A05, A03);
            textView.setVisibility(0);
            textView.setText(A0g);
            C002301c c002301c = this.A05;
            int i = A03 * SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS;
            textView.setContentDescription(AnonymousClass029.A0i(c002301c, Math.max(0, i)));
            ((TextView) findViewById(R.id.file_size)).setText(A0k);
            imageView.setImageDrawable(new C0We(this.A05, C02160Ac.A03(sharedFilePreviewDialogFragment.A09(), R.drawable.audio_preview_background)));
            imageView.setContentDescription("");
            imageView2.setImageDrawable(new C0We(this.A05, C02160Ac.A03(sharedFilePreviewDialogFragment.A09(), R.drawable.ic_audio_forward_large)));
            final ImageButton imageButton = (ImageButton) findViewById(R.id.control_btn);
            final VoiceNoteSeekBar voiceNoteSeekBar = (VoiceNoteSeekBar) findViewById(R.id.audio_seekbar);
            final C09G A01 = C09560eJ.A01(file, "");
            if (!this.A04.A09(A01)) {
                this.A02 = this.A03.A00(sharedFilePreviewDialogFragment.A09(), true, false);
                C09560eJ A012 = this.A04.A01();
                if (A012 != null) {
                    A012.A05();
                }
                this.A04.A07(this.A02);
                this.A02.A0J = A01;
            } else {
                this.A02 = this.A04.A01();
            }
            voiceNoteSeekBar.setProgressColor(C02160Ac.A00(sharedFilePreviewDialogFragment.A09(), R.color.music_scrubber));
            setControlButtonToPlay(this, imageButton);
            voiceNoteSeekBar.setProgress(0);
            voiceNoteSeekBar.setMax(i);
            C09560eJ c09560eJ = this.A02;
            c09560eJ.A0H = new InterfaceC53562h9() { // from class: X.374
                public int A00 = -1;

                @Override // X.InterfaceC53562h9
                public void AJg(boolean z) {
                }

                {
                    C2Vy.this = this;
                }

                @Override // X.InterfaceC53562h9
                public C09G AA4() {
                    return A01;
                }

                @Override // X.InterfaceC53562h9
                public void AMl(int i2) {
                    C2Vy.setControlButtonToPlay(C2Vy.this, imageButton);
                }

                @Override // X.InterfaceC53562h9
                public void ANN(int i2) {
                    int i3 = this.A00;
                    int i4 = i2 / SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS;
                    if (i3 != i4) {
                        this.A00 = i4;
                    }
                    VoiceNoteSeekBar voiceNoteSeekBar2 = voiceNoteSeekBar;
                    voiceNoteSeekBar2.setProgress(i2);
                    voiceNoteSeekBar2.setContentDescription(voiceNoteSeekBar2.getContext().getString(R.string.voice_message_time_elapsed, AnonymousClass029.A0i(C2Vy.this.A05, i2)));
                }

                @Override // X.InterfaceC53562h9
                public void AOH() {
                    C2Vy.setControlButtonToPause(C2Vy.this, imageButton);
                }

                @Override // X.InterfaceC53562h9
                public void AOq(int i2) {
                    C2Vy.setControlButtonToPause(C2Vy.this, imageButton);
                    voiceNoteSeekBar.setMax(i2);
                    this.A00 = -1;
                }

                @Override // X.InterfaceC53562h9
                public void APA(int i2) {
                    C2Vy.setControlButtonToPlay(C2Vy.this, imageButton);
                    voiceNoteSeekBar.setProgress(0);
                }
            };
            voiceNoteSeekBar.setContentDescription(voiceNoteSeekBar.getContext().getString(R.string.voice_message_time_elapsed, AnonymousClass029.A0i(this.A05, c09560eJ.A03())));
            imageButton.setOnClickListener(new ViewOnClickCListenerShape3S0200000_I0(file, this, 3));
            voiceNoteSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: X.2qW
                public boolean A00;

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
                }

                {
                    C2Vy.this = this;
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onStartTrackingTouch(SeekBar seekBar) {
                    this.A00 = false;
                    C2Vy c2Vy = C2Vy.this;
                    C09560eJ A013 = c2Vy.A04.A01();
                    if (!c2Vy.A04.A08() || A013 == null) {
                        return;
                    }
                    A013.A04();
                    this.A00 = true;
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onStopTrackingTouch(SeekBar seekBar) {
                    C2Vy c2Vy = C2Vy.this;
                    if (!c2Vy.A04.A08() && this.A00) {
                        this.A00 = false;
                        c2Vy.A02.A0F(0);
                    }
                    C09560eJ A013 = c2Vy.A04.A01();
                    if (A013 != null) {
                        A013.A0E(voiceNoteSeekBar.getProgress());
                    }
                }
            });
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ViewGroup.LayoutParams layoutParams = this.A00.getLayoutParams();
        if (layoutParams != null) {
            if (configuration.orientation == 1) {
                layoutParams.height = this.A01.A01().getDimensionPixelSize(R.dimen.file_preview_display_height);
            } else {
                layoutParams.height = -1;
            }
            this.A00.setLayoutParams(layoutParams);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        C09560eJ c09560eJ = this.A02;
        if (c09560eJ != null) {
            c09560eJ.A05();
        }
        super.onDetachedFromWindow();
    }

    public static void setControlButtonToPause(C2Vy c2Vy, ImageButton imageButton) {
        imageButton.setImageResource(R.drawable.inline_audio_pause);
        imageButton.setContentDescription(imageButton.getContext().getString(R.string.pause));
    }

    public static void setControlButtonToPlay(C2Vy c2Vy, ImageButton imageButton) {
        imageButton.setImageDrawable(new C0We(c2Vy.A05, C02160Ac.A03(c2Vy.A01.A09(), R.drawable.inline_audio_play)));
        imageButton.setContentDescription(imageButton.getContext().getString(R.string.play));
    }
}
