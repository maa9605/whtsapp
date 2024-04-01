package X;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.google.android.search.verification.client.R;
import java.text.BreakIterator;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.2jk */
/* loaded from: classes2.dex */
public abstract class AbstractCallableC55022jk implements Callable {
    public final C0HE A00 = new C0HE();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.2jt] */
    /* JADX WARN: Type inference failed for: r6v11, types: [X.2ji] */
    /* JADX WARN: Type inference failed for: r6v3, types: [X.2jr] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r6v7, types: [android.text.SpannableStringBuilder, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.String] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        CharSequence subSequence;
        String str;
        Object c55112jt;
        C0HE c0he = this.A00;
        if (!c0he.A03()) {
            if (!(this instanceof C55072jp)) {
                if (!(this instanceof C55032jl)) {
                    if (this instanceof C55082jq) {
                        C55082jq c55082jq = (C55082jq) this;
                        CharSequence charSequence = c55082jq.A08;
                        if (TextUtils.isEmpty(charSequence)) {
                            c55112jt = "";
                        } else {
                            CharSequence A0Q = AnonymousClass029.A0Q(c55082jq.A04, c55082jq.A07, charSequence.toString().replace("\n", " "));
                            Context context = c55082jq.A02;
                            List list = c55082jq.A09;
                            C002301c c002301c = c55082jq.A05;
                            C0FK A00 = AbstractC54772jK.A00(context, A0Q, list, AbstractC54772jK.A02, true, c002301c);
                            C0HE c0he2 = ((AbstractCallableC55022jk) c55082jq).A00;
                            c0he2.A02();
                            CharSequence charSequence2 = (CharSequence) A00.A00;
                            Object obj = A00.A01;
                            if (obj != null) {
                                List list2 = (List) obj;
                                C0GP c0gp = new C0GP(1, 460, charSequence2 == null ? 0 : charSequence2.length());
                                if (!TextUtils.isEmpty(charSequence2) && !list2.isEmpty()) {
                                    Paint paint = c55082jq.A03;
                                    float measureText = paint.measureText(charSequence2, 0, charSequence2.length());
                                    float f = c55082jq.A00 * c55082jq.A01;
                                    if (measureText <= f) {
                                        c55112jt = C002701i.A0f(charSequence2, context, paint, c0gp, c55082jq.A06);
                                    } else {
                                        BreakIterator A02 = C09940f2.A02(c002301c);
                                        A02.setText(charSequence2.toString());
                                        List A002 = C55082jq.A00(list2, 20, A02, charSequence2.length());
                                        c55112jt = new SpannableStringBuilder();
                                        c55082jq.A01(charSequence2, A002, c55112jt);
                                        c0he2.A02();
                                        int i = 10;
                                        while (paint.measureText((CharSequence) c55112jt, 0, c55112jt.length()) <= f && c55112jt.length() < charSequence2.length()) {
                                            c0he2.A02();
                                            c55112jt.clear();
                                            A002 = C55082jq.A00(A002, i, A02, charSequence2.length());
                                            c55082jq.A01(charSequence2, A002, c55112jt);
                                            c0he2.A02();
                                            i += 10;
                                        }
                                    }
                                } else {
                                    c55112jt = C002701i.A0f(charSequence2, context, c55082jq.A03, c0gp, c55082jq.A06);
                                }
                            } else {
                                throw null;
                            }
                        }
                    } else {
                        C55012jj c55012jj = (C55012jj) this;
                        C54972jf c54972jf = c55012jj.A01;
                        C05W c05w = c54972jf.A04;
                        AbstractC005302j abstractC005302j = c55012jj.A00;
                        C06C A0A = c05w.A0A(abstractC005302j);
                        AnonymousClass092 A03 = c54972jf.A0A.A03(abstractC005302j);
                        C03370Fl A07 = c54972jf.A0C.A07(abstractC005302j);
                        AbstractC005302j A072 = C23X.A07(A03, A0A);
                        C06C A0A2 = A072 == null ? null : c05w.A0A(A072);
                        ((AbstractCallableC55022jk) c55012jj).A00.A02();
                        c55112jt = new C55002ji(A0A, A03, A07, A0A2);
                    }
                } else {
                    C55032jl c55032jl = (C55032jl) this;
                    C05W c05w2 = c55032jl.A00;
                    AnonymousClass092 anonymousClass092 = c55032jl.A01;
                    AbstractC005302j abstractC005302j2 = anonymousClass092.A0n.A00;
                    if (abstractC005302j2 != null) {
                        C06C A0A3 = c05w2.A0A(abstractC005302j2);
                        ((AbstractCallableC55022jk) c55032jl).A00.A02();
                        AbstractC005302j A073 = C23X.A07(anonymousClass092, A0A3);
                        c55112jt = new C55092jr(A0A3, A073 == null ? null : c05w2.A0A(A073), anonymousClass092);
                    } else {
                        throw null;
                    }
                }
            } else {
                C55072jp c55072jp = (C55072jp) this;
                Context context2 = c55072jp.A01;
                C55102js A003 = C55102js.A00(context2, c55072jp.A06, c55072jp.A00, c55072jp.A04);
                C0HE c0he3 = ((AbstractCallableC55022jk) c55072jp).A00;
                c0he3.A02();
                String str2 = A003.A01;
                if (str2 == null) {
                    subSequence = context2.getString(R.string.view_message);
                } else {
                    CharSequence A022 = AbstractC54772jK.A02(context2, C002701i.A0d(str2, context2, c55072jp.A02.getPaint(), c55072jp.A05), c55072jp.A07, c55072jp.A03);
                    subSequence = A022.subSequence(0, Math.min(200, A022.length()));
                }
                c0he3.A02();
                String str3 = A003.A03;
                String str4 = A003.A02;
                StringBuilder sb = new StringBuilder();
                str = "";
                String str5 = str3;
                if (str3 == null) {
                    str5 = "";
                }
                sb.append(str5);
                if (!TextUtils.isEmpty(str4)) {
                    str = C000200d.A0L(new StringBuilder(), str3 != null ? "\n" : "", str4);
                }
                sb.append(str);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.toString());
                if (!TextUtils.isEmpty(str4)) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(C02160Ac.A00(context2, R.color.secondary_text)), str3 == null ? 0 : str3.length(), spannableStringBuilder.length(), 0);
                }
                c0he3.A02();
                c0he3.A02();
                c55112jt = new C55112jt(A003, subSequence, (SpannableStringBuilder) AbstractC54772jK.A02(context2, spannableStringBuilder, c55072jp.A07, c55072jp.A03));
            }
            if (!c0he.A03()) {
                return c55112jt;
            }
        }
        throw new C0S2();
    }
}
