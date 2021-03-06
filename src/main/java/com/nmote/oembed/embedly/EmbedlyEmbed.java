/*
 * Copyright (c) Nmote Ltd. 2015. All rights reserved.
 * See LICENSE doc in a root of project folder for additional information.
 */

package com.nmote.oembed.embedly;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.nmote.oembed.About;
import com.nmote.oembed.BasicOEmbed;

/**
 * Embedly oEmbed extension.
 *
 * @author vnesek
 */
public class EmbedlyEmbed extends BasicOEmbed {

	private static final long serialVersionUID = About.SERIAL_VERSION_UID;

	/**
	 * Getter for extension property.
	 *
	 * @return property value
	 */
	public Float getMeanAlpha() {
		return meanAlpha;
	}

	/**
	 * Setter for extension property.
	 *
	 * @param meanAlpha
	 *            property value
	 */
	public void setMeanAlpha(Float meanAlpha) {
		this.meanAlpha = meanAlpha;
	}

	/**
	 * Mean alpha of the alpha channel on the image, it can be used to detect
	 * for transparent images and logos.
	 *
	 * Embed.ly extension
	 */
	@JsonProperty("mean_alpha")
	private Float meanAlpha;

}