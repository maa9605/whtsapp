package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.JsonReader;
import android.util.JsonWriter;
import android.util.SparseArray;
import com.google.android.search.verification.client.R;
import com.instagram.common.bloks.errorreporting.BloksErrorReporter;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.1fh */
/* loaded from: classes.dex */
public class C33311fh implements InterfaceC021309t {
    public static Activity A00(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return A00(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static C0AO A01(String str, C021209s c021209s) {
        C1YX.A00("ParseEmbedded", null);
        try {
            try {
                C09M.A00();
                C33831gX c33831gX = new C33831gX(new JsonReader(new StringReader(str)));
                c33831gX.AGm();
                C25311Ew c25311Ew = C09M.A00().A09;
                C25331Ey c25331Ey = new C25331Ey();
                if (c33831gX.A01 != C0AM.START_OBJECT) {
                    c33831gX.AUv();
                    c25331Ey = null;
                } else {
                    while (c33831gX.AGm() != C0AM.END_OBJECT) {
                        String str2 = c33831gX.A02;
                        c33831gX.AGm();
                        if ("layout".equals(str2)) {
                            c25331Ey.A00 = C08i.A0A(c33831gX, c25311Ew);
                        }
                        c33831gX.AUv();
                    }
                }
                AnonymousClass080 anonymousClass080 = c25331Ey.A00;
                if (anonymousClass080 instanceof C33901ge) {
                    ArrayList arrayList = new ArrayList();
                    Map map = (Map) c021209s.A00.get(R.id.bloks_interpreter_manifest_entries);
                    for (String str3 : ((C33901ge) anonymousClass080).A02) {
                        if (map.containsKey(str3)) {
                            arrayList.add(map.get(str3));
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Data Manifest for id ");
                            sb.append(str3);
                            sb.append(" not found!");
                            throw new IllegalArgumentException(sb.toString());
                        }
                    }
                    return new C0AO(((C33901ge) anonymousClass080).A00, arrayList);
                }
                throw new IllegalArgumentException("Embedded payload not in nested format");
            } catch (IOException unused) {
                throw new IllegalArgumentException("Could not parse embedded payload");
            }
        } finally {
            C20500xd.A00();
        }
    }

    public static InterfaceC020509l A02(C021209s c021209s, Map map) {
        C1YX.A00("InflateSync", null);
        try {
            Iterator it = map.entrySet().iterator();
            C09M.A00();
            C33961gk c33961gk = new C33961gk(it);
            c33961gk.AGm();
            C25311Ew c25311Ew = (C25311Ew) c021209s.A00.get(R.id.bloks_global_parser_map);
            return AnonymousClass088.A0f((AnonymousClass080) ((InterfaceC25301Ev) c25311Ew.A00.get(AnonymousClass080.class)).AQZ(c33961gk, c25311Ew));
        } catch (IOException e) {
            BloksErrorReporter.softReport("inflate_sync_error", e);
            return C0A6.A00;
        } finally {
            C20500xd.A00();
        }
    }

    public static String A03(InterfaceC020509l interfaceC020509l) {
        if (interfaceC020509l instanceof AbstractC021009q) {
            return interfaceC020509l.toString();
        }
        if (interfaceC020509l instanceof C0A8) {
            return String.valueOf(AnonymousClass088.A0q(interfaceC020509l));
        }
        return interfaceC020509l.toString();
    }

    public static String A04(InterfaceC020509l interfaceC020509l, boolean z) {
        if (interfaceC020509l instanceof C0A8) {
            Object A0q = AnonymousClass088.A0q(interfaceC020509l);
            if ((A0q instanceof List) || (A0q instanceof Map)) {
                StringWriter stringWriter = new StringWriter();
                JsonWriter jsonWriter = new JsonWriter(stringWriter);
                try {
                    A08(interfaceC020509l, jsonWriter, z);
                    jsonWriter.close();
                    return stringWriter.toString();
                } catch (IOException e) {
                    StringBuilder sb = new StringBuilder("Exception in serialization ");
                    sb.append(e);
                    return sb.toString();
                }
            } else if (A0q == null) {
                return "";
            }
        }
        return A03(interfaceC020509l);
    }

    public static ArrayList A05(JSONArray jSONArray) {
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof String) {
                arrayList.add(AnonymousClass088.A0f(obj));
            } else if (obj instanceof JSONObject) {
                arrayList.add(AnonymousClass088.A0f(A06((JSONObject) obj)));
            } else if (obj instanceof JSONArray) {
                arrayList.add(AnonymousClass088.A0f(A05((JSONArray) obj)));
            } else if (obj instanceof Integer) {
                arrayList.add(AnonymousClass088.A0c(((Number) obj).intValue()));
            } else if (obj instanceof Double) {
                arrayList.add(new C020909p(((Number) obj).doubleValue()));
            } else if (obj instanceof Float) {
                arrayList.add(new C020909p(((Number) obj).floatValue()));
            } else if (obj instanceof Boolean) {
                arrayList.add(AnonymousClass088.A0c(((Boolean) obj).booleanValue() ? 1 : 0));
            } else if (obj instanceof Long) {
                arrayList.add(new C0A7(((Number) obj).longValue()));
            }
        }
        return arrayList;
    }

