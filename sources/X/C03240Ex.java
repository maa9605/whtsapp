package X;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0Ex  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C03240Ex extends C0AJ {
    @Override // X.C0AJ
    public InterfaceC016607s A00(C016107n c016107n, C016807u c016807u, AbstractC016307p abstractC016307p, int i, int i2) {
        int i3 = c016807u.A01;
        if (i3 == 13334) {
            View view = (View) abstractC016307p.A07(c016107n.A02);
            view.measure(i, i2);
            return new C016507r(abstractC016307p, i, i2, view.getMeasuredWidth(), view.getMeasuredHeight());
        } else if (i3 != 13666) {
            if (i3 != 13797) {
                return super.A00(c016107n, c016807u, abstractC016307p, i, i2);
            }
            return C07K.A0o(c016107n, c016807u, abstractC016307p, i, i2);
        } else {
            View view2 = (View) abstractC016307p.A07(c016107n.A02);
            view2.measure(i, i2);
            return new C016507r(abstractC016307p, i, i2, view2.getMeasuredWidth(), view2.getMeasuredHeight());
        }
    }

    @Override // X.C0AJ
    public AbstractC016307p A01(final AnonymousClass087 anonymousClass087, final C016807u c016807u, C20430xW c20430xW) {
        int i = c016807u.A01;
        if (i != 13334) {
            if (i != 13666) {
                if (i != 13797) {
                    return super.A01(anonymousClass087, c016807u, c20430xW);
                }
                return new AnonymousClass089(((AbstractC016907v) c016807u).A00);
            }
            return new AbstractC30911bN(c016807u, anonymousClass087) { // from class: X.1F6
                @Override // X.AbstractC30911bN
                public void A0A(View view, AnonymousClass087 anonymousClass0872, C016807u c016807u2, Object obj) {
                }

                @Override // X.AbstractC30911bN
                public void A0B(View view, AnonymousClass087 anonymousClass0872, C016807u c016807u2, Object obj) {
                }

                @Override // X.AbstractC30911bN, X.AbstractC016307p
                public Object A07(Context context) {
                    return new C17480sA(context);
                }

                @Override // X.AbstractC30911bN
                public View A08(Context context) {
                    return new C17480sA(context);
                }

                @Override // X.AbstractC30911bN, X.AbstractC016307p, X.C07T
                public /* bridge */ /* synthetic */ C07T AGA() {
                    return super.AGA();
                }
            };
        }
        return new AbstractC30911bN(c016807u, anonymousClass087) { // from class: X.1F7
            @Override // X.AbstractC30911bN, X.AbstractC016307p
            public Object A07(Context context) {
                return new SwitchCompat(context, null);
            }

            @Override // X.AbstractC30911bN
            public View A08(Context context) {
                return new SwitchCompat(context, null);
            }

            @Override // X.AbstractC30911bN
            public void A0A(View view, final AnonymousClass087 anonymousClass0872, final C016807u c016807u2, Object obj) {
                SwitchCompat switchCompat = (SwitchCompat) view;
                switchCompat.setChecked(c016807u2.A8Z(C17520sE.A00, false));
                switchCompat.setEnabled(c016807u2.A8Z(C17520sE.A01, true));
                final C09P AA3 = c016807u2.AA3(C17520sE.A04);
                switchCompat.setOnCheckedChangeListener(AA3 == null ? null : new CompoundButton.OnCheckedChangeListener() { // from class: X.0s8
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        C016807u c016807u3 = C016807u.this;
                        int i2 = ((AbstractC016907v) c016807u3).A00;
                        C09P c09p = AA3;
                        ArrayList arrayList = new ArrayList();
                        InterfaceC020509l A0f = AnonymousClass088.A0f(c016807u3);
                        if (arrayList.size() == 0) {
                            arrayList.add(A0f);
                            AbstractC021009q A0c = AnonymousClass088.A0c(z ? 1 : 0);
                            if (arrayList.size() == 1) {
                                arrayList.add(A0c);
                                C25031Du.A00(i2, c09p, new C021109r(arrayList), anonymousClass0872);
                                return;
                            }
                            throw new IllegalArgumentException("arguments have to be continuous");
                        }
                        throw new IllegalArgumentException("arguments have to be continuous");
                    }
                });
                Context context = anonymousClass0872.A00;
                AnonymousClass081 anonymousClass081 = (AnonymousClass081) c016807u2.A00.A00(C17520sE.A03);
                Integer valueOf = anonymousClass081 == null ? null : Integer.valueOf(AnonymousClass088.A06(anonymousClass081, anonymousClass0872));
                AnonymousClass081 anonymousClass0812 = (AnonymousClass081) c016807u2.A00.A00(C17520sE.A02);
                Integer valueOf2 = anonymousClass0812 == null ? null : Integer.valueOf(AnonymousClass088.A06(anonymousClass0812, anonymousClass0872));
                AnonymousClass081 anonymousClass0813 = (AnonymousClass081) c016807u2.A00.A00(C17520sE.A06);
                Integer valueOf3 = anonymousClass0813 == null ? null : Integer.valueOf(AnonymousClass088.A06(anonymousClass0813, anonymousClass0872));
                AnonymousClass081 anonymousClass0814 = (AnonymousClass081) c016807u2.A00.A00(C17520sE.A05);
                Integer valueOf4 = anonymousClass0814 == null ? null : Integer.valueOf(AnonymousClass088.A06(anonymousClass0814, anonymousClass0872));
                AnonymousClass081 anonymousClass0815 = (AnonymousClass081) c016807u2.A00.A00(C17520sE.A08);
                Integer valueOf5 = anonymousClass0815 == null ? null : Integer.valueOf(AnonymousClass088.A06(anonymousClass0815, anonymousClass0872));
                AnonymousClass081 anonymousClass0816 = (AnonymousClass081) c016807u2.A00.A00(C17520sE.A07);
                Integer valueOf6 = anonymousClass0816 != null ? Integer.valueOf(AnonymousClass088.A06(anonymousClass0816, anonymousClass0872)) : null;
                if (valueOf3 == null && valueOf4 == null) {
                    switchCompat.setThumbTintList(C17470s9.A01(context, valueOf, valueOf2));
                } else {
                    switchCompat.setThumbTintList(C17470s9.A01(context, valueOf3, valueOf4));
                }
                if (valueOf5 == null && valueOf6 == null) {
                    switchCompat.setTrackTintList(C17470s9.A00(context, valueOf, valueOf2));
                } else {
                    switchCompat.setTrackTintList(C17470s9.A00(context, valueOf5, valueOf6));
                }
            }

            @Override // X.AbstractC30911bN
            public void A0B(View view, AnonymousClass087 anonymousClass0872, C016807u c016807u2, Object obj) {
                ((CompoundButton) view).setOnCheckedChangeListener(null);
            }

            @Override // X.AbstractC30911bN, X.AbstractC016307p, X.C07T
            public /* bridge */ /* synthetic */ C07T AGA() {
                return super.AGA();
            }
        };
    }

    @Override // X.C0AJ
    public AnonymousClass084 A02(C016807u c016807u) {
        int i = c016807u.A01;
        if (i != 13666) {
            if (i != 13797) {
                return super.A02(c016807u);
            }
            return AnonymousClass083.A00;
        }
        return null;
    }

    @Override // X.C0AJ
    public Object A03(AnonymousClass087 anonymousClass087, C016807u c016807u) {
        int i = c016807u.A01;
        if (i == 13334 || i == 13666) {
            return null;
        }
        if (i != 13797) {
            return super.A03(anonymousClass087, c016807u);
        }
        AtomicInteger atomicInteger = C24951Dm.A00;
        return new Pair(Integer.valueOf(atomicInteger.incrementAndGet()), Integer.valueOf(atomicInteger.incrementAndGet()));
    }
}
