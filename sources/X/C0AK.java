package X;

import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;

/* renamed from: X.0AK  reason: invalid class name */
/* loaded from: classes.dex */
public class C0AK {
    public Object A00(AnonymousClass087 anonymousClass087, AnonymousClass080 anonymousClass080) {
        AnonymousClass081 anonymousClass081 = (AnonymousClass081) anonymousClass080;
        int ADL = anonymousClass081.ADL();
        if (ADL != 13337) {
            if (ADL != 13688) {
                return null;
            }
            C33811gV c33811gV = new C33811gV(null);
            c33811gV.A00 = anonymousClass081.AAF(C25181Ej.A00, 1.0f);
            c33811gV.A04 = anonymousClass081.AAF(C25181Ej.A04, 0.0f);
            c33811gV.A05 = anonymousClass081.AAF(C25181Ej.A05, 0.0f);
            c33811gV.A02 = anonymousClass081.AAF(C25181Ej.A02, 1.0f);
            c33811gV.A03 = anonymousClass081.AAF(C25181Ej.A03, 1.0f);
            c33811gV.A01 = anonymousClass081.AAF(C25181Ej.A01, 0.0f);
            return c33811gV;
        }
        return new C1EC(anonymousClass081.ADJ(C25161Eh.A00), null);
    }

