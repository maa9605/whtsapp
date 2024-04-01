package X;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;

/* renamed from: X.0Ez  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C03260Ez extends C0AK {
    @Override // X.C0AK
    public Object A00(AnonymousClass087 anonymousClass087, AnonymousClass080 anonymousClass080) {
        AnonymousClass081 anonymousClass081 = (AnonymousClass081) anonymousClass080;
        int ADL = anonymousClass081.ADL();
        if (ADL != 13566) {
            if (ADL != 13768) {
                if (ADL != 13774) {
                    if (ADL != 13914) {
                        return super.A00(anonymousClass087, anonymousClass080);
                    }
                    return new C17640sQ(null);
                }
                return new C17610sN(null);
            }
            return new C1EC(anonymousClass081.ADJ(C25161Eh.A00), null);
        }
        return null;
    }

    @Override // X.C0AK
    public void A01(AnonymousClass087 anonymousClass087, Object obj, AnonymousClass080 anonymousClass080, AnonymousClass080 anonymousClass0802) {
        AnonymousClass081 anonymousClass081 = (AnonymousClass081) anonymousClass080;
        View view = (View) obj;
        AbstractC016907v abstractC016907v = (AbstractC016907v) anonymousClass0802;
        int ADL = anonymousClass081.ADL();
        if (ADL == 13566) {
            view.setTag(anonymousClass081.ADJ(C17490sB.A00));
        } else if (ADL == 13768) {
            EditText editText = (EditText) view;
            if (anonymousClass081.ADJ(C25161Eh.A00) != null) {
                C1EC c1ec = (C1EC) AnonymousClass088.A0o(anonymousClass087, anonymousClass081);
                c1ec.A00 = editText;
                editText.removeTextChangedListener(c1ec);
                editText.addTextChangedListener(c1ec);
            }
        } else if (ADL == 13774) {
            C17610sN c17610sN = (C17610sN) AnonymousClass088.A0o(anonymousClass087, anonymousClass081);
            if (c17610sN.A00 == null) {
                ViewTreeObserver$OnGlobalLayoutListenerC17620sO viewTreeObserver$OnGlobalLayoutListenerC17620sO = new ViewTreeObserver$OnGlobalLayoutListenerC17620sO(view.getRootView());
                viewTreeObserver$OnGlobalLayoutListenerC17620sO.A03.add(new C1WO(anonymousClass081, abstractC016907v, anonymousClass087));
                c17610sN.A00 = viewTreeObserver$OnGlobalLayoutListenerC17620sO;
            }
        } else if (ADL != 13914) {
            super.A01(anonymousClass087, obj, anonymousClass080, anonymousClass0802);
        } else {
            C17640sQ c17640sQ = (C17640sQ) AnonymousClass088.A0o(anonymousClass087, anonymousClass081);
            if (!c17640sQ.A00) {
                c17640sQ.A00 = true;
                C09P AA3 = anonymousClass081.AA3(C17510sD.A00);
                if (AA3 != null) {
                    int A8w = anonymousClass081.A8w();
                    ArrayList arrayList = new ArrayList();
                    InterfaceC020509l A0f = AnonymousClass088.A0f(abstractC016907v);
                    if (arrayList.size() == 0) {
                        arrayList.add(A0f);
                        C25031Du.A00(A8w, AA3, new C021109r(arrayList), anonymousClass087);
                    } else {
                        throw new IllegalArgumentException("arguments have to be continuous");
                    }
                }
            }
            C09P AA32 = anonymousClass081.AA3(C17510sD.A01);
            if (AA32 != null) {
                int A8w2 = anonymousClass081.A8w();
                ArrayList arrayList2 = new ArrayList();
                InterfaceC020509l A0f2 = AnonymousClass088.A0f(abstractC016907v);
                if (arrayList2.size() == 0) {
                    arrayList2.add(A0f2);
                    C25031Du.A00(A8w2, AA32, new C021109r(arrayList2), anonymousClass087);
                    return;
                }
                throw new IllegalArgumentException("arguments have to be continuous");
            }
        }
    }

    @Override // X.C0AK
    public void A02(AnonymousClass087 anonymousClass087, Object obj, AnonymousClass080 anonymousClass080, AnonymousClass080 anonymousClass0802) {
        AnonymousClass081 anonymousClass081 = (AnonymousClass081) anonymousClass080;
        View view = (View) obj;
        int ADL = anonymousClass081.ADL();
        if (ADL == 13566) {
            view.setTag(null);
        } else if (ADL == 13768) {
            if (anonymousClass081.ADJ(C25161Eh.A00) != null) {
                C1EC c1ec = (C1EC) AnonymousClass088.A0o(anonymousClass087, anonymousClass081);
                c1ec.A00 = null;
                ((TextView) view).removeTextChangedListener(c1ec);
            }
        } else if (ADL == 13774) {
            C17610sN c17610sN = (C17610sN) AnonymousClass088.A0o(anonymousClass087, anonymousClass081);
            ViewTreeObserver$OnGlobalLayoutListenerC17620sO viewTreeObserver$OnGlobalLayoutListenerC17620sO = c17610sN.A00;
            if (viewTreeObserver$OnGlobalLayoutListenerC17620sO != null) {
                viewTreeObserver$OnGlobalLayoutListenerC17620sO.A03.clear();
                ViewTreeObserver viewTreeObserver = viewTreeObserver$OnGlobalLayoutListenerC17620sO.A02.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserver$OnGlobalLayoutListenerC17620sO);
                }
                c17610sN.A00 = null;
            }
        } else if (ADL != 13914) {
            super.A02(anonymousClass087, obj, anonymousClass080, anonymousClass0802);
        } else {
            C09P AA3 = anonymousClass081.AA3(C17510sD.A02);
            if (AA3 != null) {
                int A8w = anonymousClass081.A8w();
                ArrayList arrayList = new ArrayList();
                InterfaceC020509l A0f = AnonymousClass088.A0f(anonymousClass0802);
                if (arrayList.size() == 0) {
                    arrayList.add(A0f);
                    C25031Du.A00(A8w, AA3, new C021109r(arrayList), anonymousClass087);
                    return;
                }
                throw new IllegalArgumentException("arguments have to be continuous");
            }
        }
    }
}
