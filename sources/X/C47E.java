package X;

import android.app.DatePickerDialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.search.verification.client.R;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.47E  reason: invalid class name */
/* loaded from: classes3.dex */
public final class C47E extends AbstractC30911bN {
    public final /* synthetic */ C016807u A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47E(C016807u c016807u, AnonymousClass087 anonymousClass087, C016807u c016807u2) {
        super(c016807u, anonymousClass087);
        this.A00 = c016807u2;
    }

    @Override // X.AbstractC30911bN, X.AbstractC016307p
    public Object A07(Context context) {
        return View.inflate(context, R.layout.date_picker, null);
    }

    @Override // X.AbstractC30911bN
    public View A08(Context context) {
        return View.inflate(context, R.layout.date_picker, null);
    }

    @Override // X.AbstractC30911bN
    public void A0A(View view, final AnonymousClass087 anonymousClass087, C016807u c016807u, Object obj) {
        Long l;
        TextView textView = (TextView) view.findViewById(R.id.hintOrDate);
        TextInputLayout textInputLayout = (TextInputLayout) view.findViewById(R.id.inputView);
        final C016807u c016807u2 = this.A00;
        String str = (String) c016807u2.A00.A00(AnonymousClass465.A02);
        if (str != null) {
            textInputLayout.setHint(str);
        }
        Calendar calendar = Calendar.getInstance();
        String str2 = (String) c016807u2.A00.A00(AnonymousClass465.A00);
        if (!TextUtils.isEmpty(str2)) {
            Date A07 = C45Q.A07(str2);
            if (A07 != null) {
                textView.setText(DateFormat.getDateInstance(1).format(A07));
                calendar.setTime(A07);
            }
        } else {
            AnonymousClass084 anonymousClass084 = AnonymousClass465.A05;
            if (c016807u2.A04(anonymousClass084, 0) != 0) {
                calendar.set(1, c016807u2.A04(anonymousClass084, 0) + calendar.get(1));
            }
        }
        DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() { // from class: X.2nl
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                C47E.this.A0C(anonymousClass087, c016807u2, i, i2, i3);
            }
        };
        boolean z = !Boolean.FALSE.equals(Boolean.valueOf(c016807u2.A8Z(AnonymousClass465.A01, true)));
        textView.setEnabled(z);
        textView.setClickable(z);
        String str3 = (String) c016807u2.A00.A00(AnonymousClass465.A03);
        try {
            l = Long.valueOf(Long.parseLong(str3));
        } catch (NumberFormatException unused) {
            StringBuilder sb = new StringBuilder("WaDatePicker/bind Max date is not a valid date format");
            sb.append(str3);
            AnonymousClass088.A1i("WaRcDatePickerComponentBinder", sb.toString());
            l = null;
        }
        if (!z) {
            textView.setOnClickListener(null);
            return;
        }
        C47R c47r = new C47R(anonymousClass087.A00, onDateSetListener, calendar.get(1), calendar.get(2), calendar.get(5));
        if (l != null) {
            c47r.A01.setMaxDate(l.longValue());
        }
        textView.setOnClickListener(new View$OnClickListenerC56652nm(c47r));
    }

    @Override // X.AbstractC30911bN
    public void A0B(View view, AnonymousClass087 anonymousClass087, C016807u c016807u, Object obj) {
        TextView textView = (TextView) view.findViewById(R.id.hintOrDate);
        textView.setOnClickListener(null);
        textView.setText("");
        textView.setEnabled(false);
        textView.setClickable(false);
        ((TextInputLayout) view.findViewById(R.id.inputView)).setHint("");
    }

    public void A0C(AnonymousClass087 anonymousClass087, C016807u c016807u, int i, int i2, int i3) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, i);
        calendar.set(2, i2);
        calendar.set(5, i3);
        final String format = new SimpleDateFormat("dd/MM/yyyy", Locale.US).format(calendar.getTime());
        C020209i c020209i = (C020209i) anonymousClass087.A00(R.id.bk_context_key_tree);
        c020209i.A03(((AbstractC016907v) c016807u).A00, new AbstractC25291Eu() { // from class: X.46h
            @Override // X.AbstractC25291Eu
            public void A00(InterfaceC017107x interfaceC017107x) {
                ((C016807u) interfaceC017107x).A00.A02(AnonymousClass465.A00, format);
            }
        });
        c020209i.A02();
        C09P AA3 = c016807u.AA3(AnonymousClass465.A04);
        if (AA3 != null) {
            int i4 = ((AbstractC016907v) c016807u).A00;
            ArrayList arrayList = new ArrayList();
            InterfaceC020509l A0f = AnonymousClass088.A0f(format);
            if (arrayList.size() == 0) {
                arrayList.add(A0f);
                AbstractC021009q A0c = AnonymousClass088.A0c(i3);
                if (arrayList.size() == 1) {
                    arrayList.add(A0c);
                    AbstractC021009q A0c2 = AnonymousClass088.A0c(i2);
                    if (arrayList.size() == 2) {
                        arrayList.add(A0c2);
                        AbstractC021009q A0c3 = AnonymousClass088.A0c(i);
                        if (arrayList.size() == 3) {
                            arrayList.add(A0c3);
                            C25031Du.A00(i4, AA3, new C021109r(arrayList), anonymousClass087);
                            return;
                        }
                        throw new IllegalArgumentException("arguments have to be continuous");
                    }
                    throw new IllegalArgumentException("arguments have to be continuous");
                }
                throw new IllegalArgumentException("arguments have to be continuous");
            }
            throw new IllegalArgumentException("arguments have to be continuous");
        }
    }
}