    public void A01(final AnonymousClass087 anonymousClass087, Object obj, AnonymousClass080 anonymousClass080, AnonymousClass080 anonymousClass0802) {
        final AnonymousClass081 anonymousClass081 = (AnonymousClass081) anonymousClass080;
        final View view = (View) obj;
        final AbstractC016907v abstractC016907v = (AbstractC016907v) anonymousClass0802;
        int ADL = anonymousClass081.ADL();
        if (ADL == 13313) {
            boolean z = false;
            boolean z2 = true;
            if (!anonymousClass081.A8Z(C1ET.A01, true)) {
                view.setImportantForAccessibility(2);
                z2 = false;
            }
            if (z2 | ((anonymousClass081.ADJ(C1ET.A03) == null && anonymousClass081.ADJ(C1ET.A04) == null) ? true : true)) {
                view.setImportantForAccessibility(1);
                view.setFocusable(true);
            }
            C0AT.A0c(view, new C0AS(anonymousClass081) { // from class: X.1gU
                public final AnonymousClass081 A00;

                {
                    this.A00 = anonymousClass081;
                }

                @Override // X.C0AS
                public void A04(View view2, C08420bS c08420bS) {
                    View.AccessibilityDelegate accessibilityDelegate = this.A01;
                    AccessibilityNodeInfo accessibilityNodeInfo = c08420bS.A02;
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfo);
                    AnonymousClass081 anonymousClass0812 = this.A00;
                    String ADJ = anonymousClass0812.ADJ(C1ET.A03);
                    String ADJ2 = anonymousClass0812.ADJ(C1ET.A04);
                    if (ADJ != null) {
                        accessibilityNodeInfo.setContentDescription(ADJ);
                    }
                    if (ADJ2 != null) {
                        char c = 65535;
                        switch (ADJ2.hashCode()) {
                            case -2137403731:
                                if (ADJ2.equals("Header")) {
                                    c = 2;
                                    break;
                                }
                                break;
                            case -565577257:
                                if (ADJ2.equals("Image Button")) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case 2368538:
                                if (ADJ2.equals("Link")) {
                                    c = 6;
                                    break;
                                }
                                break;
                            case 70760763:
                                if (ADJ2.equals("Image")) {
                                    c = 4;
                                    break;
                                }
                                break;
                            case 1366165871:
                                if (ADJ2.equals("Tab Widget")) {
                                    c = 5;
                                    break;
                                }
                                break;
                            case 1404906583:
                                if (ADJ2.equals("Selected Button")) {
                                    c = 3;
                                    break;
                                }
                                break;
                            case 2001146706:
                                if (ADJ2.equals("Button")) {
                                    c = 0;
                                    break;
                                }
                                break;
                        }
                        switch (c) {
                            case 0:
                            case 1:
                                accessibilityNodeInfo.setClassName("android.widget.Button");
                                break;
                            case 2:
                                if (Build.VERSION.SDK_INT >= 28) {
                                    accessibilityNodeInfo.setHeading(true);
                                } else {
                                    c08420bS.A05(2, true);
                                }
                                C0AT.A0M(view2);
                                break;
                            case 3:
                                accessibilityNodeInfo.setClassName("android.widget.Button");
                                accessibilityNodeInfo.setSelected(true);
                                break;
                            case 4:
                                accessibilityNodeInfo.setClassName("android.widget.ImageView");
                                c08420bS.A07(C08440bU.A07);
                                break;
                            case 5:
                                accessibilityNodeInfo.setClassName("android.widget.TabWidget");
                                break;
                            case 6:
                                accessibilityNodeInfo.setClassName("android.widget.Button");
                                break;
                        }
                    }
                    String ADJ3 = anonymousClass0812.ADJ(C1ET.A02);
                    if (ADJ3 != null) {
                        c08420bS.A06(new C08440bU(16, ADJ3));
                    }
                    boolean A8Z = anonymousClass0812.A8Z(C1ET.A05, false);
                    boolean A8Z2 = anonymousClass0812.A8Z(C1ET.A00, false);
                    accessibilityNodeInfo.setSelected(A8Z);
                    accessibilityNodeInfo.setEnabled(!A8Z2);
                }
            });
        } else if (ADL == 13337) {
            EditText editText = (EditText) view;
            if (anonymousClass081.ADJ(C25161Eh.A00) != null) {
                C1EC c1ec = (C1EC) AnonymousClass088.A0o(anonymousClass087, anonymousClass081);
                c1ec.A00 = editText;
                editText.removeTextChangedListener(c1ec);
                editText.addTextChangedListener(c1ec);
            }
        } else if (ADL == 13656) {
            Runnable runnable = new Runnable() { // from class: X.1En
                @Override // java.lang.Runnable
                public void run() {
                    view.setTag(R.id.render_lifecycle_extension_runnable, null);
                    AbstractC016907v abstractC016907v2 = abstractC016907v;
                    int i = abstractC016907v2.A00;
                    C09P AA3 = anonymousClass081.AA3(C1EZ.A00);
                    ArrayList arrayList = new ArrayList();
                    InterfaceC020509l A0f = AnonymousClass088.A0f(abstractC016907v2);
                    if (arrayList.size() == 0) {
                        arrayList.add(A0f);
                        C25031Du.A00(i, AA3, new C021109r(arrayList), anonymousClass087);
                        return;
                    }
                    throw new IllegalArgumentException("arguments have to be continuous");
                }
            };
            view.setTag(R.id.render_lifecycle_extension_runnable, runnable);
            view.post(runnable);
        } else if (ADL == 13688) {
            C33811gV c33811gV = (C33811gV) AnonymousClass088.A0o(anonymousClass087, anonymousClass081);
            if (c33811gV == null) {
                AnonymousClass088.A1i("ViewTransformsExtensionBinderUtils", "Null controller while binding ViewTransformsExtension");
                return;
            }
            c33811gV.A06 = view;
            view.setAlpha(c33811gV.A00);
            view.setRotation(c33811gV.A01);
            view.setTranslationX(TypedValue.applyDimension(1, c33811gV.A04, view.getContext().getResources().getDisplayMetrics()));
            view.setTranslationY(TypedValue.applyDimension(1, c33811gV.A05, view.getContext().getResources().getDisplayMetrics()));
            view.setScaleX(c33811gV.A02);
            view.setScaleY(c33811gV.A03);
            c33811gV.A06 = view;
        }
    }

    public void A02(AnonymousClass087 anonymousClass087, Object obj, AnonymousClass080 anonymousClass080, AnonymousClass080 anonymousClass0802) {
        AnonymousClass081 anonymousClass081 = (AnonymousClass081) anonymousClass080;
        View view = (View) obj;
        int ADL = anonymousClass081.ADL();
        if (ADL == 13313) {
            C0AT.A0c(view, null);
            view.setImportantForAccessibility(0);
            view.setFocusable(false);
        } else if (ADL == 13337) {
            if (anonymousClass081.ADJ(C25161Eh.A00) != null) {
                C1EC c1ec = (C1EC) AnonymousClass088.A0o(anonymousClass087, anonymousClass081);
                c1ec.A00 = null;
                ((TextView) view).removeTextChangedListener(c1ec);
            }
        } else if (ADL == 13656) {
            Runnable runnable = (Runnable) view.getTag(R.id.render_lifecycle_extension_runnable);
            if (runnable != null) {
                view.removeCallbacks(runnable);
            }
        } else if (ADL == 13688) {
            C33811gV c33811gV = (C33811gV) AnonymousClass088.A0o(anonymousClass087, anonymousClass081);
            if (c33811gV == null) {
                AnonymousClass088.A1i("ViewTransformsExtensionBinderUtils", "Null controller while binding ViewTransformsExtension");
                return;
            }
            c33811gV.A06 = null;
            view.setAlpha(1.0f);
            view.setRotation(0.0f);
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            c33811gV.A06 = null;
        }
    }
}
