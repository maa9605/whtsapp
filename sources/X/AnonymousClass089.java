package X;

import android.content.Context;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import java.io.IOException;

/* renamed from: X.089  reason: invalid class name */
/* loaded from: classes.dex */
public class AnonymousClass089 extends C08A {
    public int A00;
    public AnonymousClass087 A01;
    public AnonymousClass081 A02;

    public AnonymousClass089(long j) {
        super(j);
        this.A00 = 0;
        C08D[] c08dArr = {new C08D(this, new C08C() { // from class: X.1gh
            public static void A00(AnonymousClass087 anonymousClass087, C30561an c30561an, AnonymousClass081 anonymousClass081) {
                float A03 = C08i.A03(anonymousClass081.ADJ(C017808h.A08), 0.0f);
                if (A03 != 0.0f) {
                    c30561an.setElevation(A03);
                }
                final float A032 = C08i.A03(anonymousClass081.ADJ(C017808h.A07), 0.0f);
                if (!anonymousClass081.A8Z(C017808h.A04, false)) {
                    if (A032 == 0.0f) {
                        return;
                    }
                    c30561an.setOutlineProvider(new ViewOutlineProvider() { // from class: X.1F0
                        @Override // android.view.ViewOutlineProvider
                        public void getOutline(View view, Outline outline) {
                            Drawable background = view.getBackground();
                            if (background != null) {
                                background.getOutline(outline);
                                outline.setAlpha(1.0f);
                                return;
                            }
                            outline.setRect(0, 0, view.getWidth(), view.getHeight());
                            outline.setAlpha(0.0f);
                        }
                    });
                } else if (A032 != 0.0f) {
                    c30561an.setOutlineProvider(new ViewOutlineProvider() { // from class: X.1Ez
                        @Override // android.view.ViewOutlineProvider
                        public void getOutline(View view, Outline outline) {
                            outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), A032);
                        }
                    });
                    float A033 = C08i.A03(anonymousClass081.ADJ(C017808h.A03), 0.0f);
                    int A0D = AnonymousClass088.A0D(anonymousClass081.AAv(C017808h.A05));
                    if (A033 == 0.0f && AnonymousClass088.A1t(A0D)) {
                        c30561an.setClipToOutline(true);
                        return;
                    }
                    C1F1 c1f1 = c30561an.A00;
                    c1f1.A04 = true;
                    c1f1.A0B.setLayerType(2, null);
                    c30561an.A00.A00(AnonymousClass088.A07(anonymousClass081, anonymousClass087), AnonymousClass088.A05(anonymousClass081, anonymousClass087), A033, A032, A0D);
                }
            }

            @Override // X.C08C
            public void A5g(Context context, Object obj, Object obj2, Object obj3) {
                C1YV c1yv = (C1YV) obj;
                AnonymousClass089 anonymousClass089 = (AnonymousClass089) obj2;
                AnonymousClass081 anonymousClass081 = anonymousClass089.A02;
                if (anonymousClass081 != null) {
                    try {
                        if (Build.VERSION.SDK_INT <= 20) {
                            AnonymousClass087 anonymousClass087 = anonymousClass089.A01;
                            C30561an c30561an = (C30561an) c1yv;
                            if (anonymousClass081.A8Z(C017808h.A04, false)) {
                                C1F1 c1f1 = c30561an.A00;
                                c1f1.A04 = true;
                                c1f1.A0B.setLayerType(2, null);
                                c30561an.A00.A00(AnonymousClass088.A07(anonymousClass081, anonymousClass087), AnonymousClass088.A05(anonymousClass081, anonymousClass087), (int) C08i.A03(anonymousClass081.ADJ(C017808h.A03), 0.0f), (int) C08i.A03(anonymousClass081.ADJ(C017808h.A07), 0.0f), AnonymousClass088.A0D(anonymousClass081.AAv(C017808h.A05)));
                                return;
                            }
                            return;
                        }
                        A00(anonymousClass089.A01, (C30561an) c1yv, anonymousClass081);
                    } catch (IOException e) {
                        AnonymousClass088.A1j("HostWithDecoratorRenderUnit", "Parse exception while binding Box Decoration", e);
                    }
                }
            }

            @Override // X.C08C
            public boolean AUY(Object obj, Object obj2, Object obj3, Object obj4) {
                return true;
            }

            @Override // X.C08C
            public void AVh(Context context, Object obj, Object obj2, Object obj3) {
                C1YV c1yv = (C1YV) obj;
                if (((AnonymousClass089) obj2).A02 != null) {
                    C30561an c30561an = (C30561an) c1yv;
                    C1F1 c1f1 = c30561an.A00;
                    c1f1.A04 = false;
                    c1f1.A0B.setLayerType(0, null);
                    if (Build.VERSION.SDK_INT >= 21) {
                        c30561an.setElevation(0.0f);
                        c30561an.setClipToOutline(false);
                        c30561an.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
                    }
                }
            }
        }), new C08D(this, new C08C() { // from class: X.1gi
            @Override // X.C08C
            public void A5g(Context context, Object obj, Object obj2, Object obj3) {
                ((View) obj).setVisibility(((AnonymousClass089) obj2).A00);
            }

            @Override // X.C08C
            public boolean AUY(Object obj, Object obj2, Object obj3, Object obj4) {
                return ((AnonymousClass089) obj2).A00 != ((AnonymousClass089) obj).A00;
            }

            @Override // X.C08C
            public void AVh(Context context, Object obj, Object obj2, Object obj3) {
                ((View) obj).setVisibility(0);
            }
        })};
        for (int i = 0; i < 2; i++) {
            A06(c08dArr[i]);
        }
    }

    @Override // X.C08A, X.AbstractC016307p
    public Object A07(Context context) {
        return new C30561an(context);
    }

    @Override // X.C08A
    public C1YV A08(Context context) {
        return new C30561an(context);
    }

    @Override // X.AbstractC016307p, X.C07T
    public /* bridge */ /* synthetic */ C07T AGA() {
        return super.AGA();
    }
}
