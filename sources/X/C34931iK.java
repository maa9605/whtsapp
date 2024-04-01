package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.whatsapp.Conversation;
import com.whatsapp.util.Log;

/* renamed from: X.1iK  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C34931iK extends C0DJ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ ViewGroup A02;
    public final /* synthetic */ Conversation A03;
    public final /* synthetic */ boolean A04;

    public C34931iK(Conversation conversation, ViewGroup viewGroup, View view, boolean z, int i) {
        this.A03 = conversation;
        this.A02 = viewGroup;
        this.A01 = view;
        this.A04 = z;
        this.A00 = i;
    }

    @Override // X.C0DJ, android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        Log.i("conversation/hideinputextension/end");
        this.A02.setVisibility(8);
        Conversation conversation = this.A03;
        conversation.A0F.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.1KE
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                C34931iK c34931iK = C34931iK.this;
                Conversation conversation2 = c34931iK.A03;
                conversation2.A0F.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                Drawable background = conversation2.A0F.getBackground();
                if (background instanceof C60622um) {
                    conversation2.A29(((C60622um) background).A01);
                }
                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f);
                translateAnimation.setDuration(0L);
                c34931iK.A01.startAnimation(translateAnimation);
                if (c34931iK.A02 == conversation2.A0P && conversation2.A0O.getVisibility() == 0) {
                    conversation2.A0O.startAnimation(translateAnimation);
                }
                if (conversation2.A2f.A0I) {
                    conversation2.A0R.startAnimation(translateAnimation);
                }
                if (c34931iK.A04) {
                    conversation2.A0X.startAnimation(translateAnimation);
                }
                conversation2.A08 = 0;
            }
        });
        conversation.A0o.setClipChildren(true);
        conversation.A0X.setTranscriptMode(this.A00);
    }
}