    public static HashMap A06(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            InterfaceC020509l A0f = AnonymousClass088.A0f(next);
            if (obj instanceof String) {
                hashMap.put(A0f, AnonymousClass088.A0f(obj));
            } else if (obj instanceof JSONObject) {
                hashMap.put(A0f, AnonymousClass088.A0f(A06((JSONObject) obj)));
            } else if (obj instanceof JSONArray) {
                hashMap.put(A0f, AnonymousClass088.A0f(A05((JSONArray) obj)));
            } else if (obj instanceof Integer) {
                hashMap.put(A0f, AnonymousClass088.A0c(((Number) obj).intValue()));
            } else if (obj instanceof Double) {
                hashMap.put(A0f, new C020909p(((Number) obj).doubleValue()));
            } else if (obj instanceof Float) {
                hashMap.put(A0f, new C020909p(((Number) obj).floatValue()));
            } else if (obj instanceof Boolean) {
                hashMap.put(A0f, AnonymousClass088.A0c(((Boolean) obj).booleanValue() ? 1 : 0));
            } else if (obj instanceof Long) {
                hashMap.put(A0f, new C0A7(((Number) obj).longValue()));
            }
        }
        return hashMap;
    }

    public static Map A07(C021209s c021209s) {
        SparseArray sparseArray = c021209s.A00;
        Map map = (Map) sparseArray.get(R.id.bloks_interpreter_variables_override);
        if (map != null) {
            return map;
        }
        C020209i A0a = AnonymousClass088.A0a((AnonymousClass087) sparseArray.get(R.id.bloks_global_bloks_context));
        if (C0AQ.A02()) {
            return A0a.A06;
        }
        throw new RuntimeException("Committed Variables can only be read from the UI Thread");
    }

    public static void A08(InterfaceC020509l interfaceC020509l, JsonWriter jsonWriter, boolean z) {
        if (interfaceC020509l instanceof AbstractC021009q) {
            jsonWriter.value((Number) interfaceC020509l);
        } else if (interfaceC020509l instanceof C0A8) {
            Object A0q = AnonymousClass088.A0q(interfaceC020509l);
            if (A0q instanceof String) {
                jsonWriter.value((String) A0q);
            } else if (A0q instanceof Map) {
                jsonWriter.beginObject();
                if (z) {
                    TreeMap treeMap = new TreeMap();
                    for (Map.Entry entry : ((Map) A0q).entrySet()) {
                        treeMap.put(A03((InterfaceC020509l) entry.getKey()), entry.getValue());
                    }
                    for (Map.Entry entry2 : treeMap.entrySet()) {
                        jsonWriter.name((String) entry2.getKey());
                        A08((InterfaceC020509l) entry2.getValue(), jsonWriter, z);
                    }
                } else {
                    for (Map.Entry entry3 : ((Map) A0q).entrySet()) {
                        jsonWriter.name(A03((InterfaceC020509l) entry3.getKey()));
                        A08((InterfaceC020509l) entry3.getValue(), jsonWriter, z);
                    }
                }
                jsonWriter.endObject();
            } else if (A0q instanceof List) {
                jsonWriter.beginArray();
                for (InterfaceC020509l interfaceC020509l2 : (List) A0q) {
                    A08(interfaceC020509l2, jsonWriter, z);
                }
                jsonWriter.endArray();
            } else if (A0q == null) {
                jsonWriter.nullValue();
            } else {
                jsonWriter.value(String.valueOf(A0q));
            }
        } else {
            jsonWriter.value(String.valueOf(interfaceC020509l));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x0034, code lost:
        if (r1.equals("bk.action.bloks.ReplaceEmbeddedChildren") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x003f, code lost:
        if (r1.equals("bk.action.internal.MinificationMode") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x004a, code lost:
        if (r1.equals("bk.action.bloks.InsertEmbeddedChildrenAfter") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x0055, code lost:
        if (r1.equals("bk.action.bloks.ReplaceChildren") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x0060, code lost:
        if (r1.equals("bk.action.bloks.ReplaceEmbeddedChild") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x006b, code lost:
        if (r1.equals("bk.action.bloks.GetState") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x0076, code lost:
        if (r1.equals("bk.action.bloks.ReplaceEmbeddedChildV2") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:518:0x0081, code lost:
        if (r1.equals("bk.action.bloks.ReplaceEmbeddedChildrenAfter") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:521:0x008c, code lost:
        if (r1.equals("bk.action.component.GetWidth") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:524:0x0096, code lost:
        if (r1.equals("bk.action.bloks.PrependChildren") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x00a2, code lost:
        if (r1.equals("bk.action.bloks.InsertEmbeddedChildrenBefore") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x00ae, code lost:
        if (r1.equals("bk.action.text.GetText") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:533:0x00ba, code lost:
        if (r1.equals("bk.action.bloks.AppendEmbeddedChildren") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x00c6, code lost:
        if (r1.equals("bk.action.bloks.RemoveChild") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x00d1, code lost:
        if (r1.equals("bk.action.bloks.PrependEmbeddedChildren") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:0x00dd, code lost:
        if (r1.equals("bk.action.component.SetAttr") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:545:0x00e9, code lost:
        if (r1.equals("bk.action.bloks.WriteLocalState") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:548:0x00f4, code lost:
        if (r1.equals("bk.action.bloks.RemoveChildAt") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:551:0x0100, code lost:
        if (r1.equals("bk.action.collection.SetIndex") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:554:0x010c, code lost:
        if (r1.equals("bk.action.bloks.RequestFocus") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:557:0x0118, code lost:
        if (r1.equals("bk.action.string.FromProvider") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:560:0x0123, code lost:
        if (r1.equals("bk.action.bloks.RemoveChildrenBetween") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:563:0x012f, code lost:
        if (r1.equals("bk.action.textinput.GetText") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:566:0x013b, code lost:
        if (r1.equals("bk.action.bloks.WriteGlobalConsistencyStore") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:569:0x0147, code lost:
        if (r1.equals("bk.action.bloks.InsertChildrenBefore") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:572:0x0153, code lost:
        if (r1.equals("bk.action.bloks.InflateSync") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:575:0x015f, code lost:
        if (r1.equals("bk.action.string.JsonEncodeV2") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:578:0x016b, code lost:
        if (r1.equals("bk.action.collection.SetIndexById") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:581:0x0177, code lost:
        if (r1.equals("bk.action.bloks.ReplaceChildrenAfter") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:584:0x0183, code lost:
        if (r1.equals("bk.action.bloks.ReplaceChild") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:587:0x018e, code lost:
        if (r1.equals("bk.action.bloks.FindWidget") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:590:0x019a, code lost:
        if (r1.equals("bk.action.bloks.ParseEmbeddedAsync") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:593:0x01a6, code lost:
        if (r1.equals("bk.action.string.JsonEncode") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:596:0x01b2, code lost:
        if (r1.equals("bk.action.string.JsonDecode") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:599:0x01be, code lost:
        if (r1.equals("bk.action.collection.ScrollToIndexById") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:602:0x01ca, code lost:
        if (r1.equals("bk.action.bloks.ChildAtIndex") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:605:0x01d6, code lost:
        if (r1.equals("bk.action.bool.Not") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:608:0x01e2, code lost:
        if (r1.equals("bk.action.bloks.GetVariable2") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:611:0x01ee, code lost:
        if (r1.equals("bk.action.component.GetHeight") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:614:0x01fa, code lost:
        if (r1.equals("bk.action.bloks.ShowKeyboard") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:617:0x0206, code lost:
        if (r1.equals("bk.action.bloks.AppendChildren") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:620:0x0212, code lost:
        if (r1.equals("bk.action.bloks.Inflate") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:623:0x021e, code lost:
        if (r1.equals("bk.action.bloks.Reflow") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:626:0x022a, code lost:
        if (r1.equals("bk.action.bloks.Reduce") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:629:0x0236, code lost:
        if (r1.equals("bk.action.bloks.ParseEmbedded") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:632:0x0241, code lost:
        if (r1.equals("bk.action.bloks.AddChild") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:635:0x024d, code lost:
        if (r1.equals("bk.action.bloks.DismissKeyboard") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:638:0x0259, code lost:
        if (r1.equals("bk.action.bloks.InsertChildrenAfter") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:641:0x0264, code lost:
        if (r1.equals("bk.action.bloks.FindContainer") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:644:0x0270, code lost:
        if (r1.equals("bk.action.currency.CurrencyToString") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:647:0x027b, code lost:
        if (r1.equals("bk.action.bloks.Find") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:650:0x0287, code lost:
        if (r1.equals("bk.action.bloks.GetVariableWithScope") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:653:0x0293, code lost:
        if (r1.equals("bk.action.bloks.IndexOfChild") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:656:0x029f, code lost:
        if (r1.equals("bk.action.bloks.DangerouslyGetTreeFromParseResult") == false) goto L3;
     */
    @Override // X.InterfaceC021309t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.InterfaceC020509l A7h(X.C33971gl r12, X.C021109r r13, X.C021209s r14) {
        /*
            Method dump skipped, instructions count: 3826
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33311fh.A7h(X.1gl, X.09r, X.09s):X.09l");
    }
}
