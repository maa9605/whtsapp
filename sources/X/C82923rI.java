package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import java.util.Map;

/* renamed from: X.3rI  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C82923rI extends C0TS {
    public boolean A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final ViewGroup A06;
    public final ViewGroup A07;
    public final C002301c A08;

    public C82923rI(Context context, C002301c c002301c, ViewGroup viewGroup) {
        super(LayoutInflater.from(context).inflate(R.layout.sticker_picker_reactions, viewGroup, false));
        this.A00 = true;
        this.A08 = c002301c;
        View view = this.A0H;
        this.A01 = view.findViewById(R.id.reactions_bg);
        this.A02 = view.findViewById(R.id.reaction_lol);
        this.A04 = view.findViewById(R.id.reaction_sad);
        this.A03 = view.findViewById(R.id.reaction_love);
        this.A05 = view.findViewById(R.id.reaction_wow);
        this.A07 = (ViewGroup) view.findViewById(R.id.reactions_right);
        this.A06 = (ViewGroup) view.findViewById(R.id.reactions_left);
    }

    public void A0C() {
        if (this.A00) {
            return;
        }
        this.A01.setBackgroundResource(0);
        C16140pu.A01((ViewGroup) this.A0H, new AbstractC16120ps() { // from class: X.1Ur
            public static final String[] A00 = {"android:clipBounds:clip"};

            public static final void A02(C16160pw c16160pw) {
                View view = c16160pw.A00;
                if (view.getVisibility() == 8) {
                    return;
                }
                Rect A0A = C0AT.A0A(view);
                Map map = c16160pw.A02;
                map.put("android:clipBounds:clip", A0A);
                if (A0A == null) {
                    map.put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
                }
            }

            @Override // X.AbstractC16120ps
            public Animator A0Q(ViewGroup viewGroup, C16160pw c16160pw, C16160pw c16160pw2) {
                ObjectAnimator objectAnimator = null;
                if (c16160pw != null && c16160pw2 != null) {
                    Map map = c16160pw.A02;
                    if (map.containsKey("android:clipBounds:clip")) {
                        Map map2 = c16160pw2.A02;
                        if (map2.containsKey("android:clipBounds:clip")) {
                            Rect rect = (Rect) map.get("android:clipBounds:clip");
                            Object obj = map2.get("android:clipBounds:clip");
                            boolean z = obj == null;
                            if (rect == null && obj == null) {
                                return null;
                            }
                            if (rect == null) {
                                rect = (Rect) map.get("android:clipBounds:bounds");
                            } else if (obj == null) {
                                obj = map2.get("android:clipBounds:bounds");
                            }
                            if (rect.equals(obj)) {
                                return null;
                            }
                            C0AT.A0b(c16160pw2.A00, rect);
                            objectAnimator = ObjectAnimator.ofObject(c16160pw2.A00, C16220q2.A02, new C16050pl(new Rect()), rect, obj);
                            if (z) {
                                final View view = c16160pw2.A00;
                                objectAnimator.addListener(new AnimatorListenerAdapter() { // from class: X.0ph
                                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                    public void onAnimationEnd(Animator animator) {
                                        C0AT.A0b(view, null);
                                    }
                                });
                            }
                        }
                    }
                }
                return objectAnimator;
            }

            @Override // X.AbstractC16120ps
            public String[] A0S() {
                return A00;
            }

            @Override // X.AbstractC16120ps
            public void A0T(C16160pw c16160pw) {
                A02(c16160pw);
            }

            @Override // X.AbstractC16120ps
            public void A0U(C16160pw c16160pw) {
                A02(c16160pw);
            }
        });
        this.A05.setVisibility(8);
        this.A02.setVisibility(8);
        this.A04.setVisibility(8);
        this.A03.setSelected(false);
        this.A00 = true;
    }
}
