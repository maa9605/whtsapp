package X;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.provider.MediaStore;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.AudioPickerActivity;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.components.SelectionCheckView;
import java.io.File;
import java.util.LinkedHashMap;

/* renamed from: X.1Js */
/* loaded from: classes.dex */
public class C26561Js {
    public C34671hu A00;
    public C34681hv A01;
    public final int A02;
    public final View A03;
    public final View A04;
    public final FrameLayout A05;
    public final ImageButton A06;
    public final ImageView A07;
    public final TextView A08;
    public final TextView A09;
    public final TextView A0A;
    public final TextView A0B;
    public final CircularProgressBar A0C;
    public final SelectionCheckView A0D;
    public final /* synthetic */ AudioPickerActivity A0E;

    public C26561Js(AudioPickerActivity audioPickerActivity, View view, int i) {
        this.A0E = audioPickerActivity;
        this.A02 = i;
        this.A04 = view;
        this.A05 = (FrameLayout) view.findViewById(R.id.audio_file_thumb_frame);
        this.A07 = (ImageView) this.A04.findViewById(R.id.audio_file_thumb);
        this.A0D = (SelectionCheckView) this.A04.findViewById(R.id.selection_check);
        this.A0B = (TextView) this.A04.findViewById(R.id.audio_file_title);
        this.A08 = (TextView) this.A04.findViewById(R.id.audio_file_artist);
        this.A09 = (TextView) this.A04.findViewById(R.id.audio_file_duration);
        this.A0A = (TextView) this.A04.findViewById(R.id.audio_file_size);
        this.A03 = this.A04.findViewById(R.id.bullet_duration_size);
        this.A04.findViewById(R.id.play_button_frame);
        this.A06 = (ImageButton) this.A04.findViewById(R.id.audio_file_play_btn);
        this.A0C = (CircularProgressBar) this.A04.findViewById(R.id.progress_bar);
    }

    public final void A00(long j) {
        AudioPickerActivity audioPickerActivity = this.A0E;
        this.A0C.setContentDescription(audioPickerActivity.getString(R.string.voice_message_time_elapsed, AnonymousClass029.A0i(((ActivityC02310Ar) audioPickerActivity).A01, j)));
    }

    public final void A01(Context context) {
        ImageButton imageButton = this.A06;
        AudioPickerActivity audioPickerActivity = this.A0E;
        imageButton.setContentDescription(audioPickerActivity.getString(R.string.pause));
        imageButton.setBackground(null);
        imageButton.setImageDrawable(new C0We(((ActivityC02310Ar) audioPickerActivity).A01, C02160Ac.A03(context, R.drawable.pause)));
        C02180Ae.A17(imageButton, C02160Ac.A00(audioPickerActivity, R.color.audio_picker_stop_button_tint));
        this.A0C.setVisibility(0);
    }

    public final void A02(Context context, boolean z) {
        ImageButton imageButton = this.A06;
        AudioPickerActivity audioPickerActivity = this.A0E;
        imageButton.setContentDescription(audioPickerActivity.getString(R.string.play));
        if (z) {
            imageButton.setBackground(new C0We(((ActivityC02310Ar) audioPickerActivity).A01, C02160Ac.A03(context, R.drawable.audio_picker_row_start_button_background)));
            imageButton.setImageDrawable(new C0We(((ActivityC02310Ar) audioPickerActivity).A01, C02160Ac.A03(context, R.drawable.play_button_audio)));
            C02180Ae.A17(imageButton, C02160Ac.A00(audioPickerActivity, R.color.audio_picker_default_button_tint));
            this.A0C.setVisibility(8);
            return;
        }
        imageButton.setBackground(null);
        imageButton.setImageDrawable(new C0We(((ActivityC02310Ar) audioPickerActivity).A01, C02160Ac.A03(context, R.drawable.toggle_play)));
        C02180Ae.A17(imageButton, C02160Ac.A00(audioPickerActivity, R.color.audio_picker_stop_button_tint));
        this.A0C.setVisibility(0);
    }

