package com.android.settings.custom.colorpicker;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.provider.Settings;

import com.android.settings.custom.preference.SecureSettingsStore;
import com.android.settings.custom.colorpicker.ColorPickerPreference;
public class SecureSettingColorPickerPreference extends ColorPickerPreference {

    public SecureSettingColorPickerPreference(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setPreferenceDataStore(new SecureSettingsStore(context.getContentResolver()));
    }

    public SecureSettingColorPickerPreference(Context context, AttributeSet attrs) {
        super(context, attrs);
        setPreferenceDataStore(new SecureSettingsStore(context.getContentResolver()));
    }

    public SecureSettingColorPickerPreference(Context context) {
        super(context, null);
        setPreferenceDataStore(new SecureSettingsStore(context.getContentResolver()));
    }
}