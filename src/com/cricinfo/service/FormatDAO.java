package com.cricinfo.service;

import java.util.ArrayList;

import com.cricinfo.entity.Format;

public interface FormatDAO {
	public ArrayList<Format> getFormatByPlayerName(String name);
	public void getFormatList();
	}