    public final void A03(View view) {
        String A0A;
        AudioPickerActivity audioPickerActivity = this.A0E;
        C26551Jr c26551Jr = audioPickerActivity.A07;
        C26541Jq A00 = c26551Jr.A00((Cursor) c26551Jr.getItem(this.A02));
        if (A00 != null) {
            LinkedHashMap linkedHashMap = audioPickerActivity.A0J;
            if (linkedHashMap.size() >= 30 && !linkedHashMap.containsKey(Integer.valueOf(A00.A00))) {
                ((ActivityC02290Ap) audioPickerActivity).A0A.A0E(((ActivityC02310Ar) audioPickerActivity).A01.A0A(R.plurals.max_files_to_send_error_message, 30L, 30), 0);
                return;
            }
            long j = A00.A01;
            C01B c01b = ((ActivityC02290Ap) audioPickerActivity).A0B;
            AnonymousClass039 anonymousClass039 = C01C.A3Y;
            if (j >= c01b.A07(anonymousClass039) * SearchActionVerificationClientService.MS_TO_NS) {
                ((ActivityC02290Ap) audioPickerActivity).A0A.A0E(audioPickerActivity.getString(R.string.max_file_size_to_send_error_message, Integer.valueOf(((ActivityC02290Ap) audioPickerActivity).A0B.A07(anonymousClass039))), 0);
                return;
            }
            int i = A00.A00;
            LinkedHashMap linkedHashMap2 = audioPickerActivity.A0J;
            Integer valueOf = Integer.valueOf(i);
            boolean containsKey = linkedHashMap2.containsKey(valueOf);
            A05(A00, !containsKey);
            if (containsKey) {
                audioPickerActivity.A0J.remove(valueOf);
                view.setSelected(false);
                view.setBackgroundResource(0);
                ((SelectionCheckView) view.findViewById(R.id.selection_check)).A03(false, true);
            } else {
                audioPickerActivity.A0J.put(valueOf, A00);
                view.setSelected(true);
                view.setBackgroundResource(R.color.audio_picker_row_selection);
                ((SelectionCheckView) view.findViewById(R.id.selection_check)).A03(true, true);
            }
            int size = audioPickerActivity.A0J.size();
            if (size == 0) {
                C02180Ae.A16(audioPickerActivity.A02, false, true);
                A0A = audioPickerActivity.getString(R.string.tap_to_select);
            } else {
                C02180Ae.A16(audioPickerActivity.A02, true, true);
                A0A = ((ActivityC02310Ar) audioPickerActivity).A01.A0A(R.plurals.n_selected, size, Integer.valueOf(size));
            }
            C0U1 A0c = audioPickerActivity.A0c();
            C000700j.A04(A0c, "supportActionBar is null");
            A0c.A0G(A0A);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.2vh, X.1hv] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.2vg, X.1hu] */
    public void A04(final C26541Jq c26541Jq, final ActivityC02290Ap activityC02290Ap) {
        TextView textView;
        View view = this.A04;
        view.setOnClickListener(new View.OnClickListener() { // from class: X.1Gx
            {
                C26561Js.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C26561Js.this.A03(view2);
            }
        });
        view.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.1Fb
            {
                C26561Js.this = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                C26561Js.this.A03(view2);
                return true;
            }
        });
        String str = c26541Jq.A03;
        File file = str != null ? new File(str) : null;
        int i = c26541Jq.A00;
        ?? r2 = new InterfaceC61152vg(i) { // from class: X.1hu
            public final long A00;

            {
                C26561Js.this = this;
                this.A00 = i;
            }

            @Override // X.InterfaceC61152vg
            public String ADR() {
                return Long.toString(this.A00);
            }

            @Override // X.InterfaceC61152vg
            public Bitmap AG1() {
                byte[] bArr = null;
                try {
                    C40831sw c40831sw = new C40831sw();
                    c40831sw.setDataSource(C26561Js.this.A0E.getApplicationContext(), ContentUris.withAppendedId(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, this.A00));
                    bArr = c40831sw.getEmbeddedPicture();
                    c40831sw.close();
                } catch (Exception | OutOfMemoryError unused) {
                }
                if (bArr == null) {
                    return C55922mP.A05;
                }
                try {
                    return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                } catch (OutOfMemoryError unused2) {
                    return C55922mP.A05;
                }
            }
        };
        this.A00 = r2;
        ?? r1 = new InterfaceC61162vh() { // from class: X.1hv
            @Override // X.InterfaceC61162vh
            public /* synthetic */ void AKC() {
            }

            {
                C26561Js.this = this;
            }

            @Override // X.InterfaceC61162vh
            public void A5d() {
                C26561Js c26561Js = C26561Js.this;
                ImageView imageView = c26561Js.A07;
                imageView.setImageBitmap(null);
                c26561Js.A05.setBackground(null);
                imageView.setBackgroundResource(0);
            }

            @Override // X.InterfaceC61162vh
            public void APF(Bitmap bitmap, boolean z) {
                C26561Js c26561Js = C26561Js.this;
                ImageView imageView = c26561Js.A07;
                imageView.setImageBitmap(bitmap);
                if (bitmap == C55922mP.A05) {
                    c26561Js.A05.setBackground(null);
                    imageView.setBackground(c26561Js.A0E.getResources().getDrawable(R.drawable.audio_picker_empty_thumb_background));
                    return;
                }
                FrameLayout frameLayout = c26561Js.A05;
                AudioPickerActivity audioPickerActivity = c26561Js.A0E;
                frameLayout.setBackground(audioPickerActivity.getResources().getDrawable(R.drawable.audio_picker_thumb_frame_background));
                imageView.setBackground(audioPickerActivity.getResources().getDrawable(R.drawable.audio_picker_filled_thumb_background));
            }
        };
        this.A01 = r1;
        AudioPickerActivity audioPickerActivity = this.A0E;
        audioPickerActivity.A0F.A02(r2, r1);
        if (Build.VERSION.SDK_INT >= 21) {
            this.A07.setClipToOutline(true);
        }
        this.A07.setScaleType(ImageView.ScaleType.CENTER_CROP);
        TextView textView2 = this.A0B;
        textView2.setText(AbstractC54772jK.A02(activityC02290Ap, c26541Jq.A07, audioPickerActivity.A0I, ((ActivityC02310Ar) audioPickerActivity).A01));
        String str2 = c26541Jq.A02;
        if (str2 != null) {
            TextView textView3 = this.A08;
            textView3.setVisibility(0);
            textView3.setText(AbstractC54772jK.A02(activityC02290Ap, str2, audioPickerActivity.A0I, ((ActivityC02310Ar) audioPickerActivity).A01));
        } else {
            this.A08.setVisibility(8);
        }
        String str3 = c26541Jq.A05;
        boolean isEmpty = str3.isEmpty();
        if (!isEmpty) {
            TextView textView4 = this.A09;
            textView4.setVisibility(0);
            textView4.setText(str3);
        } else {
            this.A09.setVisibility(8);
        }
        String str4 = c26541Jq.A06;
        boolean isEmpty2 = str4.isEmpty();
        if (!isEmpty2) {
            if (c26541Jq.A01 >= ((ActivityC02290Ap) audioPickerActivity).A0B.A07(C01C.A3Y) * SearchActionVerificationClientService.MS_TO_NS) {
                SpannableString spannableString = new SpannableString(str4);
                spannableString.setSpan(new ForegroundColorSpan(-65536), 0, str4.length(), 33);
                textView = this.A0A;
                textView.setText(spannableString, TextView.BufferType.SPANNABLE);
                textView2.setAlpha(0.5f);
            } else {
                textView = this.A0A;
                textView.setText(str4);
                textView2.setAlpha(1.0f);
            }
            textView.setVisibility(0);
        } else {
            this.A0A.setVisibility(8);
        }
        if (!isEmpty && !isEmpty2) {
            this.A03.setVisibility(0);
        } else {
            this.A03.setVisibility(8);
        }
        boolean containsKey = audioPickerActivity.A0J.containsKey(Integer.valueOf(i));
        if (containsKey) {
            view.setSelected(true);
            view.setBackgroundResource(R.color.audio_picker_row_selection);
            SelectionCheckView selectionCheckView = this.A0D;
            selectionCheckView.setVisibility(0);
            selectionCheckView.A03(true, false);
        } else {
            view.setBackgroundResource(0);
            SelectionCheckView selectionCheckView2 = this.A0D;
            selectionCheckView2.A03(false, false);
            selectionCheckView2.setVisibility(4);
        }
        A05(c26541Jq, containsKey);
        CircularProgressBar circularProgressBar = this.A0C;
        circularProgressBar.A0B = C02160Ac.A00(activityC02290Ap, R.color.audio_picker_stop_button_outline);
        circularProgressBar.A0C = C02160Ac.A00(activityC02290Ap, R.color.audio_picker_stop_button_progress);
        circularProgressBar.A05 = 0.1f;
        circularProgressBar.A06 = 10.0f;
        circularProgressBar.setIndeterminate(false);
        final C09G A01 = C09560eJ.A01(file, Integer.toString(i));
        if (!audioPickerActivity.A0D.A09(A01)) {
            A02(activityC02290Ap, true);
            circularProgressBar.setMax(((AnonymousClass097) A01).A00 * SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS);
            circularProgressBar.setProgress(0);
            A00(0L);
        } else {
            final C09560eJ A012 = audioPickerActivity.A0D.A01();
            if (A012 != null) {
                circularProgressBar.setMax(A012.A02);
                if (!A012.A0K()) {
                    if (A012.A03() > 0) {
                        A02(activityC02290Ap, false);
                        circularProgressBar.setProgress(A012.A03());
                    } else {
                        A02(activityC02290Ap, true);
                        circularProgressBar.setProgress(0);
                    }
                } else {
                    A01(activityC02290Ap);
                    circularProgressBar.setProgress(A012.A03());
                }
                circularProgressBar.setMax(A012.A02);
                A012.A0H = new InterfaceC53562h9() { // from class: X.1ht
                    @Override // X.InterfaceC53562h9
                    public void AJg(boolean z) {
                    }

                    {
                        C26561Js.this = this;
                    }

                    @Override // X.InterfaceC53562h9
                    public C09G AA4() {
                        return A01;
                    }

                    @Override // X.InterfaceC53562h9
                    public void AMl(int i2) {
                        C26561Js.this.A02(activityC02290Ap, false);
                    }

                    @Override // X.InterfaceC53562h9
                    public void ANN(int i2) {
                        C26561Js c26561Js = C26561Js.this;
                        c26561Js.A0C.setProgress(i2);
                        c26561Js.A00(i2);
                    }

                    @Override // X.InterfaceC53562h9
                    public void AOH() {
                        C26561Js.this.A01(activityC02290Ap);
                    }

                    @Override // X.InterfaceC53562h9
                    public void AOq(int i2) {
                        A012.A0E(0);
                        C26561Js c26561Js = C26561Js.this;
                        c26561Js.A01(activityC02290Ap);
                        c26561Js.A0C.setMax(i2);
                    }

                    @Override // X.InterfaceC53562h9
                    public void APA(int i2) {
                        C26561Js c26561Js = C26561Js.this;
                        c26561Js.A02(activityC02290Ap, true);
                        c26561Js.A0C.setProgress(0);
                        c26561Js.A0E.A0D.A07(null);
                    }
                };
                A00(A012.A03());
            }
        }
        this.A06.setOnClickListener(new View.OnClickListener() { // from class: X.1Fa
            {
                C26561Js.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C26561Js.this.A06(A01, c26541Jq, activityC02290Ap);
            }
        });
    }

    public final void A05(C26541Jq c26541Jq, boolean z) {
        String str = c26541Jq.A02;
        if (str != null) {
            View view = this.A04;
            AudioPickerActivity audioPickerActivity = this.A0E;
            int i = R.string.audio_picker_row_content_description;
            if (z) {
                i = R.string.audio_picker_selected_row_content_description;
            }
            view.setContentDescription(audioPickerActivity.getString(i, c26541Jq.A07, str, c26541Jq.A04, c26541Jq.A06));
            return;
        }
        View view2 = this.A04;
        AudioPickerActivity audioPickerActivity2 = this.A0E;
        int i2 = R.string.audio_picker_row_content_description_no_artist;
        if (z) {
            i2 = R.string.audio_picker_selected_row_content_description_no_artist;
        }
        view2.setContentDescription(audioPickerActivity2.getString(i2, c26541Jq.A07, c26541Jq.A04, c26541Jq.A06));
    }

    public final void A06(C09G c09g, C26541Jq c26541Jq, ActivityC02290Ap activityC02290Ap) {
        if (!c09g.A1F()) {
            this.A0E.A0G.A03(activityC02290Ap);
            return;
        }
        AudioPickerActivity audioPickerActivity = this.A0E;
        C09560eJ A01 = audioPickerActivity.A0D.A01();
        if (A01 != null && !A01.A0M(c09g)) {
            A01.A05();
        }
        if (A01 == null || !A01.A0M(c09g)) {
            A01 = audioPickerActivity.A0C.A00(activityC02290Ap, false, false);
            A01.A0J = c09g;
            audioPickerActivity.A0D.A07(A01);
            A04(c26541Jq, activityC02290Ap);
        }
        A01.A0J(false);
    }
}
