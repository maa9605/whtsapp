package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.whatsapp.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2EK */
/* loaded from: classes2.dex */
public class C2EK {
    public int A00;
    public RectF A01;
    public RectF A02;
    public String A03;
    public List A04;

    public C2EK(RectF rectF, RectF rectF2, int i, List list) {
        this.A02 = rectF;
        this.A01 = rectF2;
        this.A04 = list;
        this.A00 = i;
    }

    public static Matrix A00(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2) {
        float f6;
        float f7;
        Matrix matrix = new Matrix();
        float f8 = f3 % 180.0f;
        if (f8 == 90.0f) {
            f6 = f2 / f4;
            f7 = f / f5;
        } else {
            float f9 = f2 / f5;
            f6 = f / f4;
            f7 = f9;
        }
        matrix.preScale(f6, f7);
        if (z) {
            Matrix matrix2 = new Matrix();
            matrix2.setValues(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
            matrix.preConcat(matrix2);
            float f10 = f4;
            if (f8 == 90.0f) {
                f10 = f5;
            }
            matrix.preTranslate(-f10, 0.0f);
        }
        if (z2) {
            Matrix matrix3 = new Matrix();
            matrix3.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
            matrix.preConcat(matrix3);
            float f11 = f5;
            if (f8 == 90.0f) {
                f11 = f4;
            }
            matrix.preTranslate(-f11, 0.0f);
        }
        matrix.preRotate(f3);
        if (f3 == 90.0f) {
            matrix.preTranslate(0.0f, -f5);
        } else if (f3 == 180.0f) {
            matrix.preTranslate(-f4, -f5);
            return matrix;
        } else if (f3 == 270.0f) {
            matrix.preTranslate(-f4, 0.0f);
            return matrix;
        } else if (f3 != 0.0f) {
            throw new IllegalArgumentException();
        }
        return matrix;
    }

    public static C2EK A01(File file, Context context, C40081rY c40081rY, C002301c c002301c, C43791xz c43791xz) {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        try {
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                } else {
                    return A03(sb.toString(), context, c40081rY, c002301c, c43791xz);
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    bufferedReader.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static C2EK A02(File file, Context context, C40081rY c40081rY, C002301c c002301c, C43791xz c43791xz) {
        try {
            return A01(file, context, c40081rY, c002301c, c43791xz);
        } catch (IOException e) {
            Log.e("Doodle/safeLoad could not load doodle from file", e);
            return null;
        }
    }

    public static C2EK A03(String str, Context context, C40081rY c40081rY, C002301c c002301c, C43791xz c43791xz) {
        C2HG c67893Hg;
        try {
            JSONObject jSONObject = new JSONObject(str);
            RectF rectF = new RectF();
            rectF.left = jSONObject.getInt("l") / 100.0f;
            rectF.top = jSONObject.getInt("t") / 100.0f;
            rectF.right = jSONObject.getInt("r") / 100.0f;
            rectF.bottom = jSONObject.getInt("b") / 100.0f;
            RectF rectF2 = new RectF();
            rectF2.left = jSONObject.getInt("crop-l") / 100.0f;
            rectF2.top = jSONObject.getInt("crop-t") / 100.0f;
            rectF2.right = jSONObject.getInt("crop-r") / 100.0f;
            rectF2.bottom = jSONObject.getInt("crop-b") / 100.0f;
            int i = jSONObject.getInt("rotate");
            JSONArray jSONArray = jSONObject.getJSONArray("shapes");
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                String string = jSONObject2.getString("type");
                switch (string.hashCode()) {
                    case -2069773495:
                        if (string.equals("thinking-bubble")) {
                            c67893Hg = new C67893Hg(jSONObject2);
                            break;
                        } else {
                            continue;
                        }
                    case -1890252483:
                        if (string.equals("sticker")) {
                            c67893Hg = new C3L7(context, jSONObject2, c43791xz);
                            break;
                        } else {
                            continue;
                        }
                    case -1676415975:
                        if (string.equals("digital-clock")) {
                            c67893Hg = new C2HH(context, c002301c, jSONObject2);
                            break;
                        } else {
                            continue;
                        }
                    case -1493474063:
                        if (string.equals("analog-clock")) {
                            c67893Hg = new C2HJ(context, c002301c, jSONObject2);
                            break;
                        } else {
                            continue;
                        }
                    case -841189240:
                        if (string.equals("speech-bubble-oval")) {
                            c67893Hg = new C67853Hc(jSONObject2);
                            break;
                        } else {
                            continue;
                        }
                    case -841116134:
                        if (string.equals("speech-bubble-rect")) {
                            c67893Hg = new C67863Hd(jSONObject2);
                            break;
                        } else {
                            continue;
                        }
                    case 110873:
                        if (string.equals("pen")) {
                            c67893Hg = new C67833Ha(jSONObject2, context.getResources().getDisplayMetrics().density);
                            break;
                        } else {
                            continue;
                        }
                    case 114276:
                        if (string.equals("svg")) {
                            c67893Hg = new C68693Lb(context, jSONObject2);
                            break;
                        } else {
                            continue;
                        }
                    case 3423314:
                        if (string.equals("oval")) {
                            c67893Hg = new C3HZ(jSONObject2);
                            break;
                        } else {
                            continue;
                        }
                    case 3496420:
                        if (string.equals("rect")) {
                            c67893Hg = new C67843Hb(jSONObject2);
                            break;
                        } else {
                            continue;
                        }
                    case 3556653:
                        if (string.equals("text")) {
                            c67893Hg = new C67883Hf(context, c40081rY, c002301c, jSONObject2);
                            break;
                        } else {
                            continue;
                        }
                    case 93090825:
                        if (string.equals("arrow")) {
                            c67893Hg = new C3HV(jSONObject2);
                            break;
                        } else {
                            continue;
                        }
                    case 96632902:
                        if (string.equals("emoji")) {
                            c67893Hg = new C3L6(context, c40081rY, jSONObject2);
                            break;
                        } else {
                            continue;
                        }
                    case 1901043637:
                        if (string.equals("location")) {
                            c67893Hg = new C3La(context, c002301c, jSONObject2);
                            break;
                        } else {
                            continue;
                        }
                    default:
                        continue;
                }
                c67893Hg.A04();
                arrayList.add(c67893Hg);
            }
            return new C2EK(rectF, rectF2, i, arrayList);
        } catch (IllegalArgumentException e) {
            Log.e("Doodle/Drawable or picture unable to load from JSON", e);
            return null;
        } catch (JSONException e2) {
            Log.e("Doodle/load unable to load from JSON", e2);
            return null;
        }
    }

    public String A04() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("version", 1);
            jSONObject.put("l", (int) (this.A02.left * 100.0f));
            jSONObject.put("t", (int) (this.A02.top * 100.0f));
            jSONObject.put("r", (int) (this.A02.right * 100.0f));
            jSONObject.put("b", (int) (this.A02.bottom * 100.0f));
            jSONObject.put("crop-l", (int) (this.A01.left * 100.0f));
            jSONObject.put("crop-t", (int) (this.A01.top * 100.0f));
            jSONObject.put("crop-r", (int) (this.A01.right * 100.0f));
            jSONObject.put("crop-b", (int) (this.A01.bottom * 100.0f));
            jSONObject.put("rotate", this.A00);
            JSONArray jSONArray = new JSONArray();
            for (C2HG c2hg : this.A04) {
                JSONObject jSONObject2 = new JSONObject();
                c2hg.A0G(jSONObject2);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("shapes", jSONArray);
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.e("Doodle/toJson error while constructing JSON", e);
            return null;
        }
    }

    public void A05(long j) {
        for (C2HG c2hg : this.A04) {
            c2hg.A01 = j;
        }
    }

    public void A06(Bitmap bitmap, int i) {
        Canvas canvas = new Canvas(bitmap);
        A09(canvas, bitmap, i, false, false);
        for (C2HG c2hg : this.A04) {
            if (c2hg instanceof C67833Ha) {
                c2hg.A0A(canvas);
            }
        }
        for (C2HG c2hg2 : this.A04) {
            if (!(c2hg2 instanceof C67833Ha)) {
                c2hg2.A0A(canvas);
            }
        }
    }

    public void A07(Bitmap bitmap, int i, boolean z, boolean z2) {
        Canvas canvas = new Canvas(bitmap);
        A09(canvas, bitmap, i, z, z2);
        A08(canvas);
    }

    public final void A08(Canvas canvas) {
        for (C2HG c2hg : this.A04) {
            if (c2hg instanceof C67833Ha) {
                c2hg.A09(canvas);
            }
        }
        for (C2HG c2hg2 : this.A04) {
            if (!(c2hg2 instanceof C67833Ha)) {
                c2hg2.A09(canvas);
            }
        }
    }

    public void A09(Canvas canvas, Bitmap bitmap, int i, boolean z, boolean z2) {
        canvas.concat(A00(bitmap.getWidth(), bitmap.getHeight(), i, this.A02.width(), this.A02.height(), z, z2));
    }

    public boolean A0A() {
        return A0D(new String[]{"arrow", "oval", "thinking-bubble", "speech-bubble-oval", "speech-bubble-rect", "svg", "digital-clock", "analog-clock", "location", "sticker", "emoji"});
    }

    public boolean A0B() {
        for (C2HG c2hg : this.A04) {
            if (c2hg.A0E()) {
                return true;
            }
        }
        return false;
    }

    public boolean A0C(File file) {
        String A04 = A04();
        if (A04 == null) {
            return false;
        }
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(A04);
            fileWriter.close();
            return true;
        } catch (IOException e) {
            Log.e("Doodle/save failed to save doodle string to file", e);
            return false;
        }
    }

    public final boolean A0D(String[] strArr) {
        List<C2HG> list = this.A04;
        if (list == null) {
            return false;
        }
        for (C2HG c2hg : list) {
            if (AnonymousClass029.A1b(strArr, c2hg.A02())) {
                return true;
            }
        }
        return false;
    }
}
