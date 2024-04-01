package X;

import android.app.Person;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Set;

/* renamed from: X.0M2 */
/* loaded from: classes.dex */
public class C0M2 {
    public int A00;
    public ComponentName A01;
    public Context A02;
    public IconCompat A03;
    public CharSequence A04;
    public CharSequence A05;
    public CharSequence A06;
    public String A07;
    public Set A08;
    public boolean A09;
    public boolean A0A;
    public Intent[] A0B;
    public C12810k6[] A0C;

    public ShortcutInfo A00() {
        int length;
        int length2;
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.A02, this.A07).setShortLabel(this.A05).setIntents(this.A0B);
        IconCompat iconCompat = this.A03;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.A07());
        }
        if (!TextUtils.isEmpty(this.A06)) {
            intents.setLongLabel(this.A06);
        }
        if (!TextUtils.isEmpty(this.A04)) {
            intents.setDisabledMessage(this.A04);
        }
        ComponentName componentName = this.A01;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.A08;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.A00);
        int i = 0;
        if (Build.VERSION.SDK_INT >= 29) {
            C12810k6[] c12810k6Arr = this.A0C;
            if (c12810k6Arr != null && (length2 = c12810k6Arr.length) > 0) {
                Person[] personArr = new Person[length2];
                while (i < length2) {
                    personArr[i] = this.A0C[i].A00();
                    i++;
                }
                intents.setPersons(personArr);
            }
            intents.setLongLived(this.A0A);
        } else {
            PersistableBundle persistableBundle = new PersistableBundle();
            C12810k6[] c12810k6Arr2 = this.A0C;
            if (c12810k6Arr2 != null && (length = c12810k6Arr2.length) > 0) {
                persistableBundle.putInt("extraPersonCount", length);
                while (true) {
                    C12810k6[] c12810k6Arr3 = this.A0C;
                    if (i >= c12810k6Arr3.length) {
                        break;
                    }
                    StringBuilder A0P = C000200d.A0P("extraPerson_");
                    int i2 = i + 1;
                    A0P.append(i2);
                    String obj = A0P.toString();
                    C12810k6 c12810k6 = c12810k6Arr3[i];
                    String str = null;
                    if (c12810k6 != null) {
                        PersistableBundle persistableBundle2 = new PersistableBundle();
                        CharSequence charSequence = c12810k6.A01;
                        if (charSequence != null) {
                            str = charSequence.toString();
                        }
                        persistableBundle2.putString("name", str);
                        persistableBundle2.putString("uri", c12810k6.A03);
                        persistableBundle2.putString("key", c12810k6.A02);
                        persistableBundle2.putBoolean("isBot", c12810k6.A04);
                        persistableBundle2.putBoolean("isImportant", c12810k6.A05);
                        persistableBundle.putPersistableBundle(obj, persistableBundle2);
                        i = i2;
                    } else {
                        throw null;
                    }
                }
            }
            persistableBundle.putBoolean("extraLongLived", this.A0A);
            intents.setExtras(persistableBundle);
        }
        return intents.build();
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x002f, code lost:
        if (r4 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0054, code lost:
        if (r4 != null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A01(android.content.Intent r8) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0M2.A01(android.content.Intent):void");
    }
}
