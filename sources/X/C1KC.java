package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;
import com.whatsapp.Conversation;
import com.whatsapp.util.Log;

/* renamed from: X.1KC  reason: invalid class name */
/* loaded from: classes.dex */
public class C1KC implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ ViewGroup A02;
    public final /* synthetic */ Conversation A03;
    public final /* synthetic */ boolean A04;

    public C1KC(Conversation conversation, ViewGroup viewGroup, boolean z, View view, int i) {
        this.A03 = conversation;
        this.A02 = viewGroup;
        this.A04 = z;
        this.A01 = view;
        this.A00 = i;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        ViewGroup viewGroup = this.A02;
        viewGroup.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        final int height = viewGroup.getHeight();
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, height, 0.0f);
        translateAnimation.setDuration(250L);
        if (this.A04) {
            this.A03.A0X.startAnimation(translateAnimation);
        }
        Conversation conversation = this.A03;
        if (viewGroup == conversation.A0P && conversation.A0O.getVisibility() == 0) {
            conversation.A0O.startAnimation(translateAnimation);
        }
        if (conversation.A2f.A0I) {
            conversation.A0R.startAnimation(translateAnimation);
        }
        this.A01.startAnimation(translateAnimation);
        final Drawable background = conversation.A0F.getBackground();
        if (!(background instanceof C60622um)) {
            conversation.A29(new C60622um(background));
        }
        ((C60622um) conversation.A0F.getBackground()).A00(height);
        Animation animation = new Animation() { // from class: X.1KB
            @Override // android.view.animation.Animation
            public boolean willChangeBounds() {
                return false;
            }

            @Override // android.view.animation.Animation
            public void applyTransformation(float f, Transformation transformation) {
                int i = height;
                int i2 = i - ((int) (i * f));
                Conversation conversation2 = C1KC.this.A03;
                Drawable background2 = conversation2.A0F.getBackground();
                if (background2 instanceof C60622um) {
                    if (f == 1.0f) {
                        conversation2.A29(background);
                    } else {
                        ((C60622um) background2).A00(i2);
                    }
                }
            }
        };
        animation.setStartTime(-1L);
        animation.setDuration(250L);
        animation.setAnimationListener(new C0DJ() { // from class: X.1iJ
            @Override // X.C0DJ, android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation2) {
                Log.i("conversation/showinputextension/end");
                C1KC c1kc = C1KC.this;
                Conversation conversation2 = c1kc.A03;
                conversation2.A0o.setClipChildren(true);
                conversation2.A08 = 0;
                conversation2.A0X.setTranscriptMode(c1kc.A00);
            }
        });
        conversation.A0F.startAnimation(animation);
    }
}
