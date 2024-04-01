package com.whatsapp.voipcalling;

import X.AnonymousClass029;
import X.C01B;
import X.C02160Ac;
import X.C0AT;
import X.C2Zx;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import com.google.android.search.verification.client.R;

/* loaded from: classes2.dex */
public class VoipCallFooter extends C2Zx {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public ImageButton A04;
    public ImageButton A05;
    public ImageButton A06;
    public ImageButton A07;
    public ImageButton A08;
    public ImageButton A09;
    public C01B A0A;

    public VoipCallFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(AnonymousClass029.A1O(this.A0A) ? R.layout.voip_call_control_sheet_footer : R.layout.voip_call_footer, (ViewGroup) this, true);
        this.A08 = (ImageButton) findViewById(R.id.speaker_btn);
        this.A04 = (ImageButton) findViewById(R.id.bluetooth_btn);
        this.A00 = findViewById(R.id.bluetooth_btn_layout);
        this.A09 = (ImageButton) findViewById(R.id.toggle_video_btn);
        this.A03 = findViewById(R.id.toggle_video_btn_layout);
        this.A05 = (ImageButton) findViewById(R.id.chat_btn);
        this.A01 = findViewById(R.id.chat_btn_layout);
        this.A07 = (ImageButton) findViewById(R.id.mute_btn);
        this.A06 = (ImageButton) C0AT.A0D(this, R.id.footer_end_call_btn);
        this.A02 = C0AT.A0D(this, R.id.end_call_btn_layout);
    }

    public void A00() {
        if (!AnonymousClass029.A1O(this.A0A)) {
            setBackgroundColor(getResources().getColor(R.color.primary_voip));
            this.A08.setImageResource(R.drawable.ic_speaker);
            this.A08.setContentDescription(getContext().getString(R.string.voip_call_speakerphone_toggle_description));
            this.A04.setImageResource(R.drawable.ic_bluetooth);
            this.A09.setImageResource(R.drawable.ic_toggle_video);
            this.A09.setContentDescription(getContext().getString(R.string.voip_call_turn_on_video_btn_description));
            this.A05.setImageResource(R.drawable.ic_chat);
            this.A07.setImageResource(R.drawable.voicecall_mute_footer);
            return;
        }
        this.A08.setImageResource(R.drawable.ic_voip_speaker_control);
        this.A09.setImageResource(R.drawable.ic_voip_video_control);
        this.A09.setContentDescription(getContext().getString(R.string.voip_call_turn_on_video_btn_description));
        A04(false);
    }

    public void A01() {
        if (!AnonymousClass029.A1O(this.A0A)) {
            setBackground(C02160Ac.A03(getContext(), R.drawable.video_call_footer_background));
            this.A08.setImageResource(R.drawable.videocall_flipcam_v2);
            this.A08.setContentDescription(getContext().getString(R.string.voip_call_flip_camera_description));
            this.A04.setImageResource(R.drawable.ic_videocall_bluetooth_normal);
            this.A09.setImageResource(R.drawable.ic_toggle_video_v2);
            this.A09.setContentDescription(getContext().getString(R.string.voip_call_turn_off_video_btn_description));
            this.A05.setImageResource(R.drawable.videocall_message_v2);
            this.A07.setImageResource(R.drawable.videocall_mute);
            return;
        }
        this.A08.setImageResource(R.drawable.ic_voip_switch_camera_control);
        this.A09.setImageResource(R.drawable.ic_voip_switch_to_voice_control);
        this.A09.setContentDescription(getContext().getString(R.string.voip_call_turn_off_video_btn_description));
        A04(true);
    }

    public void A02(int i) {
        float f = i;
        this.A04.setRotation(f);
        this.A08.setRotation(f);
        this.A05.setRotation(f);
        this.A07.setRotation(f);
        this.A09.setRotation(f);
        this.A06.setRotation(f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0022, code lost:
        if (com.whatsapp.voipcalling.Voip.getCameraCount() <= 1) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A03(com.whatsapp.voipcalling.CallInfo r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipCallFooter.A03(com.whatsapp.voipcalling.CallInfo, int, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x004b, code lost:
        if (r6.A09.isSelected() != false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A04(boolean r7) {
        /*
            r6 = this;
            android.content.Context r5 = r6.getContext()
            android.widget.ImageButton r2 = r6.A08
            if (r7 != 0) goto L93
            boolean r1 = r2.isSelected()
            r0 = 2131890686(0x7f1211fe, float:1.941607E38)
            if (r1 == 0) goto L14
            r0 = 2131890685(0x7f1211fd, float:1.9416069E38)
        L14:
            java.lang.String r1 = r5.getString(r0)
            r0 = 0
            if (r7 == 0) goto L22
            r0 = 2131890680(0x7f1211f8, float:1.9416059E38)
            java.lang.String r0 = r5.getString(r0)
        L22:
            r4 = 0
            X.C02180Ae.A14(r2, r1, r0, r4)
            android.widget.ImageButton r2 = r6.A04
            boolean r1 = r2.isSelected()
            r0 = 2131890633(0x7f1211c9, float:1.9415963E38)
            if (r1 == 0) goto L34
            r0 = 2131890632(0x7f1211c8, float:1.9415961E38)
        L34:
            java.lang.String r1 = r5.getString(r0)
            r0 = 2131890647(0x7f1211d7, float:1.9415992E38)
            java.lang.String r0 = r5.getString(r0)
            X.C02180Ae.A14(r2, r1, r0, r4)
            if (r7 == 0) goto L4d
            android.widget.ImageButton r0 = r6.A09
            boolean r0 = r0.isSelected()
            r3 = 1
            if (r0 == 0) goto L4e
        L4d:
            r3 = 0
        L4e:
            android.widget.ImageButton r2 = r6.A09
            r0 = 2131890684(0x7f1211fc, float:1.9416067E38)
            if (r3 == 0) goto L58
            r0 = 2131890682(0x7f1211fa, float:1.9416063E38)
        L58:
            java.lang.String r1 = r5.getString(r0)
            r0 = 2131890683(0x7f1211fb, float:1.9416065E38)
            if (r3 == 0) goto L64
            r0 = 2131890681(0x7f1211f9, float:1.941606E38)
        L64:
            java.lang.String r0 = r5.getString(r0)
            X.C02180Ae.A14(r2, r1, r0, r4)
            android.widget.ImageButton r3 = r6.A07
            boolean r1 = r3.isSelected()
            r0 = 2131890670(0x7f1211ee, float:1.9416038E38)
            if (r1 == 0) goto L79
            r0 = 2131890689(0x7f121201, float:1.9416077E38)
        L79:
            java.lang.String r2 = r5.getString(r0)
            android.widget.ImageButton r0 = r6.A07
            boolean r1 = r0.isSelected()
            r0 = 2131890669(0x7f1211ed, float:1.9416036E38)
            if (r1 == 0) goto L8b
            r0 = 2131890688(0x7f121200, float:1.9416075E38)
        L8b:
            java.lang.String r0 = r5.getString(r0)
            X.C02180Ae.A14(r3, r2, r0, r4)
            return
        L93:
            r0 = 2131890680(0x7f1211f8, float:1.9416059E38)
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipCallFooter.A04(boolean):void");
    }

    public void setBluetoothButtonClickListener(View.OnClickListener onClickListener) {
        this.A04.setOnClickListener(onClickListener);
    }

    public void setChatButtonClickListener(View.OnClickListener onClickListener) {
        this.A05.setOnClickListener(onClickListener);
    }

    public void setEndCallButtonClickListener(View.OnClickListener onClickListener) {
        this.A06.setOnClickListener(onClickListener);
    }

    public void setMuteButtonClickListener(View.OnClickListener onClickListener) {
        this.A07.setOnClickListener(onClickListener);
    }

    public void setSpeakerButtonClickListener(View.OnClickListener onClickListener) {
        this.A08.setOnClickListener(onClickListener);
    }

    public void setToggleVideoButtonClickListener(View.OnClickListener onClickListener) {
        this.A09.setOnClickListener(onClickListener);
    }

    public void setToggleVideoButtonSelected(boolean z) {
        this.A09.setSelected(z);
    }
}
