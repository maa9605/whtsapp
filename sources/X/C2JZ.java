package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.2JZ */
/* loaded from: classes2.dex */
public class C2JZ {
    public Context A00;
    public LayoutInflater A01;
    public View A02;
    public View A03;
    public View A04;
    public ViewGroup A05;
    public ImageView A06;
    public TextView A07;
    public TextView A08;
    public TextView A09;
    public TextView A0A;
    public RecyclerView A0B;
    public TextEmojiLabel A0C;
    public TextEmojiLabel A0D;
    public C0Zn A0E;
    public C3DL A0F;
    public boolean A0G;
    public final C05W A0H;
    public final C018708s A0I;
    public final AnonymousClass012 A0J;
    public final C002301c A0K;
    public final C05M A0L;

    public C2JZ(Context context, AnonymousClass012 anonymousClass012, C05M c05m, C05W c05w, C018708s c018708s, C002301c c002301c, C0Zn c0Zn, ViewGroup viewGroup) {
        this.A00 = context;
        this.A0J = anonymousClass012;
        this.A0L = c05m;
        this.A01 = LayoutInflater.from(context);
        this.A0H = c05w;
        this.A0I = c018708s;
        this.A0K = c002301c;
        this.A0E = c0Zn;
        this.A07 = (TextView) viewGroup.findViewById(R.id.group_creator);
        this.A0D = (TextEmojiLabel) viewGroup.findViewById(R.id.group_name);
        this.A0C = (TextEmojiLabel) viewGroup.findViewById(R.id.group_description_preview);
        this.A05 = (ViewGroup) viewGroup.findViewById(R.id.participants_no_known_contacts);
        this.A0A = (TextView) viewGroup.findViewById(R.id.participants_header);
        this.A09 = (TextView) viewGroup.findViewById(R.id.participant_count);
        this.A06 = (ImageView) viewGroup.findViewById(R.id.group_photo);
        this.A08 = (TextView) viewGroup.findViewById(R.id.invite_expiration_time);
        this.A04 = viewGroup.findViewById(R.id.group_photo_container);
        this.A03 = viewGroup.findViewById(R.id.group_info);
        this.A02 = viewGroup.findViewById(R.id.background);
        this.A0B = (RecyclerView) viewGroup.findViewById(R.id.group_participants);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        linearLayoutManager.A1Y(0);
        this.A0B.setLayoutManager(linearLayoutManager);
        C3DL c3dl = new C3DL(this);
        this.A0F = c3dl;
        this.A0B.setAdapter(c3dl);
    }

    public void A00(final Bitmap bitmap) {
        if (bitmap == null) {
            Log.e("GroupInviteInfoViewController/decode-photo-bytes-returns-null");
            return;
        }
        AlphaAnimation A03 = C000200d.A03(1.0f, 0.0f, 100L);
        A03.setAnimationListener(new C0DJ() { // from class: X.3DJ
            {
                C2JZ.this = this;
            }

            @Override // X.C0DJ, android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                C2JZ c2jz = C2JZ.this;
                c2jz.A06.setImageBitmap(bitmap);
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(100L);
                c2jz.A06.startAnimation(alphaAnimation);
            }
        });
        this.A06.startAnimation(A03);
    }

    public void A01(C52622b3 c52622b3, long j) {
        C06C c06c;
        UserJid userJid = c52622b3.A02;
        if (userJid != null) {
            c06c = this.A0H.A0A(userJid);
        } else {
            c06c = null;
        }
        this.A0D.A03(c52622b3.A04);
        if (c06c != null && this.A0G) {
            this.A07.setVisibility(0);
            this.A07.setText(this.A00.getString(R.string.join_group_creator_message, this.A0I.A06(c06c)));
        } else {
            this.A07.setVisibility(8);
        }
        C04410Kb c04410Kb = c52622b3.A03;
        String str = c04410Kb != null ? c04410Kb.A02 : null;
        if (!TextUtils.isEmpty(str)) {
            this.A0C.A03(str);
            this.A0C.setVisibility(0);
        } else {
            this.A0C.setVisibility(8);
        }
        ArrayList arrayList = c52622b3.A05;
        boolean z = !arrayList.isEmpty();
        this.A0A.setVisibility(z ? 0 : 8);
        this.A05.setVisibility(z ? 8 : 0);
        this.A0B.setVisibility(z ? 0 : 8);
        TextView textView = this.A0A;
        C002301c c002301c = this.A0K;
        int i = c52622b3.A00;
        long j2 = i;
        Integer valueOf = Integer.valueOf(i);
        textView.setText(c002301c.A0A(R.plurals.participants_title, j2, valueOf));
        this.A09.setText(c002301c.A0A(R.plurals.participants_title, j2, valueOf));
        C3DL c3dl = this.A0F;
        c3dl.A01 = arrayList;
        ((AbstractC04890Mh) c3dl).A01.A00();
        C3DL c3dl2 = this.A0F;
        c3dl2.A00 = i;
        ((AbstractC04890Mh) c3dl2).A01.A00();
        long A05 = j - this.A0J.A05();
        if (A05 > 0) {
            double d = A05;
            int ceil = (int) Math.ceil(d / 8.64E7d);
            if (((int) Math.floor(d / 3600000.0d)) < 12) {
                this.A08.setText(this.A00.getString(R.string.invite_expiration_at_time, AbstractC40621sZ.A00(c002301c, j)));
            } else {
                this.A08.setText(c002301c.A0A(R.plurals.invite_expires_days, ceil, Integer.valueOf(ceil)));
            }
            this.A08.setVisibility(0);
        } else {
            this.A08.setVisibility(8);
        }
        final float height = this.A02.getHeight();
        this.A02.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.2xP
            {
                C2JZ.this = this;
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                C2JZ c2jz = C2JZ.this;
                c2jz.A02.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                float height2 = c2jz.A02.getHeight();
                float f = height;
                TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f - (f / height2), 1, 0.0f);
                translateAnimation.setDuration(300L);
                translateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
                c2jz.A02.startAnimation(translateAnimation);
                AnimationSet animationSet = new AnimationSet(true);
                animationSet.setInterpolator(new AccelerateDecelerateInterpolator());
                animationSet.addAnimation(new AlphaAnimation(0.0f, 1.0f));
                animationSet.addAnimation(new TranslateAnimation(1, 0.0f, 1, 0.0f, 0, (height2 - f) * 1.4f, 0, 0.0f));
                animationSet.setDuration(300L);
                c2jz.A04.startAnimation(animationSet);
                c2jz.A03.startAnimation(animationSet);
            }
        });
        this.A04.setVisibility(0);
    }
}
