package X;

import android.graphics.RectF;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.30Y  reason: invalid class name */
/* loaded from: classes2.dex */
public class C30Y {
    public final LinkedList A00 = new LinkedList();

    public C2HG A00(List list) {
        LinkedList linkedList = this.A00;
        if (linkedList.isEmpty()) {
            return null;
        }
        C30X c30x = (C30X) linkedList.removeLast();
        if (c30x instanceof C67933Hk) {
            C67933Hk c67933Hk = (C67933Hk) c30x;
            C2HG c2hg = ((C30X) c67933Hk).A00;
            C30R c30r = c67933Hk.A00;
            if (!(c2hg instanceof C67883Hf)) {
                c2hg.A03.set(c30r.A03);
                c2hg.A00 = c30r.A00;
                c2hg.A08(c30r.A02);
                c2hg.A06(c30r.A01);
            } else {
                C67883Hf c67883Hf = (C67883Hf) c2hg;
                ((C2HG) c67883Hf).A03.set(c30r.A03);
                ((C2HG) c67883Hf).A00 = c30r.A00;
                c67883Hf.A08(c30r.A02);
                c67883Hf.A06(c30r.A01);
                C67873He c67873He = (C67873He) c30r;
                c67883Hf.A0J(c67873He.A01, c67873He.A00);
            }
        } else if (c30x instanceof C67923Hj) {
            C67923Hj c67923Hj = (C67923Hj) c30x;
            list.add(c67923Hj.A00, ((C30X) c67923Hj).A00);
        } else if (!(c30x instanceof C67913Hi)) {
            list.remove(c30x.A00);
        } else {
            C67913Hi c67913Hi = (C67913Hi) c30x;
            list.remove(((C30X) c67913Hi).A00);
            list.add(c67913Hi.A00, ((C30X) c67913Hi).A00);
        }
        if ((c30x instanceof C67923Hj) && !linkedList.isEmpty()) {
            C30X c30x2 = (C30X) linkedList.getLast();
            if ((c30x2 instanceof C67933Hk) && c30x2.A00 == c30x.A00) {
                A00(list);
            }
            return null;
        } else if (c30x instanceof C67903Hh) {
            return c30x.A00;
        } else {
            return null;
        }
    }

    public String A01(List list) {
        String str;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            C30X c30x = (C30X) it.next();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("shape_index", list.indexOf(c30x.A00));
            if (c30x instanceof C67933Hk) {
                str = "undo_modify_shape";
            } else if (c30x instanceof C67923Hj) {
                str = "undo_delete_shape";
            } else if (!(c30x instanceof C67913Hi)) {
                str = "undo_add_shape";
            } else {
                str = "undo_change_z_order";
            }
            jSONObject2.put("type", str);
            if (!(c30x instanceof C67933Hk)) {
                if (c30x instanceof C67923Hj) {
                    jSONObject2.put("index", ((C67923Hj) c30x).A00);
                }
            } else {
                C67933Hk c67933Hk = (C67933Hk) c30x;
                jSONObject2.put("color", c67933Hk.A00.A02);
                jSONObject2.put("rotate", c67933Hk.A00.A00);
                jSONObject2.put("strokeWidth", c67933Hk.A00.A01);
                jSONObject2.put("left", c67933Hk.A00.A03.left);
                jSONObject2.put("right", c67933Hk.A00.A03.right);
                jSONObject2.put("top", c67933Hk.A00.A03.top);
                jSONObject2.put("bottom", c67933Hk.A00.A03.bottom);
                C30R c30r = c67933Hk.A00;
                if (c30r instanceof C67873He) {
                    C67873He c67873He = (C67873He) c30r;
                    jSONObject2.put("text", c67873He.A01);
                    jSONObject2.put("fontStyle", c67873He.A00);
                }
            }
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("actions", jSONArray);
        return jSONObject.toString();
    }

    public void A02(String str, List list) {
        char c;
        C30X c67903Hh;
        JSONArray jSONArray = new JSONObject(str).getJSONArray("actions");
        LinkedList linkedList = this.A00;
        linkedList.clear();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String string = jSONObject.getString("type");
            switch (string.hashCode()) {
                case 49116392:
                    if (string.equals("undo_add_shape")) {
                        c = 0;
                        break;
                    } else {
                        continue;
                    }
                case 1021915016:
                    if (string.equals("undo_delete_shape")) {
                        c = 1;
                        break;
                    } else {
                        continue;
                    }
                case 1953129077:
                    if (string.equals("undo_change_z_order")) {
                        c = 3;
                        break;
                    } else {
                        continue;
                    }
                case 1971936087:
                    if (string.equals("undo_modify_shape")) {
                        c = 2;
                        break;
                    } else {
                        continue;
                    }
                default:
            }
            if (c == 0) {
                c67903Hh = new C67903Hh();
            } else if (c == 1) {
                c67903Hh = new C67923Hj();
            } else if (c == 2) {
                c67903Hh = new C67933Hk();
            } else if (c == 3) {
                c67903Hh = new C67913Hi();
            }
            C30X c30x = c67903Hh;
            if (!(c67903Hh instanceof C67933Hk)) {
                if (c67903Hh instanceof C67923Hj) {
                    ((C67923Hj) c30x).A00 = jSONObject.getInt("index");
                }
            } else {
                C67933Hk c67933Hk = (C67933Hk) c30x;
                RectF rectF = new RectF();
                rectF.left = (float) jSONObject.getDouble("left");
                rectF.right = (float) jSONObject.getDouble("right");
                rectF.top = (float) jSONObject.getDouble("top");
                rectF.bottom = (float) jSONObject.getDouble("bottom");
                int i2 = jSONObject.getInt("color");
                float f = (float) jSONObject.getDouble("rotate");
                float f2 = (float) jSONObject.getDouble("strokeWidth");
                if (jSONObject.has("text")) {
                    c67933Hk.A00 = new C67873He(rectF, f, i2, f2, jSONObject.getString("text"), jSONObject.getInt("fontStyle"));
                } else {
                    c67933Hk.A00 = new C30R(rectF, f, i2, f2);
                }
            }
            int i3 = jSONObject.getInt("shape_index");
            if (i3 >= 0 && i3 < list.size()) {
                c67903Hh.A00 = (C2HG) list.get(i3);
                linkedList.add(c67903Hh);
            }
        }
    }
}
