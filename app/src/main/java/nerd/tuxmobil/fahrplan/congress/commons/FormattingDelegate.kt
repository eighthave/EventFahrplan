package nerd.tuxmobil.fahrplan.congress.commons

import org.threeten.bp.ZoneOffset

/**
 * Delegate to get a formatted date/time.
 */
interface FormattingDelegate {

    fun getFormattedDateTimeShort(
        useDeviceTimeZone: Boolean,
        dateUtc: Long,
        timeZoneOffset: ZoneOffset?,
    ): String

    fun getFormattedDateTimeLong(
        useDeviceTimeZone: Boolean,
        dateUtc: Long,
        timeZoneOffset: ZoneOffset?,
    ): String

}
