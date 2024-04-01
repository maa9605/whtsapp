package X;

import android.net.Uri;
import android.text.Editable;
import android.text.TextUtils;
import android.view.animation.Animation;
import android.widget.ImageButton;
import com.whatsapp.Conversation;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1iE  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C34871iE extends C2JT {
    public boolean A00 = false;
    public final /* synthetic */ Conversation A01;

    public C34871iE(Conversation conversation) {
        this.A01 = conversation;
    }

    @Override // X.C2JT, android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        C3YG c3yg;
        String obj = editable.toString();
        boolean z = !AnonymousClass024.A0j(obj);
        Conversation conversation = this.A01;
        conversation.A0V.setEnabled(z);
        conversation.A1q();
        if (conversation.A0W.getVisibility() == 8 && !z) {
            conversation.A0W.startAnimation(C73453bf.A00(true));
            conversation.A0W.setVisibility(0);
            conversation.A0U.startAnimation(Conversation.A0G(conversation.A1s.A0M(), true, false));
            conversation.A0T.startAnimation(Conversation.A0G(conversation.A1s.A0M(), true, true));
            conversation.A0T.setVisibility(0);
            conversation.A0V.startAnimation(C73453bf.A00(false));
            conversation.A0V.setVisibility(8);
        } else if (conversation.A0W.getVisibility() == 0 && z) {
            conversation.A0W.startAnimation(C73453bf.A00(false));
            conversation.A0W.setVisibility(8);
            conversation.A0U.startAnimation(Conversation.A0G(conversation.A1s.A0M(), false, false));
            Animation A0G = Conversation.A0G(conversation.A1s.A0M(), false, true);
            final ImageButton imageButton = conversation.A0T;
            A0G.setAnimationListener(new C0DJ() { // from class: X.1iC
                @Override // X.C0DJ, android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    imageButton.setVisibility(8);
                }
            });
            conversation.A0T.startAnimation(A0G);
            conversation.A0V.startAnimation(C73453bf.A00(true));
            conversation.A0V.setVisibility(0);
        }
        C05920Qu c05920Qu = conversation.A1h.A00;
        if (c05920Qu instanceof C38D) {
            conversation.A2C(c05920Qu);
        } else {
            final String A01 = C04310Jr.A01(editable.toString());
            conversation.A40 = A01;
            if (A01 != null && !A01.equals(conversation.A3z)) {
                conversation.A3z = null;
                C05920Qu c05920Qu2 = conversation.A1h.A00;
                if (c05920Qu2 == null || !TextUtils.equals(c05920Qu2.A0G, A01)) {
                    C2JU c2ju = conversation.A1h;
                    C2N3 A1c = conversation.A1c();
                    if (c2ju.A06(A01)) {
                        UserJid A02 = C0ED.A02(Uri.parse(A01));
                        if (A02 != null) {
                            c2ju.A04(A02, A01, A1c);
                        } else {
                            c2ju.A01.A0B(C1Lh.A00(A01));
                        }
                    } else {
                        c2ju.A01.A0B(C1Lh.A00(A01));
                    }
                    if (conversation.A1h.A00 == null) {
                        Runnable runnable = conversation.A3t;
                        if (runnable != null) {
                            conversation.A4S.removeCallbacks(runnable);
                            conversation.A3t = null;
                        }
                        if (this.A00) {
                            C1Lh.A01(conversation.A0n, conversation.A3e, conversation.A0x, conversation.A1s, A01, new InterfaceC26921Lg() { // from class: X.1h7
                                @Override // X.InterfaceC26921Lg
                                public final void AMf(C05920Qu c05920Qu3, boolean z2) {
                                    C34871iE.this.A01.A2C(c05920Qu3);
                                }
                            });
                        } else {
                            Runnable runnable2 = new Runnable() { // from class: X.1Ft
                                @Override // java.lang.Runnable
                                public final void run() {
                                    final C34871iE c34871iE = C34871iE.this;
                                    String str = A01;
                                    Conversation conversation2 = c34871iE.A01;
                                    C1Lh.A01(conversation2.A0n, conversation2.A3e, conversation2.A0x, conversation2.A1s, str, new InterfaceC26921Lg() { // from class: X.1h6
                                        @Override // X.InterfaceC26921Lg
                                        public final void AMf(C05920Qu c05920Qu3, boolean z2) {
                                            C34871iE.this.A01.A2C(c05920Qu3);
                                        }
                                    });
                                }
                            };
                            conversation.A3t = runnable2;
                            conversation.A4S.postDelayed(runnable2, 700L);
                        }
                    }
                }
            } else {
                conversation.A2C(null);
            }
        }
        AnonymousClass029.A17(conversation, conversation.A2G, conversation.A1l, conversation.A31, editable, conversation.A2f.getPaint());
        if (conversation.A3O.A00 && (c3yg = conversation.A3Q) != null && ((AbstractActivityC04650Lh) conversation).A0Q.A02) {
            if (c3yg.A00.length() > 20 && obj.length() > 20) {
                return;
            }
            Runnable runnable3 = c3yg.A01;
            if (runnable3 != null) {
                c3yg.A02.A02.removeCallbacks(runnable3);
            }
            c3yg.A00 = obj;
            RunnableEBaseShape6S0200000_I1 runnableEBaseShape6S0200000_I1 = new RunnableEBaseShape6S0200000_I1(c3yg, obj, 15);
            c3yg.A01 = runnableEBaseShape6S0200000_I1;
            c3yg.A02.A02.postDelayed(runnableEBaseShape6S0200000_I1, 200L);
        }
    }

    @Override // X.C2JT, android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int codePointCount;
        boolean z = false;
        if (i3 > i2 && ((codePointCount = Character.codePointCount(charSequence, i, i3 + i)) > 1 || (codePointCount == 1 && Character.isWhitespace(Character.codePointAt(charSequence, i))))) {
            z = true;
        }
        this.A00 = z;
    }
}
