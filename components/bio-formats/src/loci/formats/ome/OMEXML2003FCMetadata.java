//
// OMEXML2003FCMetadata.java
//

/*
OME Bio-Formats package for reading and converting biological file formats.
Copyright (C) 2005-2009 UW-Madison LOCI and Glencoe Software, Inc.

This program is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
*/

/*-----------------------------------------------------------------------------
 *
 * THIS IS AUTOMATICALLY GENERATED CODE.  DO NOT MODIFY.
 * Created by melissa via MetadataAutogen on Oct 5, 2009 9:38:21 AM CDT
 *
 *-----------------------------------------------------------------------------
 */

package loci.formats.ome;

import ome.xml.OMEXMLNode;
import ome.xml.r2003fc.ome.*;
import java.util.List;
import loci.common.LogTools;
import loci.formats.FormatException;
import loci.formats.codec.Base64Codec;

/**
 * A metadata store implementation for constructing and manipulating OME-XML
 * DOMs for the 2003-FC version of OME-XML. It requires the
 * ome.xml.r2003fc package to compile (part of ome-xml.jar).
 *
 * <dl><dt><b>Source code:</b></dt>
 * <dd><a href="https://skyking.microscopy.wisc.edu/trac/java/browser/trunk/components/bio-formats/src/loci/formats/ome/OMEXML2003FCMetadata.java">Trac</a>,
 * <a href="https://skyking.microscopy.wisc.edu/svn/java/trunk/components/bio-formats/src/loci/formats/ome/OMEXML2003FCMetadata.java">SVN</a></dd></dl>
 *
 * @author Curtis Rueden ctrueden at wisc.edu
 * @author Melissa Linkert linkert at wisc.edu
 */
public class OMEXML2003FCMetadata extends OMEXMLMetadata {

  // -- MetadataRetrieve API methods --

  // - Entity counting -

  /* @see loci.formats.meta.MetadataRetrieve#getChannelComponentCount(int, int) */
  public int getChannelComponentCount(int imageIndex, int logicalChannelIndex) {
    for (int i=0; i<Integer.MAX_VALUE; i++) {
      if (getChannelComponentNode(imageIndex, logicalChannelIndex, i, false) == null) return i;
    }
    return -1;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getDatasetCount() */
  public int getDatasetCount() {
    for (int i=0; i<Integer.MAX_VALUE; i++) {
      if (getDatasetNode(i, false) == null) return i;
    }
    return -1;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getDatasetRefCount(int) */
  public int getDatasetRefCount(int imageIndex) {
    // NB: DatasetRef unsupported for schema version 2003-FC
    return -1;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getDetectorCount(int) */
  public int getDetectorCount(int instrumentIndex) {
    for (int i=0; i<Integer.MAX_VALUE; i++) {
      if (getDetectorNode(instrumentIndex, i, false) == null) return i;
    }
    return -1;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getDichroicCount(int) */
  public int getDichroicCount(int instrumentIndex) {
    for (int i=0; i<Integer.MAX_VALUE; i++) {
      if (getDichroicNode(instrumentIndex, i, false) == null) return i;
    }
    return -1;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getExperimentCount() */
  public int getExperimentCount() {
    for (int i=0; i<Integer.MAX_VALUE; i++) {
      if (getExperimentNode(i, false) == null) return i;
    }
    return -1;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getExperimenterCount() */
  public int getExperimenterCount() {
    for (int i=0; i<Integer.MAX_VALUE; i++) {
      if (getExperimenterNode(i, false) == null) return i;
    }
    return -1;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getExperimenterMembershipCount(int) */
  public int getExperimenterMembershipCount(int experimenterIndex) {
    for (int i=0; i<Integer.MAX_VALUE; i++) {
      if (getGroupRefNode(experimenterIndex, i, false) == null) return i;
    }
    return -1;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getFilterCount(int) */
  public int getFilterCount(int instrumentIndex) {
    for (int i=0; i<Integer.MAX_VALUE; i++) {
      if (getFilterNode(instrumentIndex, i, false) == null) return i;
    }
    return -1;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getFilterSetCount(int) */
  public int getFilterSetCount(int instrumentIndex) {
    for (int i=0; i<Integer.MAX_VALUE; i++) {
      if (getFilterSetNode(instrumentIndex, i, false) == null) return i;
    }
    return -1;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getGroupCount() */
  public int getGroupCount() {
    for (int i=0; i<Integer.MAX_VALUE; i++) {
      if (getGroupNode(i, false) == null) return i;
    }
    return -1;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getGroupRefCount(int) */
  public int getGroupRefCount(int experimenterIndex) {
    for (int i=0; i<Integer.MAX_VALUE; i++) {
      if (getGroupRefNode(experimenterIndex, i, false) == null) return i;
    }
    return -1;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getImageCount() */
  public int getImageCount() {
    for (int i=0; i<Integer.MAX_VALUE; i++) {
      if (getImageNode(i, false) == null) return i;
    }
    return -1;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getInstrumentCount() */
  public int getInstrumentCount() {
    for (int i=0; i<Integer.MAX_VALUE; i++) {
      if (getInstrumentNode(i, false) == null) return i;
    }
    return -1;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getLightSourceCount(int) */
  public int getLightSourceCount(int instrumentIndex) {
    for (int i=0; i<Integer.MAX_VALUE; i++) {
      if (getLightSourceNode(instrumentIndex, i, false) == null) return i;
    }
    return -1;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getLightSourceRefCount(int, int) */
  public int getLightSourceRefCount(int imageIndex, int microbeamManipulationIndex) {
    // NB: LightSourceRef unsupported for schema version 2003-FC
    return -1;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getLogicalChannelCount(int) */
  public int getLogicalChannelCount(int imageIndex) {
    for (int i=0; i<Integer.MAX_VALUE; i++) {
      if (getChannelInfoNode(imageIndex, i, false) == null) return i;
    }
    return -1;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getMicrobeamManipulationCount(int) */
  public int getMicrobeamManipulationCount(int imageIndex) {
    // NB: MicrobeamManipulation unsupported for schema version 2003-FC
    return -1;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getMicrobeamManipulationRefCount(int) */
  public int getMicrobeamManipulationRefCount(int experimentIndex) {
    // NB: MicrobeamManipulationRef unsupported for schema version 2003-FC
    return -1;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getOTFCount(int) */
  public int getOTFCount(int instrumentIndex) {
    for (int i=0; i<Integer.MAX_VALUE; i++) {
      if (getOTFNode(instrumentIndex, i, false) == null) return i;
    }
    return -1;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getObjectiveCount(int) */
  public int getObjectiveCount(int instrumentIndex) {
    for (int i=0; i<Integer.MAX_VALUE; i++) {
      if (getObjectiveNode(instrumentIndex, i, false) == null) return i;
    }
    return -1;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getPixelsCount(int) */
  public int getPixelsCount(int imageIndex) {
    for (int i=0; i<Integer.MAX_VALUE; i++) {
      if (getPixelsNode(imageIndex, i, false) == null) return i;
    }
    return -1;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getPlaneCount(int, int) */
  public int getPlaneCount(int imageIndex, int pixelsIndex) {
    // NB: Plane unsupported for schema version 2003-FC
    return -1;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getPlateCount() */
  public int getPlateCount() {
    for (int i=0; i<Integer.MAX_VALUE; i++) {
      if (getPlateNode(i, false) == null) return i;
    }
    return -1;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getPlateRefCount(int) */
  public int getPlateRefCount(int screenIndex) {
    for (int i=0; i<Integer.MAX_VALUE; i++) {
      if (getPlateRefNode(i, false) == null) return i;
    }
    return -1;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getProjectCount() */
  public int getProjectCount() {
    for (int i=0; i<Integer.MAX_VALUE; i++) {
      if (getProjectNode(i, false) == null) return i;
    }
    return -1;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getProjectRefCount(int) */
  public int getProjectRefCount(int datasetIndex) {
    for (int i=0; i<Integer.MAX_VALUE; i++) {
      if (getProjectRefNode(datasetIndex, i, false) == null) return i;
    }
    return -1;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getROICount(int) */
  public int getROICount(int imageIndex) {
    for (int i=0; i<Integer.MAX_VALUE; i++) {
      if (getROINode(imageIndex, i, false) == null) return i;
    }
    return -1;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getROIRefCount(int, int) */
  public int getROIRefCount(int imageIndex, int microbeamManipulationIndex) {
    // NB: ROIRef unsupported for schema version 2003-FC
    return -1;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getReagentCount(int) */
  public int getReagentCount(int screenIndex) {
    // NB: Reagent unsupported for schema version 2003-FC
    return -1;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getRegionCount(int) */
  public int getRegionCount(int imageIndex) {
    // NB: Region unsupported for schema version 2003-FC
    return -1;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getRoiLinkCount(int, int) */
  public int getRoiLinkCount(int imageIndex, int roiIndex) {
    // NB: RoiLink unsupported for schema version 2003-FC
    return -1;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getScreenCount() */
  public int getScreenCount() {
    for (int i=0; i<Integer.MAX_VALUE; i++) {
      if (getScreenNode(i, false) == null) return i;
    }
    return -1;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getScreenAcquisitionCount(int) */
  public int getScreenAcquisitionCount(int screenIndex) {
    // NB: ScreenAcquisition unsupported for schema version 2003-FC
    return -1;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getScreenRefCount(int) */
  public int getScreenRefCount(int plateIndex) {
    for (int i=0; i<Integer.MAX_VALUE; i++) {
      if (getScreenRefNode(plateIndex, i, false) == null) return i;
    }
    return -1;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getShapeCount(int, int) */
  public int getShapeCount(int imageIndex, int roiIndex) {
    // NB: Shape unsupported for schema version 2003-FC
    return -1;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getTiffDataCount(int, int) */
  public int getTiffDataCount(int imageIndex, int pixelsIndex) {
    for (int i=0; i<Integer.MAX_VALUE; i++) {
      if (getTiffDataNode(imageIndex, pixelsIndex, i, false) == null) return i;
    }
    return -1;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getWellCount(int) */
  public int getWellCount(int plateIndex) {
    // NB: Well unsupported for schema version 2003-FC
    return -1;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getWellSampleCount(int, int) */
  public int getWellSampleCount(int plateIndex, int wellIndex) {
    // NB: WellSample unsupported for schema version 2003-FC
    return -1;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getWellSampleRefCount(int, int) */
  public int getWellSampleRefCount(int screenIndex, int screenAcquisitionIndex) {
    // NB: WellSampleRef unsupported for schema version 2003-FC
    return -1;
  }

  // - Entity retrieval -

  // - Arc property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getArcType(int, int) */
  public String getArcType(int instrumentIndex, int lightSourceIndex) {
    ArcNode arc = getArcNode(instrumentIndex, lightSourceIndex, false);
          return arc == null ? null : arc.getType();
      }

  // - ChannelComponent property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getChannelComponentColorDomain(int, int, int) */
  public String getChannelComponentColorDomain(int imageIndex, int logicalChannelIndex, int channelComponentIndex) {
    ChannelComponentNode channelComponent = getChannelComponentNode(imageIndex, logicalChannelIndex, channelComponentIndex, false);
          return channelComponent == null ? null : channelComponent.getColorDomain();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getChannelComponentIndex(int, int, int) */
  public Integer getChannelComponentIndex(int imageIndex, int logicalChannelIndex, int channelComponentIndex) {
    ChannelComponentNode channelComponent = getChannelComponentNode(imageIndex, logicalChannelIndex, channelComponentIndex, false);
          return channelComponent == null ? null : channelComponent.getIndex();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getChannelComponentPixels(int, int, int) */
  public String getChannelComponentPixels(int imageIndex, int logicalChannelIndex, int channelComponentIndex) {
    ChannelComponentNode channelComponent = getChannelComponentNode(imageIndex, logicalChannelIndex, channelComponentIndex, false);
          return channelComponent == null ? null : channelComponent.getPixels();
      }

  // - Circle property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getCircleCx(int, int, int) */
  public String getCircleCx(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: Cx unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getCircleCy(int, int, int) */
  public String getCircleCy(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: Cy unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getCircleID(int, int, int) */
  public String getCircleID(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: ID unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getCircleR(int, int, int) */
  public String getCircleR(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: R unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getCircleTransform(int, int, int) */
  public String getCircleTransform(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: Transform unsupported for schema version 2003-FC
    return null;
  }

  // - Contact property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getContactExperimenter(int) */
  public String getContactExperimenter(int groupIndex) {
    ContactNode contact = getContactNode(groupIndex, false);
          return contact == null ? null : contact.getNodeID();
      }

  // - Dataset property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getDatasetDescription(int) */
  public String getDatasetDescription(int datasetIndex) {
    DatasetNode dataset = getDatasetNode(datasetIndex, false);
          return dataset == null ? null : dataset.getDescription();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getDatasetExperimenterRef(int) */
  public String getDatasetExperimenterRef(int datasetIndex) {
    DatasetNode dataset = getDatasetNode(datasetIndex, false);
    ExperimenterNode node = dataset.getExperimenter();
    if (node == null) return null;
    return node.getNodeID();
  }

  /* @see loci.formats.meta.MetadataRetrieve#getDatasetGroupRef(int) */
  public String getDatasetGroupRef(int datasetIndex) {
    DatasetNode dataset = getDatasetNode(datasetIndex, false);
    GroupNode node = dataset.getGroup();
    if (node == null) return null;
    return node.getNodeID();
  }

  /* @see loci.formats.meta.MetadataRetrieve#getDatasetID(int) */
  public String getDatasetID(int datasetIndex) {
    DatasetNode dataset = getDatasetNode(datasetIndex, false);
          return dataset == null ? null : dataset.getNodeID();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getDatasetLocked(int) */
  public Boolean getDatasetLocked(int datasetIndex) {
    DatasetNode dataset = getDatasetNode(datasetIndex, false);
          return dataset == null ? null : dataset.getLocked();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getDatasetName(int) */
  public String getDatasetName(int datasetIndex) {
    DatasetNode dataset = getDatasetNode(datasetIndex, false);
          return dataset == null ? null : dataset.getName();
      }

  // - DatasetRef property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getDatasetRefID(int, int) */
  public String getDatasetRefID(int imageIndex, int datasetRefIndex) {
    // NB: ID unsupported for schema version 2003-FC
    return null;
  }

  // - Detector property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getDetectorAmplificationGain(int, int) */
  public Float getDetectorAmplificationGain(int instrumentIndex, int detectorIndex) {
    // NB: AmplificationGain unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getDetectorGain(int, int) */
  public Float getDetectorGain(int instrumentIndex, int detectorIndex) {
    DetectorNode detector = getDetectorNode(instrumentIndex, detectorIndex, false);
          return detector == null ? null : detector.getGain();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getDetectorID(int, int) */
  public String getDetectorID(int instrumentIndex, int detectorIndex) {
    DetectorNode detector = getDetectorNode(instrumentIndex, detectorIndex, false);
          return detector == null ? null : detector.getNodeID();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getDetectorManufacturer(int, int) */
  public String getDetectorManufacturer(int instrumentIndex, int detectorIndex) {
    DetectorNode detector = getDetectorNode(instrumentIndex, detectorIndex, false);
          return detector == null ? null : detector.getManufacturer();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getDetectorModel(int, int) */
  public String getDetectorModel(int instrumentIndex, int detectorIndex) {
    DetectorNode detector = getDetectorNode(instrumentIndex, detectorIndex, false);
          return detector == null ? null : detector.getModel();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getDetectorOffset(int, int) */
  public Float getDetectorOffset(int instrumentIndex, int detectorIndex) {
    DetectorNode detector = getDetectorNode(instrumentIndex, detectorIndex, false);
          return detector == null ? null : detector.getOffset();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getDetectorSerialNumber(int, int) */
  public String getDetectorSerialNumber(int instrumentIndex, int detectorIndex) {
    DetectorNode detector = getDetectorNode(instrumentIndex, detectorIndex, false);
          return detector == null ? null : detector.getSerialNumber();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getDetectorType(int, int) */
  public String getDetectorType(int instrumentIndex, int detectorIndex) {
    DetectorNode detector = getDetectorNode(instrumentIndex, detectorIndex, false);
          return detector == null ? null : detector.getType();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getDetectorVoltage(int, int) */
  public Float getDetectorVoltage(int instrumentIndex, int detectorIndex) {
    DetectorNode detector = getDetectorNode(instrumentIndex, detectorIndex, false);
          return detector == null ? null : detector.getVoltage();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getDetectorZoom(int, int) */
  public Float getDetectorZoom(int instrumentIndex, int detectorIndex) {
    // NB: Zoom unsupported for schema version 2003-FC
    return null;
  }

  // - DetectorSettings property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getDetectorSettingsBinning(int, int) */
  public String getDetectorSettingsBinning(int imageIndex, int logicalChannelIndex) {
    // NB: Binning unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getDetectorSettingsDetector(int, int) */
  public String getDetectorSettingsDetector(int imageIndex, int logicalChannelIndex) {
    DetectorRefNode detectorRef = getDetectorRefNode(imageIndex, logicalChannelIndex, false);
          return detectorRef == null ? null : detectorRef.getNodeID();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getDetectorSettingsGain(int, int) */
  public Float getDetectorSettingsGain(int imageIndex, int logicalChannelIndex) {
    DetectorRefNode detectorRef = getDetectorRefNode(imageIndex, logicalChannelIndex, false);
          return detectorRef == null ? null : detectorRef.getGain();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getDetectorSettingsOffset(int, int) */
  public Float getDetectorSettingsOffset(int imageIndex, int logicalChannelIndex) {
    DetectorRefNode detectorRef = getDetectorRefNode(imageIndex, logicalChannelIndex, false);
          return detectorRef == null ? null : detectorRef.getOffset();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getDetectorSettingsReadOutRate(int, int) */
  public Float getDetectorSettingsReadOutRate(int imageIndex, int logicalChannelIndex) {
    // NB: ReadOutRate unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getDetectorSettingsVoltage(int, int) */
  public Float getDetectorSettingsVoltage(int imageIndex, int logicalChannelIndex) {
    // NB: Voltage unsupported for schema version 2003-FC
    return null;
  }

  // - Dichroic property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getDichroicID(int, int) */
  public String getDichroicID(int instrumentIndex, int dichroicIndex) {
    DichroicNode dichroic = getDichroicNode(instrumentIndex, dichroicIndex, false);
          return dichroic == null ? null : dichroic.getNodeID();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getDichroicLotNumber(int, int) */
  public String getDichroicLotNumber(int instrumentIndex, int dichroicIndex) {
    DichroicNode dichroic = getDichroicNode(instrumentIndex, dichroicIndex, false);
          return dichroic == null ? null : dichroic.getLotNumber();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getDichroicManufacturer(int, int) */
  public String getDichroicManufacturer(int instrumentIndex, int dichroicIndex) {
    DichroicNode dichroic = getDichroicNode(instrumentIndex, dichroicIndex, false);
          return dichroic == null ? null : dichroic.getManufacturer();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getDichroicModel(int, int) */
  public String getDichroicModel(int instrumentIndex, int dichroicIndex) {
    DichroicNode dichroic = getDichroicNode(instrumentIndex, dichroicIndex, false);
          return dichroic == null ? null : dichroic.getModel();
      }

  // - Dimensions property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getDimensionsPhysicalSizeX(int, int) */
  public Float getDimensionsPhysicalSizeX(int imageIndex, int pixelsIndex) {
    ImageNode image = getImageNode(imageIndex, false);
          return image == null ? null : image.getPixelSizeX();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getDimensionsPhysicalSizeY(int, int) */
  public Float getDimensionsPhysicalSizeY(int imageIndex, int pixelsIndex) {
    ImageNode image = getImageNode(imageIndex, false);
          return image == null ? null : image.getPixelSizeY();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getDimensionsPhysicalSizeZ(int, int) */
  public Float getDimensionsPhysicalSizeZ(int imageIndex, int pixelsIndex) {
    ImageNode image = getImageNode(imageIndex, false);
          return image == null ? null : image.getPixelSizeZ();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getDimensionsTimeIncrement(int, int) */
  public Float getDimensionsTimeIncrement(int imageIndex, int pixelsIndex) {
    ImageNode image = getImageNode(imageIndex, false);
          return image == null ? null : image.getTimeIncrement();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getDimensionsWaveIncrement(int, int) */
  public Integer getDimensionsWaveIncrement(int imageIndex, int pixelsIndex) {
    ImageNode image = getImageNode(imageIndex, false);
          return image == null ? null : image.getWaveIncrement();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getDimensionsWaveStart(int, int) */
  public Integer getDimensionsWaveStart(int imageIndex, int pixelsIndex) {
    ImageNode image = getImageNode(imageIndex, false);
          return image == null ? null : image.getWaveStart();
      }

  // - DisplayOptions property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getDisplayOptionsDisplay(int) */
  public String getDisplayOptionsDisplay(int imageIndex) {
    DisplayOptionsNode displayOptions = getDisplayOptionsNode(imageIndex, false);
          return displayOptions == null ? null : displayOptions.getDisplay();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getDisplayOptionsID(int) */
  public String getDisplayOptionsID(int imageIndex) {
    DisplayOptionsNode displayOptions = getDisplayOptionsNode(imageIndex, false);
          return displayOptions == null ? null : displayOptions.getNodeID();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getDisplayOptionsZoom(int) */
  public Float getDisplayOptionsZoom(int imageIndex) {
    DisplayOptionsNode displayOptions = getDisplayOptionsNode(imageIndex, false);
          return displayOptions == null ? null : displayOptions.getZoom();
      }

  // - Ellipse property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getEllipseCx(int, int, int) */
  public String getEllipseCx(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: Cx unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getEllipseCy(int, int, int) */
  public String getEllipseCy(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: Cy unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getEllipseID(int, int, int) */
  public String getEllipseID(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: ID unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getEllipseRx(int, int, int) */
  public String getEllipseRx(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: Rx unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getEllipseRy(int, int, int) */
  public String getEllipseRy(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: Ry unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getEllipseTransform(int, int, int) */
  public String getEllipseTransform(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: Transform unsupported for schema version 2003-FC
    return null;
  }

  // - EmFilter property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getEmFilterLotNumber(int, int) */
  public String getEmFilterLotNumber(int instrumentIndex, int filterIndex) {
    EmFilterNode emFilter = getEmFilterNode(instrumentIndex, filterIndex, false);
          return emFilter == null ? null : emFilter.getLotNumber();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getEmFilterManufacturer(int, int) */
  public String getEmFilterManufacturer(int instrumentIndex, int filterIndex) {
    EmFilterNode emFilter = getEmFilterNode(instrumentIndex, filterIndex, false);
          return emFilter == null ? null : emFilter.getManufacturer();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getEmFilterModel(int, int) */
  public String getEmFilterModel(int instrumentIndex, int filterIndex) {
    EmFilterNode emFilter = getEmFilterNode(instrumentIndex, filterIndex, false);
          return emFilter == null ? null : emFilter.getModel();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getEmFilterType(int, int) */
  public String getEmFilterType(int instrumentIndex, int filterIndex) {
    EmFilterNode emFilter = getEmFilterNode(instrumentIndex, filterIndex, false);
          return emFilter == null ? null : emFilter.getType();
      }

  // - ExFilter property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getExFilterLotNumber(int, int) */
  public String getExFilterLotNumber(int instrumentIndex, int filterIndex) {
    ExFilterNode exFilter = getExFilterNode(instrumentIndex, filterIndex, false);
          return exFilter == null ? null : exFilter.getLotNumber();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getExFilterManufacturer(int, int) */
  public String getExFilterManufacturer(int instrumentIndex, int filterIndex) {
    ExFilterNode exFilter = getExFilterNode(instrumentIndex, filterIndex, false);
          return exFilter == null ? null : exFilter.getManufacturer();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getExFilterModel(int, int) */
  public String getExFilterModel(int instrumentIndex, int filterIndex) {
    ExFilterNode exFilter = getExFilterNode(instrumentIndex, filterIndex, false);
          return exFilter == null ? null : exFilter.getModel();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getExFilterType(int, int) */
  public String getExFilterType(int instrumentIndex, int filterIndex) {
    ExFilterNode exFilter = getExFilterNode(instrumentIndex, filterIndex, false);
          return exFilter == null ? null : exFilter.getType();
      }

  // - Experiment property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getExperimentDescription(int) */
  public String getExperimentDescription(int experimentIndex) {
    ExperimentNode experiment = getExperimentNode(experimentIndex, false);
          return experiment == null ? null : experiment.getDescription();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getExperimentExperimenterRef(int) */
  public String getExperimentExperimenterRef(int experimentIndex) {
    ExperimentNode experiment = getExperimentNode(experimentIndex, false);
    ExperimenterNode node = experiment.getExperimenter();
    if (node == null) return null;
    return node.getNodeID();
  }

  /* @see loci.formats.meta.MetadataRetrieve#getExperimentID(int) */
  public String getExperimentID(int experimentIndex) {
    ExperimentNode experiment = getExperimentNode(experimentIndex, false);
          return experiment == null ? null : experiment.getNodeID();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getExperimentType(int) */
  public String getExperimentType(int experimentIndex) {
    ExperimentNode experiment = getExperimentNode(experimentIndex, false);
          return experiment == null ? null : experiment.getType();
      }

  // - Experimenter property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getExperimenterEmail(int) */
  public String getExperimenterEmail(int experimenterIndex) {
    // NB: Email unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getExperimenterFirstName(int) */
  public String getExperimenterFirstName(int experimenterIndex) {
    // NB: FirstName unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getExperimenterID(int) */
  public String getExperimenterID(int experimenterIndex) {
    ExperimenterNode experimenter = getExperimenterNode(experimenterIndex, false);
          return experimenter == null ? null : experimenter.getNodeID();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getExperimenterInstitution(int) */
  public String getExperimenterInstitution(int experimenterIndex) {
    // NB: Institution unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getExperimenterLastName(int) */
  public String getExperimenterLastName(int experimenterIndex) {
    // NB: LastName unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getExperimenterOMEName(int) */
  public String getExperimenterOMEName(int experimenterIndex) {
    // NB: OMEName unsupported for schema version 2003-FC
    return null;
  }

  // - ExperimenterMembership property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getExperimenterMembershipGroup(int, int) */
  public String getExperimenterMembershipGroup(int experimenterIndex, int groupRefIndex) {
    GroupRefNode groupRef = getGroupRefNode(experimenterIndex, groupRefIndex, false);
          return groupRef == null ? null : groupRef.getNodeID();
      }

  // - Filament property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getFilamentType(int, int) */
  public String getFilamentType(int instrumentIndex, int lightSourceIndex) {
    FilamentNode filament = getFilamentNode(instrumentIndex, lightSourceIndex, false);
          return filament == null ? null : filament.getType();
      }

  // - Filter property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getFilterFilterWheel(int, int) */
  public String getFilterFilterWheel(int instrumentIndex, int filterIndex) {
    // NB: FilterWheel unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getFilterID(int, int) */
  public String getFilterID(int instrumentIndex, int filterIndex) {
    FilterNode filter = getFilterNode(instrumentIndex, filterIndex, false);
          return filter == null ? null : filter.getNodeID();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getFilterLotNumber(int, int) */
  public String getFilterLotNumber(int instrumentIndex, int filterIndex) {
    // NB: LotNumber unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getFilterManufacturer(int, int) */
  public String getFilterManufacturer(int instrumentIndex, int filterIndex) {
    // NB: Manufacturer unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getFilterModel(int, int) */
  public String getFilterModel(int instrumentIndex, int filterIndex) {
    // NB: Model unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getFilterType(int, int) */
  public String getFilterType(int instrumentIndex, int filterIndex) {
    // NB: Type unsupported for schema version 2003-FC
    return null;
  }

  // - FilterSet property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getFilterSetDichroic(int, int) */
  public String getFilterSetDichroic(int instrumentIndex, int filterSetIndex) {
    // NB: Dichroic unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getFilterSetEmFilter(int, int) */
  public String getFilterSetEmFilter(int instrumentIndex, int filterSetIndex) {
    // NB: EmFilter unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getFilterSetExFilter(int, int) */
  public String getFilterSetExFilter(int instrumentIndex, int filterSetIndex) {
    // NB: ExFilter unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getFilterSetID(int, int) */
  public String getFilterSetID(int instrumentIndex, int filterSetIndex) {
    FilterSetNode filterSet = getFilterSetNode(instrumentIndex, filterSetIndex, false);
          return filterSet == null ? null : filterSet.getNodeID();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getFilterSetLotNumber(int, int) */
  public String getFilterSetLotNumber(int instrumentIndex, int filterSetIndex) {
    FilterSetNode filterSet = getFilterSetNode(instrumentIndex, filterSetIndex, false);
          return filterSet == null ? null : filterSet.getLotNumber();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getFilterSetManufacturer(int, int) */
  public String getFilterSetManufacturer(int instrumentIndex, int filterSetIndex) {
    FilterSetNode filterSet = getFilterSetNode(instrumentIndex, filterSetIndex, false);
          return filterSet == null ? null : filterSet.getManufacturer();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getFilterSetModel(int, int) */
  public String getFilterSetModel(int instrumentIndex, int filterSetIndex) {
    FilterSetNode filterSet = getFilterSetNode(instrumentIndex, filterSetIndex, false);
          return filterSet == null ? null : filterSet.getModel();
      }

  // - Group property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getGroupID(int) */
  public String getGroupID(int groupIndex) {
    GroupNode group = getGroupNode(groupIndex, false);
          return group == null ? null : group.getNodeID();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getGroupName(int) */
  public String getGroupName(int groupIndex) {
    GroupNode group = getGroupNode(groupIndex, false);
          return group == null ? null : group.getName();
      }

  // - GroupRef property retrieval -

  // - Image property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getImageAcquiredPixels(int) */
  public String getImageAcquiredPixels(int imageIndex) {
    // NB: AcquiredPixels unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getImageCreationDate(int) */
  public String getImageCreationDate(int imageIndex) {
    ImageNode image = getImageNode(imageIndex, false);
          return image == null ? null : image.getCreationDate();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getImageDefaultPixels(int) */
  public String getImageDefaultPixels(int imageIndex) {
    ImageNode image = getImageNode(imageIndex, false);
          return image == null ? null : image.getDefaultPixels();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getImageDescription(int) */
  public String getImageDescription(int imageIndex) {
    ImageNode image = getImageNode(imageIndex, false);
          return image == null ? null : image.getDescription();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getImageExperimentRef(int) */
  public String getImageExperimentRef(int imageIndex) {
    ImageNode image = getImageNode(imageIndex, false);
    ExperimentNode node = image.getExperiment();
    if (node == null) return null;
    return node.getNodeID();
  }

  /* @see loci.formats.meta.MetadataRetrieve#getImageExperimenterRef(int) */
  public String getImageExperimenterRef(int imageIndex) {
    ImageNode image = getImageNode(imageIndex, false);
    ExperimenterNode node = image.getExperimenter();
    if (node == null) return null;
    return node.getNodeID();
  }

  /* @see loci.formats.meta.MetadataRetrieve#getImageGroupRef(int) */
  public String getImageGroupRef(int imageIndex) {
    ImageNode image = getImageNode(imageIndex, false);
    GroupNode node = image.getGroup();
    if (node == null) return null;
    return node.getNodeID();
  }

  /* @see loci.formats.meta.MetadataRetrieve#getImageID(int) */
  public String getImageID(int imageIndex) {
    ImageNode image = getImageNode(imageIndex, false);
          return image == null ? null : image.getNodeID();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getImageInstrumentRef(int) */
  public String getImageInstrumentRef(int imageIndex) {
    ImageNode image = getImageNode(imageIndex, false);
    InstrumentNode node = image.getInstrument();
    if (node == null) return null;
    return node.getNodeID();
  }

  /* @see loci.formats.meta.MetadataRetrieve#getImageName(int) */
  public String getImageName(int imageIndex) {
    ImageNode image = getImageNode(imageIndex, false);
          return image == null ? null : image.getName();
      }

  // - ImagingEnvironment property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getImagingEnvironmentAirPressure(int) */
  public Float getImagingEnvironmentAirPressure(int imageIndex) {
    ImagingEnvironmentNode imagingEnvironment = getImagingEnvironmentNode(imageIndex, false);
          return imagingEnvironment == null ? null : imagingEnvironment.getAirPressure();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getImagingEnvironmentCO2Percent(int) */
  public Float getImagingEnvironmentCO2Percent(int imageIndex) {
    ImagingEnvironmentNode imagingEnvironment = getImagingEnvironmentNode(imageIndex, false);
          return imagingEnvironment == null ? null : imagingEnvironment.getCO2Percent();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getImagingEnvironmentHumidity(int) */
  public Float getImagingEnvironmentHumidity(int imageIndex) {
    ImagingEnvironmentNode imagingEnvironment = getImagingEnvironmentNode(imageIndex, false);
          return imagingEnvironment == null ? null : imagingEnvironment.getHumidity();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getImagingEnvironmentTemperature(int) */
  public Float getImagingEnvironmentTemperature(int imageIndex) {
    ImagingEnvironmentNode imagingEnvironment = getImagingEnvironmentNode(imageIndex, false);
          return imagingEnvironment == null ? null : imagingEnvironment.getTemperature();
      }

  // - Instrument property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getInstrumentID(int) */
  public String getInstrumentID(int instrumentIndex) {
    InstrumentNode instrument = getInstrumentNode(instrumentIndex, false);
          return instrument == null ? null : instrument.getNodeID();
      }

  // - Laser property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getLaserFrequencyMultiplication(int, int) */
  public Integer getLaserFrequencyMultiplication(int instrumentIndex, int lightSourceIndex) {
    LaserNode laser = getLaserNode(instrumentIndex, lightSourceIndex, false);
          return laser == null ? null : booleanToInteger(laser.getFrequencyDoubled());
      }

  /* @see loci.formats.meta.MetadataRetrieve#getLaserLaserMedium(int, int) */
  public String getLaserLaserMedium(int instrumentIndex, int lightSourceIndex) {
    LaserNode laser = getLaserNode(instrumentIndex, lightSourceIndex, false);
          return laser == null ? null : laser.getMedium();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getLaserPockelCell(int, int) */
  public Boolean getLaserPockelCell(int instrumentIndex, int lightSourceIndex) {
    // NB: PockelCell unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getLaserPulse(int, int) */
  public String getLaserPulse(int instrumentIndex, int lightSourceIndex) {
    LaserNode laser = getLaserNode(instrumentIndex, lightSourceIndex, false);
          return laser == null ? null : laser.getPulse();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getLaserRepetitionRate(int, int) */
  public Boolean getLaserRepetitionRate(int instrumentIndex, int lightSourceIndex) {
    // NB: RepetitionRate unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getLaserTuneable(int, int) */
  public Boolean getLaserTuneable(int instrumentIndex, int lightSourceIndex) {
    LaserNode laser = getLaserNode(instrumentIndex, lightSourceIndex, false);
          return laser == null ? null : laser.getTunable();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getLaserType(int, int) */
  public String getLaserType(int instrumentIndex, int lightSourceIndex) {
    LaserNode laser = getLaserNode(instrumentIndex, lightSourceIndex, false);
          return laser == null ? null : laser.getType();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getLaserWavelength(int, int) */
  public Integer getLaserWavelength(int instrumentIndex, int lightSourceIndex) {
    LaserNode laser = getLaserNode(instrumentIndex, lightSourceIndex, false);
          return laser == null ? null : laser.getWavelength();
      }

  // - LightSource property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getLightSourceID(int, int) */
  public String getLightSourceID(int instrumentIndex, int lightSourceIndex) {
    LightSourceNode lightSource = getLightSourceNode(instrumentIndex, lightSourceIndex, false);
          return lightSource == null ? null : lightSource.getNodeID();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getLightSourceManufacturer(int, int) */
  public String getLightSourceManufacturer(int instrumentIndex, int lightSourceIndex) {
    LightSourceNode lightSource = getLightSourceNode(instrumentIndex, lightSourceIndex, false);
          return lightSource == null ? null : lightSource.getManufacturer();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getLightSourceModel(int, int) */
  public String getLightSourceModel(int instrumentIndex, int lightSourceIndex) {
    LightSourceNode lightSource = getLightSourceNode(instrumentIndex, lightSourceIndex, false);
          return lightSource == null ? null : lightSource.getModel();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getLightSourcePower(int, int) */
  public Float getLightSourcePower(int instrumentIndex, int lightSourceIndex) {
    // NB: Power unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getLightSourceSerialNumber(int, int) */
  public String getLightSourceSerialNumber(int instrumentIndex, int lightSourceIndex) {
    LightSourceNode lightSource = getLightSourceNode(instrumentIndex, lightSourceIndex, false);
          return lightSource == null ? null : lightSource.getSerialNumber();
      }

  // - LightSourceRef property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getLightSourceRefAttenuation(int, int, int) */
  public Float getLightSourceRefAttenuation(int imageIndex, int microbeamManipulationIndex, int lightSourceRefIndex) {
    // NB: Attenuation unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getLightSourceRefLightSource(int, int, int) */
  public String getLightSourceRefLightSource(int imageIndex, int microbeamManipulationIndex, int lightSourceRefIndex) {
    // NB: LightSource unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getLightSourceRefWavelength(int, int, int) */
  public Integer getLightSourceRefWavelength(int imageIndex, int microbeamManipulationIndex, int lightSourceRefIndex) {
    // NB: Wavelength unsupported for schema version 2003-FC
    return null;
  }

  // - LightSourceSettings property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getLightSourceSettingsAttenuation(int, int) */
  public Float getLightSourceSettingsAttenuation(int imageIndex, int logicalChannelIndex) {
    LightSourceRefNode lightSourceRef = getLightSourceRefNode(imageIndex, logicalChannelIndex, false);
          return lightSourceRef == null ? null : lightSourceRef.getAttenuation();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getLightSourceSettingsLightSource(int, int) */
  public String getLightSourceSettingsLightSource(int imageIndex, int logicalChannelIndex) {
    LightSourceRefNode lightSourceRef = getLightSourceRefNode(imageIndex, logicalChannelIndex, false);
          return lightSourceRef == null ? null : lightSourceRef.getNodeID();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getLightSourceSettingsWavelength(int, int) */
  public Integer getLightSourceSettingsWavelength(int imageIndex, int logicalChannelIndex) {
    LightSourceRefNode lightSourceRef = getLightSourceRefNode(imageIndex, logicalChannelIndex, false);
          return lightSourceRef == null ? null : lightSourceRef.getWavelength();
      }

  // - Line property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getLineID(int, int, int) */
  public String getLineID(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: ID unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getLineTransform(int, int, int) */
  public String getLineTransform(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: Transform unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getLineX1(int, int, int) */
  public String getLineX1(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: X1 unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getLineX2(int, int, int) */
  public String getLineX2(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: X2 unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getLineY1(int, int, int) */
  public String getLineY1(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: Y1 unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getLineY2(int, int, int) */
  public String getLineY2(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: Y2 unsupported for schema version 2003-FC
    return null;
  }

  // - LogicalChannel property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getLogicalChannelContrastMethod(int, int) */
  public String getLogicalChannelContrastMethod(int imageIndex, int logicalChannelIndex) {
    ChannelInfoNode channelInfo = getChannelInfoNode(imageIndex, logicalChannelIndex, false);
          return channelInfo == null ? null : channelInfo.getContrastMethod();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getLogicalChannelDetector(int, int) */
  public String getLogicalChannelDetector(int imageIndex, int logicalChannelIndex) {
    DetectorRefNode detectorRef = getDetectorRefNode(imageIndex, logicalChannelIndex, false);
          return detectorRef == null ? null : detectorRef.getNodeID();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getLogicalChannelEmWave(int, int) */
  public Integer getLogicalChannelEmWave(int imageIndex, int logicalChannelIndex) {
    ChannelInfoNode channelInfo = getChannelInfoNode(imageIndex, logicalChannelIndex, false);
          return channelInfo == null ? null : channelInfo.getEmWave();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getLogicalChannelExWave(int, int) */
  public Integer getLogicalChannelExWave(int imageIndex, int logicalChannelIndex) {
    ChannelInfoNode channelInfo = getChannelInfoNode(imageIndex, logicalChannelIndex, false);
          return channelInfo == null ? null : channelInfo.getExWave();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getLogicalChannelFilterSet(int, int) */
  public String getLogicalChannelFilterSet(int imageIndex, int logicalChannelIndex) {
    // NB: FilterSet unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getLogicalChannelFluor(int, int) */
  public String getLogicalChannelFluor(int imageIndex, int logicalChannelIndex) {
    ChannelInfoNode channelInfo = getChannelInfoNode(imageIndex, logicalChannelIndex, false);
          return channelInfo == null ? null : channelInfo.getFluor();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getLogicalChannelID(int, int) */
  public String getLogicalChannelID(int imageIndex, int logicalChannelIndex) {
    ChannelInfoNode channelInfo = getChannelInfoNode(imageIndex, logicalChannelIndex, false);
          return channelInfo == null ? null : channelInfo.getNodeID();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getLogicalChannelIlluminationType(int, int) */
  public String getLogicalChannelIlluminationType(int imageIndex, int logicalChannelIndex) {
    ChannelInfoNode channelInfo = getChannelInfoNode(imageIndex, logicalChannelIndex, false);
          return channelInfo == null ? null : channelInfo.getIlluminationType();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getLogicalChannelLightSource(int, int) */
  public String getLogicalChannelLightSource(int imageIndex, int logicalChannelIndex) {
    LightSourceRefNode lightSourceRef = getLightSourceRefNode(imageIndex, logicalChannelIndex, false);
          return lightSourceRef == null ? null : lightSourceRef.getNodeID();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getLogicalChannelMode(int, int) */
  public String getLogicalChannelMode(int imageIndex, int logicalChannelIndex) {
    ChannelInfoNode channelInfo = getChannelInfoNode(imageIndex, logicalChannelIndex, false);
          return channelInfo == null ? null : channelInfo.getMode();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getLogicalChannelName(int, int) */
  public String getLogicalChannelName(int imageIndex, int logicalChannelIndex) {
    ChannelInfoNode channelInfo = getChannelInfoNode(imageIndex, logicalChannelIndex, false);
          return channelInfo == null ? null : channelInfo.getName();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getLogicalChannelNdFilter(int, int) */
  public Float getLogicalChannelNdFilter(int imageIndex, int logicalChannelIndex) {
    ChannelInfoNode channelInfo = getChannelInfoNode(imageIndex, logicalChannelIndex, false);
          return channelInfo == null ? null : channelInfo.getNDfilter();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getLogicalChannelOTF(int, int) */
  public String getLogicalChannelOTF(int imageIndex, int logicalChannelIndex) {
    OTFRefNode otfRef = getOTFRefNode(imageIndex, logicalChannelIndex, false);
          return otfRef == null ? null : otfRef.getNodeID();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getLogicalChannelPhotometricInterpretation(int, int) */
  public String getLogicalChannelPhotometricInterpretation(int imageIndex, int logicalChannelIndex) {
    ChannelInfoNode channelInfo = getChannelInfoNode(imageIndex, logicalChannelIndex, false);
          return channelInfo == null ? null : channelInfo.getPhotometricInterpretation();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getLogicalChannelPinholeSize(int, int) */
  public Float getLogicalChannelPinholeSize(int imageIndex, int logicalChannelIndex) {
    ChannelInfoNode channelInfo = getChannelInfoNode(imageIndex, logicalChannelIndex, false);
          return channelInfo == null ? null : integerToFloat(channelInfo.getPinholeSize());
      }

  /* @see loci.formats.meta.MetadataRetrieve#getLogicalChannelPockelCellSetting(int, int) */
  public Integer getLogicalChannelPockelCellSetting(int imageIndex, int logicalChannelIndex) {
    // NB: PockelCellSetting unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getLogicalChannelSamplesPerPixel(int, int) */
  public Integer getLogicalChannelSamplesPerPixel(int imageIndex, int logicalChannelIndex) {
    ChannelInfoNode channelInfo = getChannelInfoNode(imageIndex, logicalChannelIndex, false);
          return channelInfo == null ? null : channelInfo.getSamplesPerPixel();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getLogicalChannelSecondaryEmissionFilter(int, int) */
  public String getLogicalChannelSecondaryEmissionFilter(int imageIndex, int logicalChannelIndex) {
    // NB: SecondaryEmissionFilter unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getLogicalChannelSecondaryExcitationFilter(int, int) */
  public String getLogicalChannelSecondaryExcitationFilter(int imageIndex, int logicalChannelIndex) {
    // NB: SecondaryExcitationFilter unsupported for schema version 2003-FC
    return null;
  }

  // - Mask property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getMaskHeight(int, int, int) */
  public String getMaskHeight(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: Height unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getMaskID(int, int, int) */
  public String getMaskID(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: ID unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getMaskTransform(int, int, int) */
  public String getMaskTransform(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: Transform unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getMaskWidth(int, int, int) */
  public String getMaskWidth(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: Width unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getMaskX(int, int, int) */
  public String getMaskX(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: X unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getMaskY(int, int, int) */
  public String getMaskY(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: Y unsupported for schema version 2003-FC
    return null;
  }

  // - MaskPixels property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getMaskPixelsBigEndian(int, int, int) */
  public Boolean getMaskPixelsBigEndian(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: BigEndian unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getMaskPixelsBinData(int, int, int) */
  public byte[] getMaskPixelsBinData(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: BinData unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getMaskPixelsExtendedPixelType(int, int, int) */
  public String getMaskPixelsExtendedPixelType(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: ExtendedPixelType unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getMaskPixelsID(int, int, int) */
  public String getMaskPixelsID(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: ID unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getMaskPixelsSizeX(int, int, int) */
  public Integer getMaskPixelsSizeX(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: SizeX unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getMaskPixelsSizeY(int, int, int) */
  public Integer getMaskPixelsSizeY(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: SizeY unsupported for schema version 2003-FC
    return null;
  }

  // - MicrobeamManipulation property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getMicrobeamManipulationExperimenterRef(int, int) */
  public String getMicrobeamManipulationExperimenterRef(int imageIndex, int microbeamManipulationIndex) {
    // NB: ExperimenterRef unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getMicrobeamManipulationID(int, int) */
  public String getMicrobeamManipulationID(int imageIndex, int microbeamManipulationIndex) {
    // NB: ID unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getMicrobeamManipulationType(int, int) */
  public String getMicrobeamManipulationType(int imageIndex, int microbeamManipulationIndex) {
    // NB: Type unsupported for schema version 2003-FC
    return null;
  }

  // - MicrobeamManipulationRef property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getMicrobeamManipulationRefID(int, int) */
  public String getMicrobeamManipulationRefID(int experimentIndex, int microbeamManipulationRefIndex) {
    // NB: ID unsupported for schema version 2003-FC
    return null;
  }

  // - Microscope property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getMicroscopeID(int) */
  public String getMicroscopeID(int instrumentIndex) {
    MicroscopeNode microscope = getMicroscopeNode(instrumentIndex, false);
          return microscope == null ? null : microscope.getNodeID();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getMicroscopeManufacturer(int) */
  public String getMicroscopeManufacturer(int instrumentIndex) {
    MicroscopeNode microscope = getMicroscopeNode(instrumentIndex, false);
          return microscope == null ? null : microscope.getManufacturer();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getMicroscopeModel(int) */
  public String getMicroscopeModel(int instrumentIndex) {
    MicroscopeNode microscope = getMicroscopeNode(instrumentIndex, false);
          return microscope == null ? null : microscope.getModel();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getMicroscopeSerialNumber(int) */
  public String getMicroscopeSerialNumber(int instrumentIndex) {
    MicroscopeNode microscope = getMicroscopeNode(instrumentIndex, false);
          return microscope == null ? null : microscope.getSerialNumber();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getMicroscopeType(int) */
  public String getMicroscopeType(int instrumentIndex) {
    MicroscopeNode microscope = getMicroscopeNode(instrumentIndex, false);
          return microscope == null ? null : microscope.getType();
      }

  // - OTF property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getOTFBinaryFile(int, int) */
  public String getOTFBinaryFile(int instrumentIndex, int otfIndex) {
    OTFNode otf = getOTFNode(instrumentIndex, otfIndex, false);
          return otf == null ? null : otf.getBinaryFile();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getOTFID(int, int) */
  public String getOTFID(int instrumentIndex, int otfIndex) {
    OTFNode otf = getOTFNode(instrumentIndex, otfIndex, false);
          return otf == null ? null : otf.getNodeID();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getOTFObjective(int, int) */
  public String getOTFObjective(int instrumentIndex, int otfIndex) {
    ObjectiveRefNode objectiveRef = getObjectiveRefNode(instrumentIndex, otfIndex, false);
          return objectiveRef == null ? null : objectiveRef.getNodeID();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getOTFOpticalAxisAveraged(int, int) */
  public Boolean getOTFOpticalAxisAveraged(int instrumentIndex, int otfIndex) {
    OTFNode otf = getOTFNode(instrumentIndex, otfIndex, false);
          return otf == null ? null : otf.getOpticalAxisAvrg();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getOTFPixelType(int, int) */
  public String getOTFPixelType(int instrumentIndex, int otfIndex) {
    OTFNode otf = getOTFNode(instrumentIndex, otfIndex, false);
          return otf == null ? null : otf.getPixelType();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getOTFSizeX(int, int) */
  public Integer getOTFSizeX(int instrumentIndex, int otfIndex) {
    OTFNode otf = getOTFNode(instrumentIndex, otfIndex, false);
          return otf == null ? null : otf.getSizeX();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getOTFSizeY(int, int) */
  public Integer getOTFSizeY(int instrumentIndex, int otfIndex) {
    OTFNode otf = getOTFNode(instrumentIndex, otfIndex, false);
          return otf == null ? null : otf.getSizeY();
      }

  // - Objective property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getObjectiveCalibratedMagnification(int, int) */
  public Float getObjectiveCalibratedMagnification(int instrumentIndex, int objectiveIndex) {
    ObjectiveNode objective = getObjectiveNode(instrumentIndex, objectiveIndex, false);
          return objective == null ? null : objective.getMagnification();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getObjectiveCorrection(int, int) */
  public String getObjectiveCorrection(int instrumentIndex, int objectiveIndex) {
    // NB: Correction unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getObjectiveID(int, int) */
  public String getObjectiveID(int instrumentIndex, int objectiveIndex) {
    ObjectiveNode objective = getObjectiveNode(instrumentIndex, objectiveIndex, false);
          return objective == null ? null : objective.getNodeID();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getObjectiveImmersion(int, int) */
  public String getObjectiveImmersion(int instrumentIndex, int objectiveIndex) {
    // NB: Immersion unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getObjectiveIris(int, int) */
  public Boolean getObjectiveIris(int instrumentIndex, int objectiveIndex) {
    // NB: Iris unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getObjectiveLensNA(int, int) */
  public Float getObjectiveLensNA(int instrumentIndex, int objectiveIndex) {
    ObjectiveNode objective = getObjectiveNode(instrumentIndex, objectiveIndex, false);
          return objective == null ? null : objective.getLensNA();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getObjectiveManufacturer(int, int) */
  public String getObjectiveManufacturer(int instrumentIndex, int objectiveIndex) {
    ObjectiveNode objective = getObjectiveNode(instrumentIndex, objectiveIndex, false);
          return objective == null ? null : objective.getManufacturer();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getObjectiveModel(int, int) */
  public String getObjectiveModel(int instrumentIndex, int objectiveIndex) {
    ObjectiveNode objective = getObjectiveNode(instrumentIndex, objectiveIndex, false);
          return objective == null ? null : objective.getModel();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getObjectiveNominalMagnification(int, int) */
  public Integer getObjectiveNominalMagnification(int instrumentIndex, int objectiveIndex) {
    // NB: NominalMagnification unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getObjectiveSerialNumber(int, int) */
  public String getObjectiveSerialNumber(int instrumentIndex, int objectiveIndex) {
    ObjectiveNode objective = getObjectiveNode(instrumentIndex, objectiveIndex, false);
          return objective == null ? null : objective.getSerialNumber();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getObjectiveWorkingDistance(int, int) */
  public Float getObjectiveWorkingDistance(int instrumentIndex, int objectiveIndex) {
    // NB: WorkingDistance unsupported for schema version 2003-FC
    return null;
  }

  // - ObjectiveSettings property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getObjectiveSettingsCorrectionCollar(int) */
  public Float getObjectiveSettingsCorrectionCollar(int imageIndex) {
    // NB: CorrectionCollar unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getObjectiveSettingsMedium(int) */
  public String getObjectiveSettingsMedium(int imageIndex) {
    // NB: Medium unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getObjectiveSettingsObjective(int) */
  public String getObjectiveSettingsObjective(int imageIndex) {
    ObjectiveRefNode objectiveRef = getObjectiveRefNode(imageIndex, false);
          return objectiveRef == null ? null : objectiveRef.getNodeID();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getObjectiveSettingsRefractiveIndex(int) */
  public Float getObjectiveSettingsRefractiveIndex(int imageIndex) {
    // NB: RefractiveIndex unsupported for schema version 2003-FC
    return null;
  }

  // - Path property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getPathD(int, int, int) */
  public String getPathD(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: D unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getPathID(int, int, int) */
  public String getPathID(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: ID unsupported for schema version 2003-FC
    return null;
  }

  // - Pixels property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getPixelsBigEndian(int, int) */
  public Boolean getPixelsBigEndian(int imageIndex, int pixelsIndex) {
    PixelsNode pixels = getPixelsNode(imageIndex, pixelsIndex, false);
          return pixels == null ? null : pixels.getBigEndian();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getPixelsDimensionOrder(int, int) */
  public String getPixelsDimensionOrder(int imageIndex, int pixelsIndex) {
    PixelsNode pixels = getPixelsNode(imageIndex, pixelsIndex, false);
          return pixels == null ? null : pixels.getDimensionOrder();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getPixelsID(int, int) */
  public String getPixelsID(int imageIndex, int pixelsIndex) {
    PixelsNode pixels = getPixelsNode(imageIndex, pixelsIndex, false);
          return pixels == null ? null : pixels.getNodeID();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getPixelsPixelType(int, int) */
  public String getPixelsPixelType(int imageIndex, int pixelsIndex) {
    PixelsNode pixels = getPixelsNode(imageIndex, pixelsIndex, false);
          return pixels == null ? null : pixels.getPixelType();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getPixelsSizeC(int, int) */
  public Integer getPixelsSizeC(int imageIndex, int pixelsIndex) {
    PixelsNode pixels = getPixelsNode(imageIndex, pixelsIndex, false);
          return pixels == null ? null : pixels.getSizeC();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getPixelsSizeT(int, int) */
  public Integer getPixelsSizeT(int imageIndex, int pixelsIndex) {
    PixelsNode pixels = getPixelsNode(imageIndex, pixelsIndex, false);
          return pixels == null ? null : pixels.getSizeT();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getPixelsSizeX(int, int) */
  public Integer getPixelsSizeX(int imageIndex, int pixelsIndex) {
    PixelsNode pixels = getPixelsNode(imageIndex, pixelsIndex, false);
          return pixels == null ? null : pixels.getSizeX();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getPixelsSizeY(int, int) */
  public Integer getPixelsSizeY(int imageIndex, int pixelsIndex) {
    PixelsNode pixels = getPixelsNode(imageIndex, pixelsIndex, false);
          return pixels == null ? null : pixels.getSizeY();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getPixelsSizeZ(int, int) */
  public Integer getPixelsSizeZ(int imageIndex, int pixelsIndex) {
    PixelsNode pixels = getPixelsNode(imageIndex, pixelsIndex, false);
          return pixels == null ? null : pixels.getSizeZ();
      }

  // - Plane property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getPlaneHashSHA1(int, int, int) */
  public String getPlaneHashSHA1(int imageIndex, int pixelsIndex, int planeIndex) {
    // NB: HashSHA1 unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getPlaneID(int, int, int) */
  public String getPlaneID(int imageIndex, int pixelsIndex, int planeIndex) {
    // NB: ID unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getPlaneTheC(int, int, int) */
  public Integer getPlaneTheC(int imageIndex, int pixelsIndex, int planeIndex) {
    // NB: TheC unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getPlaneTheT(int, int, int) */
  public Integer getPlaneTheT(int imageIndex, int pixelsIndex, int planeIndex) {
    // NB: TheT unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getPlaneTheZ(int, int, int) */
  public Integer getPlaneTheZ(int imageIndex, int pixelsIndex, int planeIndex) {
    // NB: TheZ unsupported for schema version 2003-FC
    return null;
  }

  // - PlaneTiming property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getPlaneTimingDeltaT(int, int, int) */
  public Float getPlaneTimingDeltaT(int imageIndex, int pixelsIndex, int planeIndex) {
    // NB: DeltaT unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getPlaneTimingExposureTime(int, int, int) */
  public Float getPlaneTimingExposureTime(int imageIndex, int pixelsIndex, int planeIndex) {
    // NB: ExposureTime unsupported for schema version 2003-FC
    return null;
  }

  // - Plate property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getPlateColumnNamingConvention(int) */
  public String getPlateColumnNamingConvention(int plateIndex) {
    // NB: ColumnNamingConvention unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getPlateDescription(int) */
  public String getPlateDescription(int plateIndex) {
    // NB: Description unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getPlateExternalIdentifier(int) */
  public String getPlateExternalIdentifier(int plateIndex) {
    PlateNode plate = getPlateNode(plateIndex, false);
          return plate == null ? null : plate.getExternRef();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getPlateID(int) */
  public String getPlateID(int plateIndex) {
    PlateNode plate = getPlateNode(plateIndex, false);
          return plate == null ? null : plate.getNodeID();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getPlateName(int) */
  public String getPlateName(int plateIndex) {
    PlateNode plate = getPlateNode(plateIndex, false);
          return plate == null ? null : plate.getName();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getPlateRowNamingConvention(int) */
  public String getPlateRowNamingConvention(int plateIndex) {
    // NB: RowNamingConvention unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getPlateStatus(int) */
  public String getPlateStatus(int plateIndex) {
    // NB: Status unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getPlateWellOriginX(int) */
  public Double getPlateWellOriginX(int plateIndex) {
    // NB: WellOriginX unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getPlateWellOriginY(int) */
  public Double getPlateWellOriginY(int plateIndex) {
    // NB: WellOriginY unsupported for schema version 2003-FC
    return null;
  }

  // - PlateRef property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getPlateRefID(int, int) */
  public String getPlateRefID(int screenIndex, int plateRefIndex) {
    PlateRefNode plateRef = getPlateRefNode(screenIndex, false);
          return plateRef == null ? null : plateRef.getNodeID();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getPlateRefSample(int, int) */
  public Integer getPlateRefSample(int screenIndex, int plateRefIndex) {
    PlateRefNode plateRef = getPlateRefNode(screenIndex, false);
          return plateRef == null ? null : plateRef.getSample();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getPlateRefWell(int, int) */
  public String getPlateRefWell(int screenIndex, int plateRefIndex) {
    PlateRefNode plateRef = getPlateRefNode(screenIndex, false);
          return plateRef == null ? null : plateRef.getWell();
      }

  // - Point property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getPointCx(int, int, int) */
  public String getPointCx(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: Cx unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getPointCy(int, int, int) */
  public String getPointCy(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: Cy unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getPointID(int, int, int) */
  public String getPointID(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: ID unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getPointR(int, int, int) */
  public String getPointR(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: R unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getPointTransform(int, int, int) */
  public String getPointTransform(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: Transform unsupported for schema version 2003-FC
    return null;
  }

  // - Polygon property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getPolygonID(int, int, int) */
  public String getPolygonID(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: ID unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getPolygonPoints(int, int, int) */
  public String getPolygonPoints(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: Points unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getPolygonTransform(int, int, int) */
  public String getPolygonTransform(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: Transform unsupported for schema version 2003-FC
    return null;
  }

  // - Polyline property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getPolylineID(int, int, int) */
  public String getPolylineID(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: ID unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getPolylinePoints(int, int, int) */
  public String getPolylinePoints(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: Points unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getPolylineTransform(int, int, int) */
  public String getPolylineTransform(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: Transform unsupported for schema version 2003-FC
    return null;
  }

  // - Project property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getProjectDescription(int) */
  public String getProjectDescription(int projectIndex) {
    ProjectNode project = getProjectNode(projectIndex, false);
          return project == null ? null : project.getDescription();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getProjectExperimenterRef(int) */
  public String getProjectExperimenterRef(int projectIndex) {
    ProjectNode project = getProjectNode(projectIndex, false);
    ExperimenterNode node = project.getExperimenter();
    if (node == null) return null;
    return node.getNodeID();
  }

  /* @see loci.formats.meta.MetadataRetrieve#getProjectGroupRef(int) */
  public String getProjectGroupRef(int projectIndex) {
    ProjectNode project = getProjectNode(projectIndex, false);
    GroupNode node = project.getGroup();
    if (node == null) return null;
    return node.getNodeID();
  }

  /* @see loci.formats.meta.MetadataRetrieve#getProjectID(int) */
  public String getProjectID(int projectIndex) {
    ProjectNode project = getProjectNode(projectIndex, false);
          return project == null ? null : project.getNodeID();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getProjectName(int) */
  public String getProjectName(int projectIndex) {
    ProjectNode project = getProjectNode(projectIndex, false);
          return project == null ? null : project.getName();
      }

  // - ProjectRef property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getProjectRefID(int, int) */
  public String getProjectRefID(int datasetIndex, int projectRefIndex) {
    ProjectRefNode projectRef = getProjectRefNode(datasetIndex, projectRefIndex, false);
          return projectRef == null ? null : projectRef.getNodeID();
      }

  // - Pump property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getPumpLightSource(int, int) */
  public String getPumpLightSource(int instrumentIndex, int lightSourceIndex) {
    PumpNode pump = getPumpNode(instrumentIndex, lightSourceIndex, false);
          return pump == null ? null : pump.getNodeID();
      }

  // - ROI property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getROIID(int, int) */
  public String getROIID(int imageIndex, int roiIndex) {
    ROINode roi = getROINode(imageIndex, roiIndex, false);
          return roi == null ? null : roi.getNodeID();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getROIT0(int, int) */
  public Integer getROIT0(int imageIndex, int roiIndex) {
    ROINode roi = getROINode(imageIndex, roiIndex, false);
          return roi == null ? null : roi.getT0();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getROIT1(int, int) */
  public Integer getROIT1(int imageIndex, int roiIndex) {
    ROINode roi = getROINode(imageIndex, roiIndex, false);
          return roi == null ? null : roi.getT1();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getROIX0(int, int) */
  public Integer getROIX0(int imageIndex, int roiIndex) {
    ROINode roi = getROINode(imageIndex, roiIndex, false);
          return roi == null ? null : roi.getX0();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getROIX1(int, int) */
  public Integer getROIX1(int imageIndex, int roiIndex) {
    ROINode roi = getROINode(imageIndex, roiIndex, false);
          return roi == null ? null : roi.getX1();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getROIY0(int, int) */
  public Integer getROIY0(int imageIndex, int roiIndex) {
    ROINode roi = getROINode(imageIndex, roiIndex, false);
          return roi == null ? null : roi.getY0();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getROIY1(int, int) */
  public Integer getROIY1(int imageIndex, int roiIndex) {
    ROINode roi = getROINode(imageIndex, roiIndex, false);
          return roi == null ? null : roi.getY1();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getROIZ0(int, int) */
  public Integer getROIZ0(int imageIndex, int roiIndex) {
    ROINode roi = getROINode(imageIndex, roiIndex, false);
          return roi == null ? null : roi.getZ0();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getROIZ1(int, int) */
  public Integer getROIZ1(int imageIndex, int roiIndex) {
    ROINode roi = getROINode(imageIndex, roiIndex, false);
          return roi == null ? null : roi.getZ1();
      }

  // - ROIRef property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getROIRefID(int, int, int) */
  public String getROIRefID(int imageIndex, int microbeamManipulationIndex, int roiRefIndex) {
    // NB: ID unsupported for schema version 2003-FC
    return null;
  }

  // - Reagent property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getReagentDescription(int, int) */
  public String getReagentDescription(int screenIndex, int reagentIndex) {
    // NB: Description unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getReagentID(int, int) */
  public String getReagentID(int screenIndex, int reagentIndex) {
    // NB: ID unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getReagentName(int, int) */
  public String getReagentName(int screenIndex, int reagentIndex) {
    // NB: Name unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getReagentReagentIdentifier(int, int) */
  public String getReagentReagentIdentifier(int screenIndex, int reagentIndex) {
    // NB: ReagentIdentifier unsupported for schema version 2003-FC
    return null;
  }

  // - Rect property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getRectHeight(int, int, int) */
  public String getRectHeight(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: Height unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getRectID(int, int, int) */
  public String getRectID(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: ID unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getRectTransform(int, int, int) */
  public String getRectTransform(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: Transform unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getRectWidth(int, int, int) */
  public String getRectWidth(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: Width unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getRectX(int, int, int) */
  public String getRectX(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: X unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getRectY(int, int, int) */
  public String getRectY(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: Y unsupported for schema version 2003-FC
    return null;
  }

  // - Region property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getRegionID(int, int) */
  public String getRegionID(int imageIndex, int regionIndex) {
    // NB: ID unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getRegionName(int, int) */
  public String getRegionName(int imageIndex, int regionIndex) {
    // NB: Name unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getRegionTag(int, int) */
  public String getRegionTag(int imageIndex, int regionIndex) {
    // NB: Tag unsupported for schema version 2003-FC
    return null;
  }

  // - RoiLink property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getRoiLinkDirection(int, int, int) */
  public String getRoiLinkDirection(int imageIndex, int roiIndex, int roiLinkIndex) {
    // NB: Direction unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getRoiLinkName(int, int, int) */
  public String getRoiLinkName(int imageIndex, int roiIndex, int roiLinkIndex) {
    // NB: Name unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getRoiLinkRef(int, int, int) */
  public String getRoiLinkRef(int imageIndex, int roiIndex, int roiLinkIndex) {
    // NB: Ref unsupported for schema version 2003-FC
    return null;
  }

  // - Screen property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getScreenDescription(int) */
  public String getScreenDescription(int screenIndex) {
    ScreenNode screen = getScreenNode(screenIndex, false);
          return screen == null ? null : screen.getDescription();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getScreenExtern(int) */
  public String getScreenExtern(int screenIndex) {
    ScreenNode screen = getScreenNode(screenIndex, false);
          return screen == null ? null : screen.getExternRef();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getScreenID(int) */
  public String getScreenID(int screenIndex) {
    ScreenNode screen = getScreenNode(screenIndex, false);
          return screen == null ? null : screen.getNodeID();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getScreenName(int) */
  public String getScreenName(int screenIndex) {
    ScreenNode screen = getScreenNode(screenIndex, false);
          return screen == null ? null : screen.getName();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getScreenProtocolDescription(int) */
  public String getScreenProtocolDescription(int screenIndex) {
    // NB: ProtocolDescription unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getScreenProtocolIdentifier(int) */
  public String getScreenProtocolIdentifier(int screenIndex) {
    // NB: ProtocolIdentifier unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getScreenReagentSetDescription(int) */
  public String getScreenReagentSetDescription(int screenIndex) {
    // NB: ReagentSetDescription unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getScreenReagentSetIdentifier(int) */
  public String getScreenReagentSetIdentifier(int screenIndex) {
    // NB: ReagentSetIdentifier unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getScreenType(int) */
  public String getScreenType(int screenIndex) {
    // NB: Type unsupported for schema version 2003-FC
    return null;
  }

  // - ScreenAcquisition property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getScreenAcquisitionEndTime(int, int) */
  public String getScreenAcquisitionEndTime(int screenIndex, int screenAcquisitionIndex) {
    // NB: EndTime unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getScreenAcquisitionID(int, int) */
  public String getScreenAcquisitionID(int screenIndex, int screenAcquisitionIndex) {
    // NB: ID unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getScreenAcquisitionStartTime(int, int) */
  public String getScreenAcquisitionStartTime(int screenIndex, int screenAcquisitionIndex) {
    // NB: StartTime unsupported for schema version 2003-FC
    return null;
  }

  // - ScreenRef property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getScreenRefID(int, int) */
  public String getScreenRefID(int plateIndex, int screenRefIndex) {
    ScreenRefNode screenRef = getScreenRefNode(plateIndex, screenRefIndex, false);
          return screenRef == null ? null : screenRef.getNodeID();
      }

  // - Shape property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getShapeBaselineShift(int, int, int) */
  public String getShapeBaselineShift(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: BaselineShift unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getShapeDirection(int, int, int) */
  public String getShapeDirection(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: Direction unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getShapeFillColor(int, int, int) */
  public String getShapeFillColor(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: FillColor unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getShapeFillOpacity(int, int, int) */
  public String getShapeFillOpacity(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: FillOpacity unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getShapeFillRule(int, int, int) */
  public String getShapeFillRule(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: FillRule unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getShapeFontFamily(int, int, int) */
  public String getShapeFontFamily(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: FontFamily unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getShapeFontSize(int, int, int) */
  public Integer getShapeFontSize(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: FontSize unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getShapeFontStretch(int, int, int) */
  public String getShapeFontStretch(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: FontStretch unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getShapeFontStyle(int, int, int) */
  public String getShapeFontStyle(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: FontStyle unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getShapeFontVariant(int, int, int) */
  public String getShapeFontVariant(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: FontVariant unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getShapeFontWeight(int, int, int) */
  public String getShapeFontWeight(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: FontWeight unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getShapeG(int, int, int) */
  public String getShapeG(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: G unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getShapeGlyphOrientationVertical(int, int, int) */
  public Integer getShapeGlyphOrientationVertical(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: GlyphOrientationVertical unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getShapeID(int, int, int) */
  public String getShapeID(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: ID unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getShapeLocked(int, int, int) */
  public Boolean getShapeLocked(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: Locked unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getShapeStrokeAttribute(int, int, int) */
  public String getShapeStrokeAttribute(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: StrokeAttribute unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getShapeStrokeColor(int, int, int) */
  public String getShapeStrokeColor(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: StrokeColor unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getShapeStrokeDashArray(int, int, int) */
  public String getShapeStrokeDashArray(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: StrokeDashArray unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getShapeStrokeLineCap(int, int, int) */
  public String getShapeStrokeLineCap(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: StrokeLineCap unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getShapeStrokeLineJoin(int, int, int) */
  public String getShapeStrokeLineJoin(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: StrokeLineJoin unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getShapeStrokeMiterLimit(int, int, int) */
  public Integer getShapeStrokeMiterLimit(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: StrokeMiterLimit unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getShapeStrokeOpacity(int, int, int) */
  public Float getShapeStrokeOpacity(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: StrokeOpacity unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getShapeStrokeWidth(int, int, int) */
  public Integer getShapeStrokeWidth(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: StrokeWidth unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getShapeText(int, int, int) */
  public String getShapeText(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: Text unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getShapeTextAnchor(int, int, int) */
  public String getShapeTextAnchor(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: TextAnchor unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getShapeTextDecoration(int, int, int) */
  public String getShapeTextDecoration(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: TextDecoration unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getShapeTextFill(int, int, int) */
  public String getShapeTextFill(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: TextFill unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getShapeTextStroke(int, int, int) */
  public String getShapeTextStroke(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: TextStroke unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getShapeTheT(int, int, int) */
  public Integer getShapeTheT(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: TheT unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getShapeTheZ(int, int, int) */
  public Integer getShapeTheZ(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: TheZ unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getShapeVectorEffect(int, int, int) */
  public String getShapeVectorEffect(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: VectorEffect unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getShapeVisibility(int, int, int) */
  public Boolean getShapeVisibility(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: Visibility unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getShapeWritingMode(int, int, int) */
  public String getShapeWritingMode(int imageIndex, int roiIndex, int shapeIndex) {
    // NB: WritingMode unsupported for schema version 2003-FC
    return null;
  }

  // - StageLabel property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getStageLabelName(int) */
  public String getStageLabelName(int imageIndex) {
    StageLabelNode stageLabel = getStageLabelNode(imageIndex, false);
          return stageLabel == null ? null : stageLabel.getName();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getStageLabelX(int) */
  public Float getStageLabelX(int imageIndex) {
    StageLabelNode stageLabel = getStageLabelNode(imageIndex, false);
          return stageLabel == null ? null : stageLabel.getX();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getStageLabelY(int) */
  public Float getStageLabelY(int imageIndex) {
    StageLabelNode stageLabel = getStageLabelNode(imageIndex, false);
          return stageLabel == null ? null : stageLabel.getY();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getStageLabelZ(int) */
  public Float getStageLabelZ(int imageIndex) {
    StageLabelNode stageLabel = getStageLabelNode(imageIndex, false);
          return stageLabel == null ? null : stageLabel.getZ();
      }

  // - StagePosition property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getStagePositionPositionX(int, int, int) */
  public Float getStagePositionPositionX(int imageIndex, int pixelsIndex, int planeIndex) {
    // NB: PositionX unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getStagePositionPositionY(int, int, int) */
  public Float getStagePositionPositionY(int imageIndex, int pixelsIndex, int planeIndex) {
    // NB: PositionY unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getStagePositionPositionZ(int, int, int) */
  public Float getStagePositionPositionZ(int imageIndex, int pixelsIndex, int planeIndex) {
    // NB: PositionZ unsupported for schema version 2003-FC
    return null;
  }

  // - Thumbnail property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getThumbnailHref(int) */
  public String getThumbnailHref(int imageIndex) {
    ThumbnailNode thumbnail = getThumbnailNode(imageIndex, false);
          return thumbnail == null ? null : thumbnail.gethref();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getThumbnailID(int) */
  public String getThumbnailID(int imageIndex) {
    ThumbnailNode thumbnail = getThumbnailNode(imageIndex, false);
          return thumbnail == null ? null : thumbnail.getNodeID();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getThumbnailMIMEtype(int) */
  public String getThumbnailMIMEtype(int imageIndex) {
    ThumbnailNode thumbnail = getThumbnailNode(imageIndex, false);
          return thumbnail == null ? null : thumbnail.getMIMEtype();
      }

  // - TiffData property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getTiffDataFileName(int, int, int) */
  public String getTiffDataFileName(int imageIndex, int pixelsIndex, int tiffDataIndex) {
    // NB: FileName unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getTiffDataFirstC(int, int, int) */
  public Integer getTiffDataFirstC(int imageIndex, int pixelsIndex, int tiffDataIndex) {
    TiffDataNode tiffData = getTiffDataNode(imageIndex, pixelsIndex, tiffDataIndex, false);
          return tiffData == null ? null : tiffData.getFirstC();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getTiffDataFirstT(int, int, int) */
  public Integer getTiffDataFirstT(int imageIndex, int pixelsIndex, int tiffDataIndex) {
    TiffDataNode tiffData = getTiffDataNode(imageIndex, pixelsIndex, tiffDataIndex, false);
          return tiffData == null ? null : tiffData.getFirstT();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getTiffDataFirstZ(int, int, int) */
  public Integer getTiffDataFirstZ(int imageIndex, int pixelsIndex, int tiffDataIndex) {
    TiffDataNode tiffData = getTiffDataNode(imageIndex, pixelsIndex, tiffDataIndex, false);
          return tiffData == null ? null : tiffData.getFirstZ();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getTiffDataIFD(int, int, int) */
  public Integer getTiffDataIFD(int imageIndex, int pixelsIndex, int tiffDataIndex) {
    TiffDataNode tiffData = getTiffDataNode(imageIndex, pixelsIndex, tiffDataIndex, false);
          return tiffData == null ? null : tiffData.getIFD();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getTiffDataNumPlanes(int, int, int) */
  public Integer getTiffDataNumPlanes(int imageIndex, int pixelsIndex, int tiffDataIndex) {
    TiffDataNode tiffData = getTiffDataNode(imageIndex, pixelsIndex, tiffDataIndex, false);
          return tiffData == null ? null : tiffData.getNumPlanes();
      }

  /* @see loci.formats.meta.MetadataRetrieve#getTiffDataUUID(int, int, int) */
  public String getTiffDataUUID(int imageIndex, int pixelsIndex, int tiffDataIndex) {
    // NB: UUID unsupported for schema version 2003-FC
    return null;
  }

  // - TransmittanceRange property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getTransmittanceRangeCutIn(int, int) */
  public Integer getTransmittanceRangeCutIn(int instrumentIndex, int filterIndex) {
    // NB: CutIn unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getTransmittanceRangeCutInTolerance(int, int) */
  public Integer getTransmittanceRangeCutInTolerance(int instrumentIndex, int filterIndex) {
    // NB: CutInTolerance unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getTransmittanceRangeCutOut(int, int) */
  public Integer getTransmittanceRangeCutOut(int instrumentIndex, int filterIndex) {
    // NB: CutOut unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getTransmittanceRangeCutOutTolerance(int, int) */
  public Integer getTransmittanceRangeCutOutTolerance(int instrumentIndex, int filterIndex) {
    // NB: CutOutTolerance unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getTransmittanceRangeTransmittance(int, int) */
  public Integer getTransmittanceRangeTransmittance(int instrumentIndex, int filterIndex) {
    // NB: Transmittance unsupported for schema version 2003-FC
    return null;
  }

  // - Well property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getWellColumn(int, int) */
  public Integer getWellColumn(int plateIndex, int wellIndex) {
    // NB: Column unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getWellExternalDescription(int, int) */
  public String getWellExternalDescription(int plateIndex, int wellIndex) {
    // NB: ExternalDescription unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getWellExternalIdentifier(int, int) */
  public String getWellExternalIdentifier(int plateIndex, int wellIndex) {
    // NB: ExternalIdentifier unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getWellID(int, int) */
  public String getWellID(int plateIndex, int wellIndex) {
    // NB: ID unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getWellReagent(int, int) */
  public String getWellReagent(int plateIndex, int wellIndex) {
    // NB: Reagent unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getWellRow(int, int) */
  public Integer getWellRow(int plateIndex, int wellIndex) {
    // NB: Row unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getWellType(int, int) */
  public String getWellType(int plateIndex, int wellIndex) {
    // NB: Type unsupported for schema version 2003-FC
    return null;
  }

  // - WellSample property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getWellSampleID(int, int, int) */
  public String getWellSampleID(int plateIndex, int wellIndex, int wellSampleIndex) {
    // NB: ID unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getWellSampleImageRef(int, int, int) */
  public String getWellSampleImageRef(int plateIndex, int wellIndex, int wellSampleIndex) {
    // NB: ImageRef unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getWellSampleIndex(int, int, int) */
  public Integer getWellSampleIndex(int plateIndex, int wellIndex, int wellSampleIndex) {
    // NB: Index unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getWellSamplePosX(int, int, int) */
  public Float getWellSamplePosX(int plateIndex, int wellIndex, int wellSampleIndex) {
    // NB: PosX unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getWellSamplePosY(int, int, int) */
  public Float getWellSamplePosY(int plateIndex, int wellIndex, int wellSampleIndex) {
    // NB: PosY unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getWellSampleTimepoint(int, int, int) */
  public Integer getWellSampleTimepoint(int plateIndex, int wellIndex, int wellSampleIndex) {
    // NB: Timepoint unsupported for schema version 2003-FC
    return null;
  }

  // - WellSampleRef property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getWellSampleRefID(int, int, int) */
  public String getWellSampleRefID(int screenIndex, int screenAcquisitionIndex, int wellSampleRefIndex) {
    // NB: ID unsupported for schema version 2003-FC
    return null;
  }

  // -- MetadataStore API methods --

  /* @see loci.formats.meta.MetadataStore#setRoot(Object) */
  public void createRoot() {
    try {
      setRoot(ome.xml.OMEXMLFactory.newOMENode("2003-FC"));
    }
    catch (java.io.IOException exc) { LogTools.trace(exc); }
    catch (org.xml.sax.SAXException exc) { LogTools.trace(exc); }
    catch (javax.xml.parsers.ParserConfigurationException exc) {
      LogTools.trace(exc);
    }
  }

  /* @see loci.formats.meta.MetadataStore#setRoot(Object) */
  public void setRoot(Object root) {
    super.setRoot(root);
    if (!(root instanceof OMENode)) {
      throw new IllegalArgumentException(
        "Invalid root type: " + root.getClass().getName() + ". " +
        "This metadata store accepts root objects of type " +
        OMENode.class.getName());
    }
    this.root = (OMENode) root;
    clearCachedNodes();
  }

  // - Arc property storage -

  /* @see loci.formats.meta.MetadataStore#setArcType(String, int, int) */
  public void setArcType(String type, int instrumentIndex, int lightSourceIndex) {
    if (type == null) return;
    ArcNode arcNode = getArcNode(instrumentIndex, lightSourceIndex, true);
            String[] enumeration = new String[] {"Hg", "Xe", "Hg-Xe"};
    if (enumeration.length > 0) {
      for (String v : enumeration) {
        if (v.equalsIgnoreCase(type)) {
          type = v;
          arcNode.setType(type);
          return;
        }
      }
          }
    else
          arcNode.setType(type);
      }

  // - ChannelComponent property storage -

  /* @see loci.formats.meta.MetadataStore#setChannelComponentColorDomain(String, int, int, int) */
  public void setChannelComponentColorDomain(String colorDomain, int imageIndex, int logicalChannelIndex, int channelComponentIndex) {
    if (colorDomain == null) return;
    ChannelComponentNode channelComponentNode = getChannelComponentNode(imageIndex, logicalChannelIndex, channelComponentIndex, true);
              channelComponentNode.setColorDomain(colorDomain);
      }

  /* @see loci.formats.meta.MetadataStore#setChannelComponentIndex(Integer, int, int, int) */
  public void setChannelComponentIndex(Integer index, int imageIndex, int logicalChannelIndex, int channelComponentIndex) {
    if (index == null) return;
    ChannelComponentNode channelComponentNode = getChannelComponentNode(imageIndex, logicalChannelIndex, channelComponentIndex, true);
              channelComponentNode.setIndex(index);
      }

  /* @see loci.formats.meta.MetadataStore#setChannelComponentPixels(String, int, int, int) */
  public void setChannelComponentPixels(String pixels, int imageIndex, int logicalChannelIndex, int channelComponentIndex) {
    if (pixels == null) return;
    ChannelComponentNode channelComponentNode = getChannelComponentNode(imageIndex, logicalChannelIndex, channelComponentIndex, true);
              channelComponentNode.setPixels(pixels);
      }

  // - Circle property storage -

  /* @see loci.formats.meta.MetadataStore#setCircleCx(String, int, int, int) */
  public void setCircleCx(String cx, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: Cx unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setCircleCy(String, int, int, int) */
  public void setCircleCy(String cy, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: Cy unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setCircleID(String, int, int, int) */
  public void setCircleID(String id, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: ID unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setCircleR(String, int, int, int) */
  public void setCircleR(String r, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: R unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setCircleTransform(String, int, int, int) */
  public void setCircleTransform(String transform, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: Transform unsupported for schema version 2003-FC
  }

  // - Contact property storage -

  /* @see loci.formats.meta.MetadataStore#setContactExperimenter(String, int) */
  public void setContactExperimenter(String experimenter, int groupIndex) {
    if (experimenter == null) return;
    ContactNode contactNode = getContactNode(groupIndex, true);
              contactNode.setNodeID(experimenter);
      }

  // - Dataset property storage -

  /* @see loci.formats.meta.MetadataStore#setDatasetDescription(String, int) */
  public void setDatasetDescription(String description, int datasetIndex) {
    if (description == null) return;
    DatasetNode datasetNode = getDatasetNode(datasetIndex, true);
              datasetNode.setDescription(description);
      }

  /* @see loci.formats.meta.MetadataStore#setDatasetExperimenterRef(String, int) */
  public void setDatasetExperimenterRef(String experimenterRef, int datasetIndex) {
    if (experimenterRef == null) return;
    DatasetNode datasetNode = getDatasetNode(datasetIndex, true);
    OMENode ome = (OMENode) root;
    List list = ome.getExperimenterList();
    ExperimenterNode node = null;
    for (int i=0; i<list.size(); i++) {
      OMEXMLNode o = (OMEXMLNode) list.get(i);
      if (o.getNodeID().equals(experimenterRef)) node = (ExperimenterNode) o;
    }
    if (node == null) {
      node = new ExperimenterNode(ome);
      node.setNodeID(experimenterRef);
    }
    ExperimenterRefNode ref = new ExperimenterRefNode(datasetNode);
    ref.setExperimenterNode(node);
  }

  /* @see loci.formats.meta.MetadataStore#setDatasetGroupRef(String, int) */
  public void setDatasetGroupRef(String groupRef, int datasetIndex) {
    if (groupRef == null) return;
    DatasetNode datasetNode = getDatasetNode(datasetIndex, true);
    OMENode ome = (OMENode) root;
    List list = ome.getGroupList();
    GroupNode node = null;
    for (int i=0; i<list.size(); i++) {
      OMEXMLNode o = (OMEXMLNode) list.get(i);
      if (o.getNodeID().equals(groupRef)) node = (GroupNode) o;
    }
    if (node == null) {
      node = new GroupNode(ome);
      node.setNodeID(groupRef);
    }
    GroupRefNode ref = new GroupRefNode(datasetNode);
    ref.setGroupNode(node);
  }

  /* @see loci.formats.meta.MetadataStore#setDatasetID(String, int) */
  public void setDatasetID(String id, int datasetIndex) {
    if (id == null) return;
    DatasetNode datasetNode = getDatasetNode(datasetIndex, true);
              datasetNode.setNodeID(id);
      }

  /* @see loci.formats.meta.MetadataStore#setDatasetLocked(Boolean, int) */
  public void setDatasetLocked(Boolean locked, int datasetIndex) {
    if (locked == null) return;
    DatasetNode datasetNode = getDatasetNode(datasetIndex, true);
              datasetNode.setLocked(locked);
      }

  /* @see loci.formats.meta.MetadataStore#setDatasetName(String, int) */
  public void setDatasetName(String name, int datasetIndex) {
    if (name == null) return;
    DatasetNode datasetNode = getDatasetNode(datasetIndex, true);
              datasetNode.setName(name);
      }

  // - DatasetRef property storage -

  /* @see loci.formats.meta.MetadataStore#setDatasetRefID(String, int, int) */
  public void setDatasetRefID(String id, int imageIndex, int datasetRefIndex) {
    // NB: ID unsupported for schema version 2003-FC
  }

  // - Detector property storage -

  /* @see loci.formats.meta.MetadataStore#setDetectorAmplificationGain(Float, int, int) */
  public void setDetectorAmplificationGain(Float amplificationGain, int instrumentIndex, int detectorIndex) {
    // NB: AmplificationGain unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setDetectorGain(Float, int, int) */
  public void setDetectorGain(Float gain, int instrumentIndex, int detectorIndex) {
    if (gain == null) return;
    DetectorNode detectorNode = getDetectorNode(instrumentIndex, detectorIndex, true);
              detectorNode.setGain(gain);
      }

  /* @see loci.formats.meta.MetadataStore#setDetectorID(String, int, int) */
  public void setDetectorID(String id, int instrumentIndex, int detectorIndex) {
    if (id == null) return;
    DetectorNode detectorNode = getDetectorNode(instrumentIndex, detectorIndex, true);
              detectorNode.setNodeID(id);
      }

  /* @see loci.formats.meta.MetadataStore#setDetectorManufacturer(String, int, int) */
  public void setDetectorManufacturer(String manufacturer, int instrumentIndex, int detectorIndex) {
    if (manufacturer == null) return;
    DetectorNode detectorNode = getDetectorNode(instrumentIndex, detectorIndex, true);
              detectorNode.setManufacturer(manufacturer);
      }

  /* @see loci.formats.meta.MetadataStore#setDetectorModel(String, int, int) */
  public void setDetectorModel(String model, int instrumentIndex, int detectorIndex) {
    if (model == null) return;
    DetectorNode detectorNode = getDetectorNode(instrumentIndex, detectorIndex, true);
              detectorNode.setModel(model);
      }

  /* @see loci.formats.meta.MetadataStore#setDetectorOffset(Float, int, int) */
  public void setDetectorOffset(Float offset, int instrumentIndex, int detectorIndex) {
    if (offset == null) return;
    DetectorNode detectorNode = getDetectorNode(instrumentIndex, detectorIndex, true);
              detectorNode.setOffset(offset);
      }

  /* @see loci.formats.meta.MetadataStore#setDetectorSerialNumber(String, int, int) */
  public void setDetectorSerialNumber(String serialNumber, int instrumentIndex, int detectorIndex) {
    if (serialNumber == null) return;
    DetectorNode detectorNode = getDetectorNode(instrumentIndex, detectorIndex, true);
              detectorNode.setSerialNumber(serialNumber);
      }

  /* @see loci.formats.meta.MetadataStore#setDetectorType(String, int, int) */
  public void setDetectorType(String type, int instrumentIndex, int detectorIndex) {
    if (type == null) return;
    DetectorNode detectorNode = getDetectorNode(instrumentIndex, detectorIndex, true);
            String[] enumeration = new String[] {"CCD", "Intensified-CCD", "Analog-Video", "PMT", "Photodiode", "Spectroscopy", "Life-time-Imaging", "Correlation-Spectroscopy", "FTIR"};
    if (enumeration.length > 0) {
      for (String v : enumeration) {
        if (v.equalsIgnoreCase(type)) {
          type = v;
          detectorNode.setType(type);
          return;
        }
      }
          }
    else
          detectorNode.setType(type);
      }

  /* @see loci.formats.meta.MetadataStore#setDetectorVoltage(Float, int, int) */
  public void setDetectorVoltage(Float voltage, int instrumentIndex, int detectorIndex) {
    if (voltage == null) return;
    DetectorNode detectorNode = getDetectorNode(instrumentIndex, detectorIndex, true);
              detectorNode.setVoltage(voltage);
      }

  /* @see loci.formats.meta.MetadataStore#setDetectorZoom(Float, int, int) */
  public void setDetectorZoom(Float zoom, int instrumentIndex, int detectorIndex) {
    // NB: Zoom unsupported for schema version 2003-FC
  }

  // - DetectorSettings property storage -

  /* @see loci.formats.meta.MetadataStore#setDetectorSettingsBinning(String, int, int) */
  public void setDetectorSettingsBinning(String binning, int imageIndex, int logicalChannelIndex) {
    // NB: Binning unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setDetectorSettingsDetector(String, int, int) */
  public void setDetectorSettingsDetector(String detector, int imageIndex, int logicalChannelIndex) {
    if (detector == null) return;
    DetectorRefNode detectorRefNode = getDetectorRefNode(imageIndex, logicalChannelIndex, true);
              detectorRefNode.setNodeID(detector);
      }

  /* @see loci.formats.meta.MetadataStore#setDetectorSettingsGain(Float, int, int) */
  public void setDetectorSettingsGain(Float gain, int imageIndex, int logicalChannelIndex) {
    if (gain == null) return;
    DetectorRefNode detectorRefNode = getDetectorRefNode(imageIndex, logicalChannelIndex, true);
              detectorRefNode.setGain(gain);
      }

  /* @see loci.formats.meta.MetadataStore#setDetectorSettingsOffset(Float, int, int) */
  public void setDetectorSettingsOffset(Float offset, int imageIndex, int logicalChannelIndex) {
    if (offset == null) return;
    DetectorRefNode detectorRefNode = getDetectorRefNode(imageIndex, logicalChannelIndex, true);
              detectorRefNode.setOffset(offset);
      }

  /* @see loci.formats.meta.MetadataStore#setDetectorSettingsReadOutRate(Float, int, int) */
  public void setDetectorSettingsReadOutRate(Float readOutRate, int imageIndex, int logicalChannelIndex) {
    // NB: ReadOutRate unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setDetectorSettingsVoltage(Float, int, int) */
  public void setDetectorSettingsVoltage(Float voltage, int imageIndex, int logicalChannelIndex) {
    // NB: Voltage unsupported for schema version 2003-FC
  }

  // - Dichroic property storage -

  /* @see loci.formats.meta.MetadataStore#setDichroicID(String, int, int) */
  public void setDichroicID(String id, int instrumentIndex, int dichroicIndex) {
    if (id == null) return;
    DichroicNode dichroicNode = getDichroicNode(instrumentIndex, dichroicIndex, true);
              dichroicNode.setNodeID(id);
      }

  /* @see loci.formats.meta.MetadataStore#setDichroicLotNumber(String, int, int) */
  public void setDichroicLotNumber(String lotNumber, int instrumentIndex, int dichroicIndex) {
    if (lotNumber == null) return;
    DichroicNode dichroicNode = getDichroicNode(instrumentIndex, dichroicIndex, true);
              dichroicNode.setLotNumber(lotNumber);
      }

  /* @see loci.formats.meta.MetadataStore#setDichroicManufacturer(String, int, int) */
  public void setDichroicManufacturer(String manufacturer, int instrumentIndex, int dichroicIndex) {
    if (manufacturer == null) return;
    DichroicNode dichroicNode = getDichroicNode(instrumentIndex, dichroicIndex, true);
              dichroicNode.setManufacturer(manufacturer);
      }

  /* @see loci.formats.meta.MetadataStore#setDichroicModel(String, int, int) */
  public void setDichroicModel(String model, int instrumentIndex, int dichroicIndex) {
    if (model == null) return;
    DichroicNode dichroicNode = getDichroicNode(instrumentIndex, dichroicIndex, true);
              dichroicNode.setModel(model);
      }

  // - Dimensions property storage -

  /* @see loci.formats.meta.MetadataStore#setDimensionsPhysicalSizeX(Float, int, int) */
  public void setDimensionsPhysicalSizeX(Float physicalSizeX, int imageIndex, int pixelsIndex) {
    if (physicalSizeX == null) return;
    ImageNode imageNode = getImageNode(imageIndex, true);
              imageNode.setPixelSizeX(physicalSizeX);
      }

  /* @see loci.formats.meta.MetadataStore#setDimensionsPhysicalSizeY(Float, int, int) */
  public void setDimensionsPhysicalSizeY(Float physicalSizeY, int imageIndex, int pixelsIndex) {
    if (physicalSizeY == null) return;
    ImageNode imageNode = getImageNode(imageIndex, true);
              imageNode.setPixelSizeY(physicalSizeY);
      }

  /* @see loci.formats.meta.MetadataStore#setDimensionsPhysicalSizeZ(Float, int, int) */
  public void setDimensionsPhysicalSizeZ(Float physicalSizeZ, int imageIndex, int pixelsIndex) {
    if (physicalSizeZ == null) return;
    ImageNode imageNode = getImageNode(imageIndex, true);
              imageNode.setPixelSizeZ(physicalSizeZ);
      }

  /* @see loci.formats.meta.MetadataStore#setDimensionsTimeIncrement(Float, int, int) */
  public void setDimensionsTimeIncrement(Float timeIncrement, int imageIndex, int pixelsIndex) {
    if (timeIncrement == null) return;
    ImageNode imageNode = getImageNode(imageIndex, true);
              imageNode.setTimeIncrement(timeIncrement);
      }

  /* @see loci.formats.meta.MetadataStore#setDimensionsWaveIncrement(Integer, int, int) */
  public void setDimensionsWaveIncrement(Integer waveIncrement, int imageIndex, int pixelsIndex) {
    if (waveIncrement == null) return;
    ImageNode imageNode = getImageNode(imageIndex, true);
              imageNode.setWaveIncrement(waveIncrement);
      }

  /* @see loci.formats.meta.MetadataStore#setDimensionsWaveStart(Integer, int, int) */
  public void setDimensionsWaveStart(Integer waveStart, int imageIndex, int pixelsIndex) {
    if (waveStart == null) return;
    ImageNode imageNode = getImageNode(imageIndex, true);
              imageNode.setWaveStart(waveStart);
      }

  // - DisplayOptions property storage -

  /* @see loci.formats.meta.MetadataStore#setDisplayOptionsDisplay(String, int) */
  public void setDisplayOptionsDisplay(String display, int imageIndex) {
    if (display == null) return;
    DisplayOptionsNode displayOptionsNode = getDisplayOptionsNode(imageIndex, true);
            String[] enumeration = new String[] {"RGB", "Grey"};
    if (enumeration.length > 0) {
      for (String v : enumeration) {
        if (v.equalsIgnoreCase(display)) {
          display = v;
          displayOptionsNode.setDisplay(display);
          return;
        }
      }
          }
    else
          displayOptionsNode.setDisplay(display);
      }

  /* @see loci.formats.meta.MetadataStore#setDisplayOptionsID(String, int) */
  public void setDisplayOptionsID(String id, int imageIndex) {
    if (id == null) return;
    DisplayOptionsNode displayOptionsNode = getDisplayOptionsNode(imageIndex, true);
              displayOptionsNode.setNodeID(id);
      }

  /* @see loci.formats.meta.MetadataStore#setDisplayOptionsZoom(Float, int) */
  public void setDisplayOptionsZoom(Float zoom, int imageIndex) {
    if (zoom == null) return;
    DisplayOptionsNode displayOptionsNode = getDisplayOptionsNode(imageIndex, true);
              displayOptionsNode.setZoom(zoom);
      }

  // - Ellipse property storage -

  /* @see loci.formats.meta.MetadataStore#setEllipseCx(String, int, int, int) */
  public void setEllipseCx(String cx, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: Cx unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setEllipseCy(String, int, int, int) */
  public void setEllipseCy(String cy, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: Cy unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setEllipseID(String, int, int, int) */
  public void setEllipseID(String id, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: ID unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setEllipseRx(String, int, int, int) */
  public void setEllipseRx(String rx, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: Rx unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setEllipseRy(String, int, int, int) */
  public void setEllipseRy(String ry, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: Ry unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setEllipseTransform(String, int, int, int) */
  public void setEllipseTransform(String transform, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: Transform unsupported for schema version 2003-FC
  }

  // - EmFilter property storage -

  /* @see loci.formats.meta.MetadataStore#setEmFilterLotNumber(String, int, int) */
  public void setEmFilterLotNumber(String lotNumber, int instrumentIndex, int filterIndex) {
    if (lotNumber == null) return;
    EmFilterNode emFilterNode = getEmFilterNode(instrumentIndex, filterIndex, true);
              emFilterNode.setLotNumber(lotNumber);
      }

  /* @see loci.formats.meta.MetadataStore#setEmFilterManufacturer(String, int, int) */
  public void setEmFilterManufacturer(String manufacturer, int instrumentIndex, int filterIndex) {
    if (manufacturer == null) return;
    EmFilterNode emFilterNode = getEmFilterNode(instrumentIndex, filterIndex, true);
              emFilterNode.setManufacturer(manufacturer);
      }

  /* @see loci.formats.meta.MetadataStore#setEmFilterModel(String, int, int) */
  public void setEmFilterModel(String model, int instrumentIndex, int filterIndex) {
    if (model == null) return;
    EmFilterNode emFilterNode = getEmFilterNode(instrumentIndex, filterIndex, true);
              emFilterNode.setModel(model);
      }

  /* @see loci.formats.meta.MetadataStore#setEmFilterType(String, int, int) */
  public void setEmFilterType(String type, int instrumentIndex, int filterIndex) {
    if (type == null) return;
    EmFilterNode emFilterNode = getEmFilterNode(instrumentIndex, filterIndex, true);
            String[] enumeration = new String[] {"LongPass", "ShortPass", "BandPass", "MultiPass"};
    if (enumeration.length > 0) {
      for (String v : enumeration) {
        if (v.equalsIgnoreCase(type)) {
          type = v;
          emFilterNode.setType(type);
          return;
        }
      }
          }
    else
          emFilterNode.setType(type);
      }

  // - ExFilter property storage -

  /* @see loci.formats.meta.MetadataStore#setExFilterLotNumber(String, int, int) */
  public void setExFilterLotNumber(String lotNumber, int instrumentIndex, int filterIndex) {
    if (lotNumber == null) return;
    ExFilterNode exFilterNode = getExFilterNode(instrumentIndex, filterIndex, true);
              exFilterNode.setLotNumber(lotNumber);
      }

  /* @see loci.formats.meta.MetadataStore#setExFilterManufacturer(String, int, int) */
  public void setExFilterManufacturer(String manufacturer, int instrumentIndex, int filterIndex) {
    if (manufacturer == null) return;
    ExFilterNode exFilterNode = getExFilterNode(instrumentIndex, filterIndex, true);
              exFilterNode.setManufacturer(manufacturer);
      }

  /* @see loci.formats.meta.MetadataStore#setExFilterModel(String, int, int) */
  public void setExFilterModel(String model, int instrumentIndex, int filterIndex) {
    if (model == null) return;
    ExFilterNode exFilterNode = getExFilterNode(instrumentIndex, filterIndex, true);
              exFilterNode.setModel(model);
      }

  /* @see loci.formats.meta.MetadataStore#setExFilterType(String, int, int) */
  public void setExFilterType(String type, int instrumentIndex, int filterIndex) {
    if (type == null) return;
    ExFilterNode exFilterNode = getExFilterNode(instrumentIndex, filterIndex, true);
            String[] enumeration = new String[] {"LongPass", "ShortPass", "BandPass", "MultiPass"};
    if (enumeration.length > 0) {
      for (String v : enumeration) {
        if (v.equalsIgnoreCase(type)) {
          type = v;
          exFilterNode.setType(type);
          return;
        }
      }
          }
    else
          exFilterNode.setType(type);
      }

  // - Experiment property storage -

  /* @see loci.formats.meta.MetadataStore#setExperimentDescription(String, int) */
  public void setExperimentDescription(String description, int experimentIndex) {
    if (description == null) return;
    ExperimentNode experimentNode = getExperimentNode(experimentIndex, true);
              experimentNode.setDescription(description);
      }

  /* @see loci.formats.meta.MetadataStore#setExperimentExperimenterRef(String, int) */
  public void setExperimentExperimenterRef(String experimenterRef, int experimentIndex) {
    if (experimenterRef == null) return;
    ExperimentNode experimentNode = getExperimentNode(experimentIndex, true);
    OMENode ome = (OMENode) root;
    List list = ome.getExperimenterList();
    ExperimenterNode node = null;
    for (int i=0; i<list.size(); i++) {
      OMEXMLNode o = (OMEXMLNode) list.get(i);
      if (o.getNodeID().equals(experimenterRef)) node = (ExperimenterNode) o;
    }
    if (node == null) {
      node = new ExperimenterNode(ome);
      node.setNodeID(experimenterRef);
    }
    ExperimenterRefNode ref = new ExperimenterRefNode(experimentNode);
    ref.setExperimenterNode(node);
  }

  /* @see loci.formats.meta.MetadataStore#setExperimentID(String, int) */
  public void setExperimentID(String id, int experimentIndex) {
    if (id == null) return;
    ExperimentNode experimentNode = getExperimentNode(experimentIndex, true);
              experimentNode.setNodeID(id);
      }

  /* @see loci.formats.meta.MetadataStore#setExperimentType(String, int) */
  public void setExperimentType(String type, int experimentIndex) {
    if (type == null) return;
    ExperimentNode experimentNode = getExperimentNode(experimentIndex, true);
            String[] enumeration = new String[] {"FP", "FRET", "Time-lapse", "4-D+", "Screen", "Immunocytochemistry", "Immunofluorescence", "FISH", "Electrophysiology", "Ion-Imaging", "Colocalization", "PGI/Documentation", "FRAP", "Photoablation", "Photoactivation", "Uncaging", "Optical-Trapping", "Fluorescence-Lifetime", "Spectral-Imaging", "Other"};
    if (enumeration.length > 0) {
      for (String v : enumeration) {
        if (v.equalsIgnoreCase(type)) {
          type = v;
          experimentNode.setType(type);
          return;
        }
      }
              experimentNode.setType("Other");
          }
    else
          experimentNode.setType(type);
      }

  // - Experimenter property storage -

  /* @see loci.formats.meta.MetadataStore#setExperimenterEmail(String, int) */
  public void setExperimenterEmail(String email, int experimenterIndex) {
    // NB: Email unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setExperimenterFirstName(String, int) */
  public void setExperimenterFirstName(String firstName, int experimenterIndex) {
    // NB: FirstName unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setExperimenterID(String, int) */
  public void setExperimenterID(String id, int experimenterIndex) {
    if (id == null) return;
    ExperimenterNode experimenterNode = getExperimenterNode(experimenterIndex, true);
              experimenterNode.setNodeID(id);
      }

  /* @see loci.formats.meta.MetadataStore#setExperimenterInstitution(String, int) */
  public void setExperimenterInstitution(String institution, int experimenterIndex) {
    // NB: Institution unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setExperimenterLastName(String, int) */
  public void setExperimenterLastName(String lastName, int experimenterIndex) {
    // NB: LastName unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setExperimenterOMEName(String, int) */
  public void setExperimenterOMEName(String omeName, int experimenterIndex) {
    // NB: OMEName unsupported for schema version 2003-FC
  }

  // - ExperimenterMembership property storage -

  /* @see loci.formats.meta.MetadataStore#setExperimenterMembershipGroup(String, int, int) */
  public void setExperimenterMembershipGroup(String group, int experimenterIndex, int groupRefIndex) {
    if (group == null) return;
    GroupRefNode groupRefNode = getGroupRefNode(experimenterIndex, groupRefIndex, true);
              groupRefNode.setNodeID(group);
      }

  // - Filament property storage -

  /* @see loci.formats.meta.MetadataStore#setFilamentType(String, int, int) */
  public void setFilamentType(String type, int instrumentIndex, int lightSourceIndex) {
    if (type == null) return;
    FilamentNode filamentNode = getFilamentNode(instrumentIndex, lightSourceIndex, true);
            String[] enumeration = new String[] {"Incandescent", "Halogen"};
    if (enumeration.length > 0) {
      for (String v : enumeration) {
        if (v.equalsIgnoreCase(type)) {
          type = v;
          filamentNode.setType(type);
          return;
        }
      }
          }
    else
          filamentNode.setType(type);
      }

  // - Filter property storage -

  /* @see loci.formats.meta.MetadataStore#setFilterFilterWheel(String, int, int) */
  public void setFilterFilterWheel(String filterWheel, int instrumentIndex, int filterIndex) {
    // NB: FilterWheel unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setFilterID(String, int, int) */
  public void setFilterID(String id, int instrumentIndex, int filterIndex) {
    if (id == null) return;
    FilterNode filterNode = getFilterNode(instrumentIndex, filterIndex, true);
              filterNode.setNodeID(id);
      }

  /* @see loci.formats.meta.MetadataStore#setFilterLotNumber(String, int, int) */
  public void setFilterLotNumber(String lotNumber, int instrumentIndex, int filterIndex) {
    // NB: LotNumber unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setFilterManufacturer(String, int, int) */
  public void setFilterManufacturer(String manufacturer, int instrumentIndex, int filterIndex) {
    // NB: Manufacturer unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setFilterModel(String, int, int) */
  public void setFilterModel(String model, int instrumentIndex, int filterIndex) {
    // NB: Model unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setFilterType(String, int, int) */
  public void setFilterType(String type, int instrumentIndex, int filterIndex) {
    // NB: Type unsupported for schema version 2003-FC
  }

  // - FilterSet property storage -

  /* @see loci.formats.meta.MetadataStore#setFilterSetDichroic(String, int, int) */
  public void setFilterSetDichroic(String dichroic, int instrumentIndex, int filterSetIndex) {
    // NB: Dichroic unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setFilterSetEmFilter(String, int, int) */
  public void setFilterSetEmFilter(String emFilter, int instrumentIndex, int filterSetIndex) {
    // NB: EmFilter unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setFilterSetExFilter(String, int, int) */
  public void setFilterSetExFilter(String exFilter, int instrumentIndex, int filterSetIndex) {
    // NB: ExFilter unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setFilterSetID(String, int, int) */
  public void setFilterSetID(String id, int instrumentIndex, int filterSetIndex) {
    if (id == null) return;
    FilterSetNode filterSetNode = getFilterSetNode(instrumentIndex, filterSetIndex, true);
              filterSetNode.setNodeID(id);
      }

  /* @see loci.formats.meta.MetadataStore#setFilterSetLotNumber(String, int, int) */
  public void setFilterSetLotNumber(String lotNumber, int instrumentIndex, int filterSetIndex) {
    if (lotNumber == null) return;
    FilterSetNode filterSetNode = getFilterSetNode(instrumentIndex, filterSetIndex, true);
              filterSetNode.setLotNumber(lotNumber);
      }

  /* @see loci.formats.meta.MetadataStore#setFilterSetManufacturer(String, int, int) */
  public void setFilterSetManufacturer(String manufacturer, int instrumentIndex, int filterSetIndex) {
    if (manufacturer == null) return;
    FilterSetNode filterSetNode = getFilterSetNode(instrumentIndex, filterSetIndex, true);
              filterSetNode.setManufacturer(manufacturer);
      }

  /* @see loci.formats.meta.MetadataStore#setFilterSetModel(String, int, int) */
  public void setFilterSetModel(String model, int instrumentIndex, int filterSetIndex) {
    if (model == null) return;
    FilterSetNode filterSetNode = getFilterSetNode(instrumentIndex, filterSetIndex, true);
              filterSetNode.setModel(model);
      }

  // - Group property storage -

  /* @see loci.formats.meta.MetadataStore#setGroupID(String, int) */
  public void setGroupID(String id, int groupIndex) {
    if (id == null) return;
    GroupNode groupNode = getGroupNode(groupIndex, true);
              groupNode.setNodeID(id);
      }

  /* @see loci.formats.meta.MetadataStore#setGroupName(String, int) */
  public void setGroupName(String name, int groupIndex) {
    if (name == null) return;
    GroupNode groupNode = getGroupNode(groupIndex, true);
              groupNode.setName(name);
      }

  // - GroupRef property storage -

  // - Image property storage -

  /* @see loci.formats.meta.MetadataStore#setImageAcquiredPixels(String, int) */
  public void setImageAcquiredPixels(String acquiredPixels, int imageIndex) {
    // NB: AcquiredPixels unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setImageCreationDate(String, int) */
  public void setImageCreationDate(String creationDate, int imageIndex) {
    if (creationDate == null) return;
    ImageNode imageNode = getImageNode(imageIndex, true);
              imageNode.setCreationDate(creationDate);
      }

  /* @see loci.formats.meta.MetadataStore#setImageDefaultPixels(String, int) */
  public void setImageDefaultPixels(String defaultPixels, int imageIndex) {
    if (defaultPixels == null) return;
    ImageNode imageNode = getImageNode(imageIndex, true);
              imageNode.setDefaultPixels(defaultPixels);
      }

  /* @see loci.formats.meta.MetadataStore#setImageDescription(String, int) */
  public void setImageDescription(String description, int imageIndex) {
    if (description == null) return;
    ImageNode imageNode = getImageNode(imageIndex, true);
              imageNode.setDescription(description);
      }

  /* @see loci.formats.meta.MetadataStore#setImageExperimentRef(String, int) */
  public void setImageExperimentRef(String experimentRef, int imageIndex) {
    if (experimentRef == null) return;
    ImageNode imageNode = getImageNode(imageIndex, true);
    OMENode ome = (OMENode) root;
    List list = ome.getExperimentList();
    ExperimentNode node = null;
    for (int i=0; i<list.size(); i++) {
      OMEXMLNode o = (OMEXMLNode) list.get(i);
      if (o.getNodeID().equals(experimentRef)) node = (ExperimentNode) o;
    }
    if (node == null) {
      node = new ExperimentNode(ome);
      node.setNodeID(experimentRef);
    }
    ExperimentRefNode ref = new ExperimentRefNode(imageNode);
    ref.setExperimentNode(node);
  }

  /* @see loci.formats.meta.MetadataStore#setImageExperimenterRef(String, int) */
  public void setImageExperimenterRef(String experimenterRef, int imageIndex) {
    if (experimenterRef == null) return;
    ImageNode imageNode = getImageNode(imageIndex, true);
    OMENode ome = (OMENode) root;
    List list = ome.getExperimenterList();
    ExperimenterNode node = null;
    for (int i=0; i<list.size(); i++) {
      OMEXMLNode o = (OMEXMLNode) list.get(i);
      if (o.getNodeID().equals(experimenterRef)) node = (ExperimenterNode) o;
    }
    if (node == null) {
      node = new ExperimenterNode(ome);
      node.setNodeID(experimenterRef);
    }
    ExperimenterRefNode ref = new ExperimenterRefNode(imageNode);
    ref.setExperimenterNode(node);
  }

  /* @see loci.formats.meta.MetadataStore#setImageGroupRef(String, int) */
  public void setImageGroupRef(String groupRef, int imageIndex) {
    if (groupRef == null) return;
    ImageNode imageNode = getImageNode(imageIndex, true);
    OMENode ome = (OMENode) root;
    List list = ome.getGroupList();
    GroupNode node = null;
    for (int i=0; i<list.size(); i++) {
      OMEXMLNode o = (OMEXMLNode) list.get(i);
      if (o.getNodeID().equals(groupRef)) node = (GroupNode) o;
    }
    if (node == null) {
      node = new GroupNode(ome);
      node.setNodeID(groupRef);
    }
    GroupRefNode ref = new GroupRefNode(imageNode);
    ref.setGroupNode(node);
  }

  /* @see loci.formats.meta.MetadataStore#setImageID(String, int) */
  public void setImageID(String id, int imageIndex) {
    if (id == null) return;
    ImageNode imageNode = getImageNode(imageIndex, true);
              imageNode.setNodeID(id);
      }

  /* @see loci.formats.meta.MetadataStore#setImageInstrumentRef(String, int) */
  public void setImageInstrumentRef(String instrumentRef, int imageIndex) {
    if (instrumentRef == null) return;
    ImageNode imageNode = getImageNode(imageIndex, true);
    OMENode ome = (OMENode) root;
    List list = ome.getInstrumentList();
    InstrumentNode node = null;
    for (int i=0; i<list.size(); i++) {
      OMEXMLNode o = (OMEXMLNode) list.get(i);
      if (o.getNodeID().equals(instrumentRef)) node = (InstrumentNode) o;
    }
    if (node == null) {
      node = new InstrumentNode(ome);
      node.setNodeID(instrumentRef);
    }
    InstrumentRefNode ref = new InstrumentRefNode(imageNode);
    ref.setInstrumentNode(node);
  }

  /* @see loci.formats.meta.MetadataStore#setImageName(String, int) */
  public void setImageName(String name, int imageIndex) {
    if (name == null) return;
    ImageNode imageNode = getImageNode(imageIndex, true);
              imageNode.setName(name);
      }

  // - ImagingEnvironment property storage -

  /* @see loci.formats.meta.MetadataStore#setImagingEnvironmentAirPressure(Float, int) */
  public void setImagingEnvironmentAirPressure(Float airPressure, int imageIndex) {
    if (airPressure == null) return;
    ImagingEnvironmentNode imagingEnvironmentNode = getImagingEnvironmentNode(imageIndex, true);
              imagingEnvironmentNode.setAirPressure(airPressure);
      }

  /* @see loci.formats.meta.MetadataStore#setImagingEnvironmentCO2Percent(Float, int) */
  public void setImagingEnvironmentCO2Percent(Float cO2Percent, int imageIndex) {
    if (cO2Percent == null) return;
    ImagingEnvironmentNode imagingEnvironmentNode = getImagingEnvironmentNode(imageIndex, true);
              imagingEnvironmentNode.setCO2Percent(cO2Percent);
      }

  /* @see loci.formats.meta.MetadataStore#setImagingEnvironmentHumidity(Float, int) */
  public void setImagingEnvironmentHumidity(Float humidity, int imageIndex) {
    if (humidity == null) return;
    ImagingEnvironmentNode imagingEnvironmentNode = getImagingEnvironmentNode(imageIndex, true);
              imagingEnvironmentNode.setHumidity(humidity);
      }

  /* @see loci.formats.meta.MetadataStore#setImagingEnvironmentTemperature(Float, int) */
  public void setImagingEnvironmentTemperature(Float temperature, int imageIndex) {
    if (temperature == null) return;
    ImagingEnvironmentNode imagingEnvironmentNode = getImagingEnvironmentNode(imageIndex, true);
              imagingEnvironmentNode.setTemperature(temperature);
      }

  // - Instrument property storage -

  /* @see loci.formats.meta.MetadataStore#setInstrumentID(String, int) */
  public void setInstrumentID(String id, int instrumentIndex) {
    if (id == null) return;
    InstrumentNode instrumentNode = getInstrumentNode(instrumentIndex, true);
              instrumentNode.setNodeID(id);
      }

  // - Laser property storage -

  /* @see loci.formats.meta.MetadataStore#setLaserFrequencyMultiplication(Integer, int, int) */
  public void setLaserFrequencyMultiplication(Integer frequencyMultiplication, int instrumentIndex, int lightSourceIndex) {
    if (frequencyMultiplication == null) return;
    LaserNode laserNode = getLaserNode(instrumentIndex, lightSourceIndex, true);
              laserNode.setFrequencyDoubled(integerToBoolean(frequencyMultiplication));
      }

  /* @see loci.formats.meta.MetadataStore#setLaserLaserMedium(String, int, int) */
  public void setLaserLaserMedium(String laserMedium, int instrumentIndex, int lightSourceIndex) {
    if (laserMedium == null) return;
    LaserNode laserNode = getLaserNode(instrumentIndex, lightSourceIndex, true);
            String[] enumeration = new String[] {"Cu", "Ag", "ArFl", "ArCl", "KrFl", "KrCl", "XeFl", "XeCl", "XeBr", "Nitrogen", "Argon", "Krypton", "Xenon", "HeNe", "HeCd", "CO", "CO2", "H2O", "HFl", "Nd-Glass", "Nd-YAG", "Er-Glass", "Er-YAG", "Ho-YLF", "Ho-YAG", "Ruby", "Ti-Sapphire", "Alexandrite", "Rhodamine-6G", "Coumarin-C30", "GaAs", "GaAlAs", "e-"};
    if (enumeration.length > 0) {
      for (String v : enumeration) {
        if (v.equalsIgnoreCase(laserMedium)) {
          laserMedium = v;
          laserNode.setMedium(laserMedium);
          return;
        }
      }
          }
    else
          laserNode.setMedium(laserMedium);
      }

  /* @see loci.formats.meta.MetadataStore#setLaserPockelCell(Boolean, int, int) */
  public void setLaserPockelCell(Boolean pockelCell, int instrumentIndex, int lightSourceIndex) {
    // NB: PockelCell unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setLaserPulse(String, int, int) */
  public void setLaserPulse(String pulse, int instrumentIndex, int lightSourceIndex) {
    if (pulse == null) return;
    LaserNode laserNode = getLaserNode(instrumentIndex, lightSourceIndex, true);
            String[] enumeration = new String[] {"CW", "Single", "Q-Switched", "Repetitive", "Mode-Locked"};
    if (enumeration.length > 0) {
      for (String v : enumeration) {
        if (v.equalsIgnoreCase(pulse)) {
          pulse = v;
          laserNode.setPulse(pulse);
          return;
        }
      }
          }
    else
          laserNode.setPulse(pulse);
      }

  /* @see loci.formats.meta.MetadataStore#setLaserRepetitionRate(Boolean, int, int) */
  public void setLaserRepetitionRate(Boolean repetitionRate, int instrumentIndex, int lightSourceIndex) {
    // NB: RepetitionRate unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setLaserTuneable(Boolean, int, int) */
  public void setLaserTuneable(Boolean tuneable, int instrumentIndex, int lightSourceIndex) {
    if (tuneable == null) return;
    LaserNode laserNode = getLaserNode(instrumentIndex, lightSourceIndex, true);
              laserNode.setTunable(tuneable);
      }

  /* @see loci.formats.meta.MetadataStore#setLaserType(String, int, int) */
  public void setLaserType(String type, int instrumentIndex, int lightSourceIndex) {
    if (type == null) return;
    LaserNode laserNode = getLaserNode(instrumentIndex, lightSourceIndex, true);
            String[] enumeration = new String[] {"Excimer", "Gas", "Metal Vapor", "Solid State", "Dye", "Semiconductor", "Free Electron"};
    if (enumeration.length > 0) {
      for (String v : enumeration) {
        if (v.equalsIgnoreCase(type)) {
          type = v;
          laserNode.setType(type);
          return;
        }
      }
          }
    else
          laserNode.setType(type);
      }

  /* @see loci.formats.meta.MetadataStore#setLaserWavelength(Integer, int, int) */
  public void setLaserWavelength(Integer wavelength, int instrumentIndex, int lightSourceIndex) {
    if (wavelength == null) return;
    LaserNode laserNode = getLaserNode(instrumentIndex, lightSourceIndex, true);
              laserNode.setWavelength(wavelength);
      }

  // - LightSource property storage -

  /* @see loci.formats.meta.MetadataStore#setLightSourceID(String, int, int) */
  public void setLightSourceID(String id, int instrumentIndex, int lightSourceIndex) {
    if (id == null) return;
    LightSourceNode lightSourceNode = getLightSourceNode(instrumentIndex, lightSourceIndex, true);
              lightSourceNode.setNodeID(id);
      }

  /* @see loci.formats.meta.MetadataStore#setLightSourceManufacturer(String, int, int) */
  public void setLightSourceManufacturer(String manufacturer, int instrumentIndex, int lightSourceIndex) {
    if (manufacturer == null) return;
    LightSourceNode lightSourceNode = getLightSourceNode(instrumentIndex, lightSourceIndex, true);
              lightSourceNode.setManufacturer(manufacturer);
      }

  /* @see loci.formats.meta.MetadataStore#setLightSourceModel(String, int, int) */
  public void setLightSourceModel(String model, int instrumentIndex, int lightSourceIndex) {
    if (model == null) return;
    LightSourceNode lightSourceNode = getLightSourceNode(instrumentIndex, lightSourceIndex, true);
              lightSourceNode.setModel(model);
      }

  /* @see loci.formats.meta.MetadataStore#setLightSourcePower(Float, int, int) */
  public void setLightSourcePower(Float power, int instrumentIndex, int lightSourceIndex) {
    // NB: Power unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setLightSourceSerialNumber(String, int, int) */
  public void setLightSourceSerialNumber(String serialNumber, int instrumentIndex, int lightSourceIndex) {
    if (serialNumber == null) return;
    LightSourceNode lightSourceNode = getLightSourceNode(instrumentIndex, lightSourceIndex, true);
              lightSourceNode.setSerialNumber(serialNumber);
      }

  // - LightSourceRef property storage -

  /* @see loci.formats.meta.MetadataStore#setLightSourceRefAttenuation(Float, int, int, int) */
  public void setLightSourceRefAttenuation(Float attenuation, int imageIndex, int microbeamManipulationIndex, int lightSourceRefIndex) {
    // NB: Attenuation unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setLightSourceRefLightSource(String, int, int, int) */
  public void setLightSourceRefLightSource(String lightSource, int imageIndex, int microbeamManipulationIndex, int lightSourceRefIndex) {
    // NB: LightSource unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setLightSourceRefWavelength(Integer, int, int, int) */
  public void setLightSourceRefWavelength(Integer wavelength, int imageIndex, int microbeamManipulationIndex, int lightSourceRefIndex) {
    // NB: Wavelength unsupported for schema version 2003-FC
  }

  // - LightSourceSettings property storage -

  /* @see loci.formats.meta.MetadataStore#setLightSourceSettingsAttenuation(Float, int, int) */
  public void setLightSourceSettingsAttenuation(Float attenuation, int imageIndex, int logicalChannelIndex) {
    if (attenuation == null) return;
    LightSourceRefNode lightSourceRefNode = getLightSourceRefNode(imageIndex, logicalChannelIndex, true);
              lightSourceRefNode.setAttenuation(attenuation);
      }

  /* @see loci.formats.meta.MetadataStore#setLightSourceSettingsLightSource(String, int, int) */
  public void setLightSourceSettingsLightSource(String lightSource, int imageIndex, int logicalChannelIndex) {
    if (lightSource == null) return;
    LightSourceRefNode lightSourceRefNode = getLightSourceRefNode(imageIndex, logicalChannelIndex, true);
              lightSourceRefNode.setNodeID(lightSource);
      }

  /* @see loci.formats.meta.MetadataStore#setLightSourceSettingsWavelength(Integer, int, int) */
  public void setLightSourceSettingsWavelength(Integer wavelength, int imageIndex, int logicalChannelIndex) {
    if (wavelength == null) return;
    LightSourceRefNode lightSourceRefNode = getLightSourceRefNode(imageIndex, logicalChannelIndex, true);
              lightSourceRefNode.setWavelength(wavelength);
      }

  // - Line property storage -

  /* @see loci.formats.meta.MetadataStore#setLineID(String, int, int, int) */
  public void setLineID(String id, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: ID unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setLineTransform(String, int, int, int) */
  public void setLineTransform(String transform, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: Transform unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setLineX1(String, int, int, int) */
  public void setLineX1(String x1, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: X1 unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setLineX2(String, int, int, int) */
  public void setLineX2(String x2, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: X2 unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setLineY1(String, int, int, int) */
  public void setLineY1(String y1, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: Y1 unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setLineY2(String, int, int, int) */
  public void setLineY2(String y2, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: Y2 unsupported for schema version 2003-FC
  }

  // - LogicalChannel property storage -

  /* @see loci.formats.meta.MetadataStore#setLogicalChannelContrastMethod(String, int, int) */
  public void setLogicalChannelContrastMethod(String contrastMethod, int imageIndex, int logicalChannelIndex) {
    if (contrastMethod == null) return;
    ChannelInfoNode channelInfoNode = getChannelInfoNode(imageIndex, logicalChannelIndex, true);
            String[] enumeration = new String[] {"Brightfield", "Phase", "DIC", "Hoffman Modultion", "Oblique Illumination", "Polarized Light", "Darkfield", "Fluorescence"};
    if (enumeration.length > 0) {
      for (String v : enumeration) {
        if (v.equalsIgnoreCase(contrastMethod)) {
          contrastMethod = v;
          channelInfoNode.setContrastMethod(contrastMethod);
          return;
        }
      }
          }
    else
          channelInfoNode.setContrastMethod(contrastMethod);
      }

  /* @see loci.formats.meta.MetadataStore#setLogicalChannelDetector(String, int, int) */
  public void setLogicalChannelDetector(String detector, int imageIndex, int logicalChannelIndex) {
    if (detector == null) return;
    DetectorRefNode detectorRefNode = getDetectorRefNode(imageIndex, logicalChannelIndex, true);
              detectorRefNode.setNodeID(detector);
      }

  /* @see loci.formats.meta.MetadataStore#setLogicalChannelEmWave(Integer, int, int) */
  public void setLogicalChannelEmWave(Integer emWave, int imageIndex, int logicalChannelIndex) {
    if (emWave == null) return;
    ChannelInfoNode channelInfoNode = getChannelInfoNode(imageIndex, logicalChannelIndex, true);
              channelInfoNode.setEmWave(emWave);
      }

  /* @see loci.formats.meta.MetadataStore#setLogicalChannelExWave(Integer, int, int) */
  public void setLogicalChannelExWave(Integer exWave, int imageIndex, int logicalChannelIndex) {
    if (exWave == null) return;
    ChannelInfoNode channelInfoNode = getChannelInfoNode(imageIndex, logicalChannelIndex, true);
              channelInfoNode.setExWave(exWave);
      }

  /* @see loci.formats.meta.MetadataStore#setLogicalChannelFilterSet(String, int, int) */
  public void setLogicalChannelFilterSet(String filterSet, int imageIndex, int logicalChannelIndex) {
    // NB: FilterSet unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setLogicalChannelFluor(String, int, int) */
  public void setLogicalChannelFluor(String fluor, int imageIndex, int logicalChannelIndex) {
    if (fluor == null) return;
    ChannelInfoNode channelInfoNode = getChannelInfoNode(imageIndex, logicalChannelIndex, true);
              channelInfoNode.setFluor(fluor);
      }

  /* @see loci.formats.meta.MetadataStore#setLogicalChannelID(String, int, int) */
  public void setLogicalChannelID(String id, int imageIndex, int logicalChannelIndex) {
    if (id == null) return;
    ChannelInfoNode channelInfoNode = getChannelInfoNode(imageIndex, logicalChannelIndex, true);
              channelInfoNode.setNodeID(id);
      }

  /* @see loci.formats.meta.MetadataStore#setLogicalChannelIlluminationType(String, int, int) */
  public void setLogicalChannelIlluminationType(String illuminationType, int imageIndex, int logicalChannelIndex) {
    if (illuminationType == null) return;
    ChannelInfoNode channelInfoNode = getChannelInfoNode(imageIndex, logicalChannelIndex, true);
            String[] enumeration = new String[] {"Transmitted", "Epifluorescence", "Oblique"};
    if (enumeration.length > 0) {
      for (String v : enumeration) {
        if (v.equalsIgnoreCase(illuminationType)) {
          illuminationType = v;
          channelInfoNode.setIlluminationType(illuminationType);
          return;
        }
      }
          }
    else
          channelInfoNode.setIlluminationType(illuminationType);
      }

  /* @see loci.formats.meta.MetadataStore#setLogicalChannelLightSource(String, int, int) */
  public void setLogicalChannelLightSource(String lightSource, int imageIndex, int logicalChannelIndex) {
    if (lightSource == null) return;
    LightSourceRefNode lightSourceRefNode = getLightSourceRefNode(imageIndex, logicalChannelIndex, true);
              lightSourceRefNode.setNodeID(lightSource);
      }

  /* @see loci.formats.meta.MetadataStore#setLogicalChannelMode(String, int, int) */
  public void setLogicalChannelMode(String mode, int imageIndex, int logicalChannelIndex) {
    if (mode == null) return;
    ChannelInfoNode channelInfoNode = getChannelInfoNode(imageIndex, logicalChannelIndex, true);
            String[] enumeration = new String[] {"Wide-field", "Laser Scanning Microscopy", "Laser Scanning Confocal", "Slit Scan Confocal", "Multi-Photon Microscopy", "Structured Illumination", "Single Molecule Imaging", "Total Internal Reflection", "Fluorescence-Lifetime", "Spectral Imaging", "Fluorescence Correlation Spectroscopy", "Near Field Scanning Optical Microscopy", "Second Harmonic Generation Imaging"};
    if (enumeration.length > 0) {
      for (String v : enumeration) {
        if (v.equalsIgnoreCase(mode)) {
          mode = v;
          channelInfoNode.setMode(mode);
          return;
        }
      }
              channelInfoNode.setMode("Other");
          }
    else
          channelInfoNode.setMode(mode);
      }

  /* @see loci.formats.meta.MetadataStore#setLogicalChannelName(String, int, int) */
  public void setLogicalChannelName(String name, int imageIndex, int logicalChannelIndex) {
    if (name == null) return;
    ChannelInfoNode channelInfoNode = getChannelInfoNode(imageIndex, logicalChannelIndex, true);
              channelInfoNode.setName(name);
      }

  /* @see loci.formats.meta.MetadataStore#setLogicalChannelNdFilter(Float, int, int) */
  public void setLogicalChannelNdFilter(Float ndFilter, int imageIndex, int logicalChannelIndex) {
    if (ndFilter == null) return;
    ChannelInfoNode channelInfoNode = getChannelInfoNode(imageIndex, logicalChannelIndex, true);
              channelInfoNode.setNDfilter(ndFilter);
      }

  /* @see loci.formats.meta.MetadataStore#setLogicalChannelOTF(String, int, int) */
  public void setLogicalChannelOTF(String otf, int imageIndex, int logicalChannelIndex) {
    if (otf == null) return;
    OTFRefNode otfRefNode = getOTFRefNode(imageIndex, logicalChannelIndex, true);
              otfRefNode.setNodeID(otf);
      }

  /* @see loci.formats.meta.MetadataStore#setLogicalChannelPhotometricInterpretation(String, int, int) */
  public void setLogicalChannelPhotometricInterpretation(String photometricInterpretation, int imageIndex, int logicalChannelIndex) {
    if (photometricInterpretation == null) return;
    ChannelInfoNode channelInfoNode = getChannelInfoNode(imageIndex, logicalChannelIndex, true);
            String[] enumeration = new String[] {"monochrome", "RGB", "ARGB", "CMYK", "HSV"};
    if (enumeration.length > 0) {
      for (String v : enumeration) {
        if (v.equalsIgnoreCase(photometricInterpretation)) {
          photometricInterpretation = v;
          channelInfoNode.setPhotometricInterpretation(photometricInterpretation);
          return;
        }
      }
          }
    else
          channelInfoNode.setPhotometricInterpretation(photometricInterpretation);
      }

  /* @see loci.formats.meta.MetadataStore#setLogicalChannelPinholeSize(Float, int, int) */
  public void setLogicalChannelPinholeSize(Float pinholeSize, int imageIndex, int logicalChannelIndex) {
    if (pinholeSize == null) return;
    ChannelInfoNode channelInfoNode = getChannelInfoNode(imageIndex, logicalChannelIndex, true);
              channelInfoNode.setPinholeSize(floatToInteger(pinholeSize));
      }

  /* @see loci.formats.meta.MetadataStore#setLogicalChannelPockelCellSetting(Integer, int, int) */
  public void setLogicalChannelPockelCellSetting(Integer pockelCellSetting, int imageIndex, int logicalChannelIndex) {
    // NB: PockelCellSetting unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setLogicalChannelSamplesPerPixel(Integer, int, int) */
  public void setLogicalChannelSamplesPerPixel(Integer samplesPerPixel, int imageIndex, int logicalChannelIndex) {
    if (samplesPerPixel == null) return;
    ChannelInfoNode channelInfoNode = getChannelInfoNode(imageIndex, logicalChannelIndex, true);
              channelInfoNode.setSamplesPerPixel(samplesPerPixel);
      }

  /* @see loci.formats.meta.MetadataStore#setLogicalChannelSecondaryEmissionFilter(String, int, int) */
  public void setLogicalChannelSecondaryEmissionFilter(String secondaryEmissionFilter, int imageIndex, int logicalChannelIndex) {
    // NB: SecondaryEmissionFilter unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setLogicalChannelSecondaryExcitationFilter(String, int, int) */
  public void setLogicalChannelSecondaryExcitationFilter(String secondaryExcitationFilter, int imageIndex, int logicalChannelIndex) {
    // NB: SecondaryExcitationFilter unsupported for schema version 2003-FC
  }

  // - Mask property storage -

  /* @see loci.formats.meta.MetadataStore#setMaskHeight(String, int, int, int) */
  public void setMaskHeight(String height, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: Height unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setMaskID(String, int, int, int) */
  public void setMaskID(String id, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: ID unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setMaskTransform(String, int, int, int) */
  public void setMaskTransform(String transform, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: Transform unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setMaskWidth(String, int, int, int) */
  public void setMaskWidth(String width, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: Width unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setMaskX(String, int, int, int) */
  public void setMaskX(String x, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: X unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setMaskY(String, int, int, int) */
  public void setMaskY(String y, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: Y unsupported for schema version 2003-FC
  }

  // - MaskPixels property storage -

  /* @see loci.formats.meta.MetadataStore#setMaskPixelsBigEndian(Boolean, int, int, int) */
  public void setMaskPixelsBigEndian(Boolean bigEndian, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: BigEndian unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setMaskPixelsBinData(byte[], int, int, int) */
  public void setMaskPixelsBinData(byte[] binData, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: BinData unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setMaskPixelsExtendedPixelType(String, int, int, int) */
  public void setMaskPixelsExtendedPixelType(String extendedPixelType, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: ExtendedPixelType unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setMaskPixelsID(String, int, int, int) */
  public void setMaskPixelsID(String id, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: ID unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setMaskPixelsSizeX(Integer, int, int, int) */
  public void setMaskPixelsSizeX(Integer sizeX, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: SizeX unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setMaskPixelsSizeY(Integer, int, int, int) */
  public void setMaskPixelsSizeY(Integer sizeY, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: SizeY unsupported for schema version 2003-FC
  }

  // - MicrobeamManipulation property storage -

  /* @see loci.formats.meta.MetadataStore#setMicrobeamManipulationExperimenterRef(String, int, int) */
  public void setMicrobeamManipulationExperimenterRef(String experimenterRef, int imageIndex, int microbeamManipulationIndex) {
    // NB: ExperimenterRef unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setMicrobeamManipulationID(String, int, int) */
  public void setMicrobeamManipulationID(String id, int imageIndex, int microbeamManipulationIndex) {
    // NB: ID unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setMicrobeamManipulationType(String, int, int) */
  public void setMicrobeamManipulationType(String type, int imageIndex, int microbeamManipulationIndex) {
    // NB: Type unsupported for schema version 2003-FC
  }

  // - MicrobeamManipulationRef property storage -

  /* @see loci.formats.meta.MetadataStore#setMicrobeamManipulationRefID(String, int, int) */
  public void setMicrobeamManipulationRefID(String id, int experimentIndex, int microbeamManipulationRefIndex) {
    // NB: ID unsupported for schema version 2003-FC
  }

  // - Microscope property storage -

  /* @see loci.formats.meta.MetadataStore#setMicroscopeID(String, int) */
  public void setMicroscopeID(String id, int instrumentIndex) {
    if (id == null) return;
    MicroscopeNode microscopeNode = getMicroscopeNode(instrumentIndex, true);
              microscopeNode.setNodeID(id);
      }

  /* @see loci.formats.meta.MetadataStore#setMicroscopeManufacturer(String, int) */
  public void setMicroscopeManufacturer(String manufacturer, int instrumentIndex) {
    if (manufacturer == null) return;
    MicroscopeNode microscopeNode = getMicroscopeNode(instrumentIndex, true);
              microscopeNode.setManufacturer(manufacturer);
      }

  /* @see loci.formats.meta.MetadataStore#setMicroscopeModel(String, int) */
  public void setMicroscopeModel(String model, int instrumentIndex) {
    if (model == null) return;
    MicroscopeNode microscopeNode = getMicroscopeNode(instrumentIndex, true);
              microscopeNode.setModel(model);
      }

  /* @see loci.formats.meta.MetadataStore#setMicroscopeSerialNumber(String, int) */
  public void setMicroscopeSerialNumber(String serialNumber, int instrumentIndex) {
    if (serialNumber == null) return;
    MicroscopeNode microscopeNode = getMicroscopeNode(instrumentIndex, true);
              microscopeNode.setSerialNumber(serialNumber);
      }

  /* @see loci.formats.meta.MetadataStore#setMicroscopeType(String, int) */
  public void setMicroscopeType(String type, int instrumentIndex) {
    if (type == null) return;
    MicroscopeNode microscopeNode = getMicroscopeNode(instrumentIndex, true);
            String[] enumeration = new String[] {"Upright", "Inverted", "Dissection", "Electrophysiology"};
    if (enumeration.length > 0) {
      for (String v : enumeration) {
        if (v.equalsIgnoreCase(type)) {
          type = v;
          microscopeNode.setType(type);
          return;
        }
      }
          }
    else
          microscopeNode.setType(type);
      }

  // - OTF property storage -

  /* @see loci.formats.meta.MetadataStore#setOTFBinaryFile(String, int, int) */
  public void setOTFBinaryFile(String binaryFile, int instrumentIndex, int otfIndex) {
    if (binaryFile == null) return;
    OTFNode otfNode = getOTFNode(instrumentIndex, otfIndex, true);
              otfNode.setBinaryFile(binaryFile);
      }

  /* @see loci.formats.meta.MetadataStore#setOTFID(String, int, int) */
  public void setOTFID(String id, int instrumentIndex, int otfIndex) {
    if (id == null) return;
    OTFNode otfNode = getOTFNode(instrumentIndex, otfIndex, true);
              otfNode.setNodeID(id);
      }

  /* @see loci.formats.meta.MetadataStore#setOTFObjective(String, int, int) */
  public void setOTFObjective(String objective, int instrumentIndex, int otfIndex) {
    if (objective == null) return;
    ObjectiveRefNode objectiveRefNode = getObjectiveRefNode(instrumentIndex, otfIndex, true);
              objectiveRefNode.setNodeID(objective);
      }

  /* @see loci.formats.meta.MetadataStore#setOTFOpticalAxisAveraged(Boolean, int, int) */
  public void setOTFOpticalAxisAveraged(Boolean opticalAxisAveraged, int instrumentIndex, int otfIndex) {
    if (opticalAxisAveraged == null) return;
    OTFNode otfNode = getOTFNode(instrumentIndex, otfIndex, true);
              otfNode.setOpticalAxisAvrg(opticalAxisAveraged);
      }

  /* @see loci.formats.meta.MetadataStore#setOTFPixelType(String, int, int) */
  public void setOTFPixelType(String pixelType, int instrumentIndex, int otfIndex) {
    if (pixelType == null) return;
    OTFNode otfNode = getOTFNode(instrumentIndex, otfIndex, true);
            String[] enumeration = new String[] {"bit", "int8", "int16", "int32", "Uint8", "Uint16", "Uint32", "float", "double", "complex", "double-complex"};
    if (enumeration.length > 0) {
      for (String v : enumeration) {
        if (v.equalsIgnoreCase(pixelType)) {
          pixelType = v;
          otfNode.setPixelType(pixelType);
          return;
        }
      }
          }
    else
          otfNode.setPixelType(pixelType);
      }

  /* @see loci.formats.meta.MetadataStore#setOTFSizeX(Integer, int, int) */
  public void setOTFSizeX(Integer sizeX, int instrumentIndex, int otfIndex) {
    if (sizeX == null) return;
    OTFNode otfNode = getOTFNode(instrumentIndex, otfIndex, true);
              otfNode.setSizeX(sizeX);
      }

  /* @see loci.formats.meta.MetadataStore#setOTFSizeY(Integer, int, int) */
  public void setOTFSizeY(Integer sizeY, int instrumentIndex, int otfIndex) {
    if (sizeY == null) return;
    OTFNode otfNode = getOTFNode(instrumentIndex, otfIndex, true);
              otfNode.setSizeY(sizeY);
      }

  // - Objective property storage -

  /* @see loci.formats.meta.MetadataStore#setObjectiveCalibratedMagnification(Float, int, int) */
  public void setObjectiveCalibratedMagnification(Float calibratedMagnification, int instrumentIndex, int objectiveIndex) {
    if (calibratedMagnification == null) return;
    ObjectiveNode objectiveNode = getObjectiveNode(instrumentIndex, objectiveIndex, true);
              objectiveNode.setMagnification(calibratedMagnification);
      }

  /* @see loci.formats.meta.MetadataStore#setObjectiveCorrection(String, int, int) */
  public void setObjectiveCorrection(String correction, int instrumentIndex, int objectiveIndex) {
    // NB: Correction unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setObjectiveID(String, int, int) */
  public void setObjectiveID(String id, int instrumentIndex, int objectiveIndex) {
    if (id == null) return;
    ObjectiveNode objectiveNode = getObjectiveNode(instrumentIndex, objectiveIndex, true);
              objectiveNode.setNodeID(id);
      }

  /* @see loci.formats.meta.MetadataStore#setObjectiveImmersion(String, int, int) */
  public void setObjectiveImmersion(String immersion, int instrumentIndex, int objectiveIndex) {
    // NB: Immersion unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setObjectiveIris(Boolean, int, int) */
  public void setObjectiveIris(Boolean iris, int instrumentIndex, int objectiveIndex) {
    // NB: Iris unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setObjectiveLensNA(Float, int, int) */
  public void setObjectiveLensNA(Float lensNA, int instrumentIndex, int objectiveIndex) {
    if (lensNA == null) return;
    ObjectiveNode objectiveNode = getObjectiveNode(instrumentIndex, objectiveIndex, true);
              objectiveNode.setLensNA(lensNA);
      }

  /* @see loci.formats.meta.MetadataStore#setObjectiveManufacturer(String, int, int) */
  public void setObjectiveManufacturer(String manufacturer, int instrumentIndex, int objectiveIndex) {
    if (manufacturer == null) return;
    ObjectiveNode objectiveNode = getObjectiveNode(instrumentIndex, objectiveIndex, true);
              objectiveNode.setManufacturer(manufacturer);
      }

  /* @see loci.formats.meta.MetadataStore#setObjectiveModel(String, int, int) */
  public void setObjectiveModel(String model, int instrumentIndex, int objectiveIndex) {
    if (model == null) return;
    ObjectiveNode objectiveNode = getObjectiveNode(instrumentIndex, objectiveIndex, true);
              objectiveNode.setModel(model);
      }

  /* @see loci.formats.meta.MetadataStore#setObjectiveNominalMagnification(Integer, int, int) */
  public void setObjectiveNominalMagnification(Integer nominalMagnification, int instrumentIndex, int objectiveIndex) {
    // NB: NominalMagnification unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setObjectiveSerialNumber(String, int, int) */
  public void setObjectiveSerialNumber(String serialNumber, int instrumentIndex, int objectiveIndex) {
    if (serialNumber == null) return;
    ObjectiveNode objectiveNode = getObjectiveNode(instrumentIndex, objectiveIndex, true);
              objectiveNode.setSerialNumber(serialNumber);
      }

  /* @see loci.formats.meta.MetadataStore#setObjectiveWorkingDistance(Float, int, int) */
  public void setObjectiveWorkingDistance(Float workingDistance, int instrumentIndex, int objectiveIndex) {
    // NB: WorkingDistance unsupported for schema version 2003-FC
  }

  // - ObjectiveSettings property storage -

  /* @see loci.formats.meta.MetadataStore#setObjectiveSettingsCorrectionCollar(Float, int) */
  public void setObjectiveSettingsCorrectionCollar(Float correctionCollar, int imageIndex) {
    // NB: CorrectionCollar unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setObjectiveSettingsMedium(String, int) */
  public void setObjectiveSettingsMedium(String medium, int imageIndex) {
    // NB: Medium unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setObjectiveSettingsObjective(String, int) */
  public void setObjectiveSettingsObjective(String objective, int imageIndex) {
    if (objective == null) return;
    ObjectiveRefNode objectiveRefNode = getObjectiveRefNode(imageIndex, true);
              objectiveRefNode.setNodeID(objective);
      }

  /* @see loci.formats.meta.MetadataStore#setObjectiveSettingsRefractiveIndex(Float, int) */
  public void setObjectiveSettingsRefractiveIndex(Float refractiveIndex, int imageIndex) {
    // NB: RefractiveIndex unsupported for schema version 2003-FC
  }

  // - Path property storage -

  /* @see loci.formats.meta.MetadataStore#setPathD(String, int, int, int) */
  public void setPathD(String d, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: D unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setPathID(String, int, int, int) */
  public void setPathID(String id, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: ID unsupported for schema version 2003-FC
  }

  // - Pixels property storage -

  /* @see loci.formats.meta.MetadataStore#setPixelsBigEndian(Boolean, int, int) */
  public void setPixelsBigEndian(Boolean bigEndian, int imageIndex, int pixelsIndex) {
    if (bigEndian == null) return;
    PixelsNode pixelsNode = getPixelsNode(imageIndex, pixelsIndex, true);
              pixelsNode.setBigEndian(bigEndian);
      }

  /* @see loci.formats.meta.MetadataStore#setPixelsDimensionOrder(String, int, int) */
  public void setPixelsDimensionOrder(String dimensionOrder, int imageIndex, int pixelsIndex) {
    if (dimensionOrder == null) return;
    PixelsNode pixelsNode = getPixelsNode(imageIndex, pixelsIndex, true);
            String[] enumeration = new String[] {"XYZCT", "XYZTC", "XYCTZ", "XYCZT", "XYTCZ", "XYTZC"};
    if (enumeration.length > 0) {
      for (String v : enumeration) {
        if (v.equalsIgnoreCase(dimensionOrder)) {
          dimensionOrder = v;
          pixelsNode.setDimensionOrder(dimensionOrder);
          return;
        }
      }
          }
    else
          pixelsNode.setDimensionOrder(dimensionOrder);
      }

  /* @see loci.formats.meta.MetadataStore#setPixelsID(String, int, int) */
  public void setPixelsID(String id, int imageIndex, int pixelsIndex) {
    if (id == null) return;
    PixelsNode pixelsNode = getPixelsNode(imageIndex, pixelsIndex, true);
              pixelsNode.setNodeID(id);
      }

  /* @see loci.formats.meta.MetadataStore#setPixelsPixelType(String, int, int) */
  public void setPixelsPixelType(String pixelType, int imageIndex, int pixelsIndex) {
    if (pixelType == null) return;
    PixelsNode pixelsNode = getPixelsNode(imageIndex, pixelsIndex, true);
            String[] enumeration = new String[] {"int8", "int16", "int32", "Uint8", "Uint16", "Uint32", "float"};
    if (enumeration.length > 0) {
      for (String v : enumeration) {
        if (v.equalsIgnoreCase(pixelType)) {
          pixelType = v;
          pixelsNode.setPixelType(pixelType);
          return;
        }
      }
          }
    else
          pixelsNode.setPixelType(pixelType);
      }

  /* @see loci.formats.meta.MetadataStore#setPixelsSizeC(Integer, int, int) */
  public void setPixelsSizeC(Integer sizeC, int imageIndex, int pixelsIndex) {
    if (sizeC == null) return;
    PixelsNode pixelsNode = getPixelsNode(imageIndex, pixelsIndex, true);
              pixelsNode.setSizeC(sizeC);
      }

  /* @see loci.formats.meta.MetadataStore#setPixelsSizeT(Integer, int, int) */
  public void setPixelsSizeT(Integer sizeT, int imageIndex, int pixelsIndex) {
    if (sizeT == null) return;
    PixelsNode pixelsNode = getPixelsNode(imageIndex, pixelsIndex, true);
              pixelsNode.setSizeT(sizeT);
      }

  /* @see loci.formats.meta.MetadataStore#setPixelsSizeX(Integer, int, int) */
  public void setPixelsSizeX(Integer sizeX, int imageIndex, int pixelsIndex) {
    if (sizeX == null) return;
    PixelsNode pixelsNode = getPixelsNode(imageIndex, pixelsIndex, true);
              pixelsNode.setSizeX(sizeX);
      }

  /* @see loci.formats.meta.MetadataStore#setPixelsSizeY(Integer, int, int) */
  public void setPixelsSizeY(Integer sizeY, int imageIndex, int pixelsIndex) {
    if (sizeY == null) return;
    PixelsNode pixelsNode = getPixelsNode(imageIndex, pixelsIndex, true);
              pixelsNode.setSizeY(sizeY);
      }

  /* @see loci.formats.meta.MetadataStore#setPixelsSizeZ(Integer, int, int) */
  public void setPixelsSizeZ(Integer sizeZ, int imageIndex, int pixelsIndex) {
    if (sizeZ == null) return;
    PixelsNode pixelsNode = getPixelsNode(imageIndex, pixelsIndex, true);
              pixelsNode.setSizeZ(sizeZ);
      }

  // - Plane property storage -

  /* @see loci.formats.meta.MetadataStore#setPlaneHashSHA1(String, int, int, int) */
  public void setPlaneHashSHA1(String hashSHA1, int imageIndex, int pixelsIndex, int planeIndex) {
    // NB: HashSHA1 unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setPlaneID(String, int, int, int) */
  public void setPlaneID(String id, int imageIndex, int pixelsIndex, int planeIndex) {
    // NB: ID unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setPlaneTheC(Integer, int, int, int) */
  public void setPlaneTheC(Integer theC, int imageIndex, int pixelsIndex, int planeIndex) {
    // NB: TheC unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setPlaneTheT(Integer, int, int, int) */
  public void setPlaneTheT(Integer theT, int imageIndex, int pixelsIndex, int planeIndex) {
    // NB: TheT unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setPlaneTheZ(Integer, int, int, int) */
  public void setPlaneTheZ(Integer theZ, int imageIndex, int pixelsIndex, int planeIndex) {
    // NB: TheZ unsupported for schema version 2003-FC
  }

  // - PlaneTiming property storage -

  /* @see loci.formats.meta.MetadataStore#setPlaneTimingDeltaT(Float, int, int, int) */
  public void setPlaneTimingDeltaT(Float deltaT, int imageIndex, int pixelsIndex, int planeIndex) {
    // NB: DeltaT unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setPlaneTimingExposureTime(Float, int, int, int) */
  public void setPlaneTimingExposureTime(Float exposureTime, int imageIndex, int pixelsIndex, int planeIndex) {
    // NB: ExposureTime unsupported for schema version 2003-FC
  }

  // - Plate property storage -

  /* @see loci.formats.meta.MetadataStore#setPlateColumnNamingConvention(String, int) */
  public void setPlateColumnNamingConvention(String columnNamingConvention, int plateIndex) {
    // NB: ColumnNamingConvention unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setPlateDescription(String, int) */
  public void setPlateDescription(String description, int plateIndex) {
    // NB: Description unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setPlateExternalIdentifier(String, int) */
  public void setPlateExternalIdentifier(String externalIdentifier, int plateIndex) {
    if (externalIdentifier == null) return;
    PlateNode plateNode = getPlateNode(plateIndex, true);
              plateNode.setExternRef(externalIdentifier);
      }

  /* @see loci.formats.meta.MetadataStore#setPlateID(String, int) */
  public void setPlateID(String id, int plateIndex) {
    if (id == null) return;
    PlateNode plateNode = getPlateNode(plateIndex, true);
              plateNode.setNodeID(id);
      }

  /* @see loci.formats.meta.MetadataStore#setPlateName(String, int) */
  public void setPlateName(String name, int plateIndex) {
    if (name == null) return;
    PlateNode plateNode = getPlateNode(plateIndex, true);
              plateNode.setName(name);
      }

  /* @see loci.formats.meta.MetadataStore#setPlateRowNamingConvention(String, int) */
  public void setPlateRowNamingConvention(String rowNamingConvention, int plateIndex) {
    // NB: RowNamingConvention unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setPlateStatus(String, int) */
  public void setPlateStatus(String status, int plateIndex) {
    // NB: Status unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setPlateWellOriginX(Double, int) */
  public void setPlateWellOriginX(Double wellOriginX, int plateIndex) {
    // NB: WellOriginX unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setPlateWellOriginY(Double, int) */
  public void setPlateWellOriginY(Double wellOriginY, int plateIndex) {
    // NB: WellOriginY unsupported for schema version 2003-FC
  }

  // - PlateRef property storage -

  /* @see loci.formats.meta.MetadataStore#setPlateRefID(String, int, int) */
  public void setPlateRefID(String id, int screenIndex, int plateRefIndex) {
    if (id == null) return;
    PlateRefNode plateRefNode = getPlateRefNode(screenIndex, true);
              plateRefNode.setNodeID(id);
      }

  /* @see loci.formats.meta.MetadataStore#setPlateRefSample(Integer, int, int) */
  public void setPlateRefSample(Integer sample, int screenIndex, int plateRefIndex) {
    if (sample == null) return;
    PlateRefNode plateRefNode = getPlateRefNode(screenIndex, true);
              plateRefNode.setSample(sample);
      }

  /* @see loci.formats.meta.MetadataStore#setPlateRefWell(String, int, int) */
  public void setPlateRefWell(String well, int screenIndex, int plateRefIndex) {
    if (well == null) return;
    PlateRefNode plateRefNode = getPlateRefNode(screenIndex, true);
              plateRefNode.setWell(well);
      }

  // - Point property storage -

  /* @see loci.formats.meta.MetadataStore#setPointCx(String, int, int, int) */
  public void setPointCx(String cx, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: Cx unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setPointCy(String, int, int, int) */
  public void setPointCy(String cy, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: Cy unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setPointID(String, int, int, int) */
  public void setPointID(String id, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: ID unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setPointR(String, int, int, int) */
  public void setPointR(String r, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: R unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setPointTransform(String, int, int, int) */
  public void setPointTransform(String transform, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: Transform unsupported for schema version 2003-FC
  }

  // - Polygon property storage -

  /* @see loci.formats.meta.MetadataStore#setPolygonID(String, int, int, int) */
  public void setPolygonID(String id, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: ID unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setPolygonPoints(String, int, int, int) */
  public void setPolygonPoints(String points, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: Points unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setPolygonTransform(String, int, int, int) */
  public void setPolygonTransform(String transform, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: Transform unsupported for schema version 2003-FC
  }

  // - Polyline property storage -

  /* @see loci.formats.meta.MetadataStore#setPolylineID(String, int, int, int) */
  public void setPolylineID(String id, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: ID unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setPolylinePoints(String, int, int, int) */
  public void setPolylinePoints(String points, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: Points unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setPolylineTransform(String, int, int, int) */
  public void setPolylineTransform(String transform, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: Transform unsupported for schema version 2003-FC
  }

  // - Project property storage -

  /* @see loci.formats.meta.MetadataStore#setProjectDescription(String, int) */
  public void setProjectDescription(String description, int projectIndex) {
    if (description == null) return;
    ProjectNode projectNode = getProjectNode(projectIndex, true);
              projectNode.setDescription(description);
      }

  /* @see loci.formats.meta.MetadataStore#setProjectExperimenterRef(String, int) */
  public void setProjectExperimenterRef(String experimenterRef, int projectIndex) {
    if (experimenterRef == null) return;
    ProjectNode projectNode = getProjectNode(projectIndex, true);
    OMENode ome = (OMENode) root;
    List list = ome.getExperimenterList();
    ExperimenterNode node = null;
    for (int i=0; i<list.size(); i++) {
      OMEXMLNode o = (OMEXMLNode) list.get(i);
      if (o.getNodeID().equals(experimenterRef)) node = (ExperimenterNode) o;
    }
    if (node == null) {
      node = new ExperimenterNode(ome);
      node.setNodeID(experimenterRef);
    }
    ExperimenterRefNode ref = new ExperimenterRefNode(projectNode);
    ref.setExperimenterNode(node);
  }

  /* @see loci.formats.meta.MetadataStore#setProjectGroupRef(String, int) */
  public void setProjectGroupRef(String groupRef, int projectIndex) {
    if (groupRef == null) return;
    ProjectNode projectNode = getProjectNode(projectIndex, true);
    OMENode ome = (OMENode) root;
    List list = ome.getGroupList();
    GroupNode node = null;
    for (int i=0; i<list.size(); i++) {
      OMEXMLNode o = (OMEXMLNode) list.get(i);
      if (o.getNodeID().equals(groupRef)) node = (GroupNode) o;
    }
    if (node == null) {
      node = new GroupNode(ome);
      node.setNodeID(groupRef);
    }
    GroupRefNode ref = new GroupRefNode(projectNode);
    ref.setGroupNode(node);
  }

  /* @see loci.formats.meta.MetadataStore#setProjectID(String, int) */
  public void setProjectID(String id, int projectIndex) {
    if (id == null) return;
    ProjectNode projectNode = getProjectNode(projectIndex, true);
              projectNode.setNodeID(id);
      }

  /* @see loci.formats.meta.MetadataStore#setProjectName(String, int) */
  public void setProjectName(String name, int projectIndex) {
    if (name == null) return;
    ProjectNode projectNode = getProjectNode(projectIndex, true);
              projectNode.setName(name);
      }

  // - ProjectRef property storage -

  /* @see loci.formats.meta.MetadataStore#setProjectRefID(String, int, int) */
  public void setProjectRefID(String id, int datasetIndex, int projectRefIndex) {
    if (id == null) return;
    ProjectRefNode projectRefNode = getProjectRefNode(datasetIndex, projectRefIndex, true);
              projectRefNode.setNodeID(id);
      }

  // - Pump property storage -

  /* @see loci.formats.meta.MetadataStore#setPumpLightSource(String, int, int) */
  public void setPumpLightSource(String lightSource, int instrumentIndex, int lightSourceIndex) {
    if (lightSource == null) return;
    PumpNode pumpNode = getPumpNode(instrumentIndex, lightSourceIndex, true);
              pumpNode.setNodeID(lightSource);
      }

  // - ROI property storage -

  /* @see loci.formats.meta.MetadataStore#setROIID(String, int, int) */
  public void setROIID(String id, int imageIndex, int roiIndex) {
    if (id == null) return;
    ROINode roiNode = getROINode(imageIndex, roiIndex, true);
              roiNode.setNodeID(id);
      }

  /* @see loci.formats.meta.MetadataStore#setROIT0(Integer, int, int) */
  public void setROIT0(Integer t0, int imageIndex, int roiIndex) {
    if (t0 == null) return;
    ROINode roiNode = getROINode(imageIndex, roiIndex, true);
              roiNode.setT0(t0);
      }

  /* @see loci.formats.meta.MetadataStore#setROIT1(Integer, int, int) */
  public void setROIT1(Integer t1, int imageIndex, int roiIndex) {
    if (t1 == null) return;
    ROINode roiNode = getROINode(imageIndex, roiIndex, true);
              roiNode.setT1(t1);
      }

  /* @see loci.formats.meta.MetadataStore#setROIX0(Integer, int, int) */
  public void setROIX0(Integer x0, int imageIndex, int roiIndex) {
    if (x0 == null) return;
    ROINode roiNode = getROINode(imageIndex, roiIndex, true);
              roiNode.setX0(x0);
      }

  /* @see loci.formats.meta.MetadataStore#setROIX1(Integer, int, int) */
  public void setROIX1(Integer x1, int imageIndex, int roiIndex) {
    if (x1 == null) return;
    ROINode roiNode = getROINode(imageIndex, roiIndex, true);
              roiNode.setX1(x1);
      }

  /* @see loci.formats.meta.MetadataStore#setROIY0(Integer, int, int) */
  public void setROIY0(Integer y0, int imageIndex, int roiIndex) {
    if (y0 == null) return;
    ROINode roiNode = getROINode(imageIndex, roiIndex, true);
              roiNode.setY0(y0);
      }

  /* @see loci.formats.meta.MetadataStore#setROIY1(Integer, int, int) */
  public void setROIY1(Integer y1, int imageIndex, int roiIndex) {
    if (y1 == null) return;
    ROINode roiNode = getROINode(imageIndex, roiIndex, true);
              roiNode.setY1(y1);
      }

  /* @see loci.formats.meta.MetadataStore#setROIZ0(Integer, int, int) */
  public void setROIZ0(Integer z0, int imageIndex, int roiIndex) {
    if (z0 == null) return;
    ROINode roiNode = getROINode(imageIndex, roiIndex, true);
              roiNode.setZ0(z0);
      }

  /* @see loci.formats.meta.MetadataStore#setROIZ1(Integer, int, int) */
  public void setROIZ1(Integer z1, int imageIndex, int roiIndex) {
    if (z1 == null) return;
    ROINode roiNode = getROINode(imageIndex, roiIndex, true);
              roiNode.setZ1(z1);
      }

  // - ROIRef property storage -

  /* @see loci.formats.meta.MetadataStore#setROIRefID(String, int, int, int) */
  public void setROIRefID(String id, int imageIndex, int microbeamManipulationIndex, int roiRefIndex) {
    // NB: ID unsupported for schema version 2003-FC
  }

  // - Reagent property storage -

  /* @see loci.formats.meta.MetadataStore#setReagentDescription(String, int, int) */
  public void setReagentDescription(String description, int screenIndex, int reagentIndex) {
    // NB: Description unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setReagentID(String, int, int) */
  public void setReagentID(String id, int screenIndex, int reagentIndex) {
    // NB: ID unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setReagentName(String, int, int) */
  public void setReagentName(String name, int screenIndex, int reagentIndex) {
    // NB: Name unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setReagentReagentIdentifier(String, int, int) */
  public void setReagentReagentIdentifier(String reagentIdentifier, int screenIndex, int reagentIndex) {
    // NB: ReagentIdentifier unsupported for schema version 2003-FC
  }

  // - Rect property storage -

  /* @see loci.formats.meta.MetadataStore#setRectHeight(String, int, int, int) */
  public void setRectHeight(String height, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: Height unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setRectID(String, int, int, int) */
  public void setRectID(String id, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: ID unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setRectTransform(String, int, int, int) */
  public void setRectTransform(String transform, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: Transform unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setRectWidth(String, int, int, int) */
  public void setRectWidth(String width, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: Width unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setRectX(String, int, int, int) */
  public void setRectX(String x, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: X unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setRectY(String, int, int, int) */
  public void setRectY(String y, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: Y unsupported for schema version 2003-FC
  }

  // - Region property storage -

  /* @see loci.formats.meta.MetadataStore#setRegionID(String, int, int) */
  public void setRegionID(String id, int imageIndex, int regionIndex) {
    // NB: ID unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setRegionName(String, int, int) */
  public void setRegionName(String name, int imageIndex, int regionIndex) {
    // NB: Name unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setRegionTag(String, int, int) */
  public void setRegionTag(String tag, int imageIndex, int regionIndex) {
    // NB: Tag unsupported for schema version 2003-FC
  }

  // - RoiLink property storage -

  /* @see loci.formats.meta.MetadataStore#setRoiLinkDirection(String, int, int, int) */
  public void setRoiLinkDirection(String direction, int imageIndex, int roiIndex, int roiLinkIndex) {
    // NB: Direction unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setRoiLinkName(String, int, int, int) */
  public void setRoiLinkName(String name, int imageIndex, int roiIndex, int roiLinkIndex) {
    // NB: Name unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setRoiLinkRef(String, int, int, int) */
  public void setRoiLinkRef(String ref, int imageIndex, int roiIndex, int roiLinkIndex) {
    // NB: Ref unsupported for schema version 2003-FC
  }

  // - Screen property storage -

  /* @see loci.formats.meta.MetadataStore#setScreenDescription(String, int) */
  public void setScreenDescription(String description, int screenIndex) {
    if (description == null) return;
    ScreenNode screenNode = getScreenNode(screenIndex, true);
              screenNode.setDescription(description);
      }

  /* @see loci.formats.meta.MetadataStore#setScreenExtern(String, int) */
  public void setScreenExtern(String extern, int screenIndex) {
    if (extern == null) return;
    ScreenNode screenNode = getScreenNode(screenIndex, true);
              screenNode.setExternRef(extern);
      }

  /* @see loci.formats.meta.MetadataStore#setScreenID(String, int) */
  public void setScreenID(String id, int screenIndex) {
    if (id == null) return;
    ScreenNode screenNode = getScreenNode(screenIndex, true);
              screenNode.setNodeID(id);
      }

  /* @see loci.formats.meta.MetadataStore#setScreenName(String, int) */
  public void setScreenName(String name, int screenIndex) {
    if (name == null) return;
    ScreenNode screenNode = getScreenNode(screenIndex, true);
              screenNode.setName(name);
      }

  /* @see loci.formats.meta.MetadataStore#setScreenProtocolDescription(String, int) */
  public void setScreenProtocolDescription(String protocolDescription, int screenIndex) {
    // NB: ProtocolDescription unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setScreenProtocolIdentifier(String, int) */
  public void setScreenProtocolIdentifier(String protocolIdentifier, int screenIndex) {
    // NB: ProtocolIdentifier unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setScreenReagentSetDescription(String, int) */
  public void setScreenReagentSetDescription(String reagentSetDescription, int screenIndex) {
    // NB: ReagentSetDescription unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setScreenReagentSetIdentifier(String, int) */
  public void setScreenReagentSetIdentifier(String reagentSetIdentifier, int screenIndex) {
    // NB: ReagentSetIdentifier unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setScreenType(String, int) */
  public void setScreenType(String type, int screenIndex) {
    // NB: Type unsupported for schema version 2003-FC
  }

  // - ScreenAcquisition property storage -

  /* @see loci.formats.meta.MetadataStore#setScreenAcquisitionEndTime(String, int, int) */
  public void setScreenAcquisitionEndTime(String endTime, int screenIndex, int screenAcquisitionIndex) {
    // NB: EndTime unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setScreenAcquisitionID(String, int, int) */
  public void setScreenAcquisitionID(String id, int screenIndex, int screenAcquisitionIndex) {
    // NB: ID unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setScreenAcquisitionStartTime(String, int, int) */
  public void setScreenAcquisitionStartTime(String startTime, int screenIndex, int screenAcquisitionIndex) {
    // NB: StartTime unsupported for schema version 2003-FC
  }

  // - ScreenRef property storage -

  /* @see loci.formats.meta.MetadataStore#setScreenRefID(String, int, int) */
  public void setScreenRefID(String id, int plateIndex, int screenRefIndex) {
    if (id == null) return;
    ScreenRefNode screenRefNode = getScreenRefNode(plateIndex, screenRefIndex, true);
              screenRefNode.setNodeID(id);
      }

  // - Shape property storage -

  /* @see loci.formats.meta.MetadataStore#setShapeBaselineShift(String, int, int, int) */
  public void setShapeBaselineShift(String baselineShift, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: BaselineShift unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setShapeDirection(String, int, int, int) */
  public void setShapeDirection(String direction, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: Direction unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setShapeFillColor(String, int, int, int) */
  public void setShapeFillColor(String fillColor, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: FillColor unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setShapeFillOpacity(String, int, int, int) */
  public void setShapeFillOpacity(String fillOpacity, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: FillOpacity unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setShapeFillRule(String, int, int, int) */
  public void setShapeFillRule(String fillRule, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: FillRule unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setShapeFontFamily(String, int, int, int) */
  public void setShapeFontFamily(String fontFamily, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: FontFamily unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setShapeFontSize(Integer, int, int, int) */
  public void setShapeFontSize(Integer fontSize, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: FontSize unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setShapeFontStretch(String, int, int, int) */
  public void setShapeFontStretch(String fontStretch, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: FontStretch unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setShapeFontStyle(String, int, int, int) */
  public void setShapeFontStyle(String fontStyle, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: FontStyle unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setShapeFontVariant(String, int, int, int) */
  public void setShapeFontVariant(String fontVariant, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: FontVariant unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setShapeFontWeight(String, int, int, int) */
  public void setShapeFontWeight(String fontWeight, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: FontWeight unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setShapeG(String, int, int, int) */
  public void setShapeG(String g, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: G unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setShapeGlyphOrientationVertical(Integer, int, int, int) */
  public void setShapeGlyphOrientationVertical(Integer glyphOrientationVertical, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: GlyphOrientationVertical unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setShapeID(String, int, int, int) */
  public void setShapeID(String id, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: ID unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setShapeLocked(Boolean, int, int, int) */
  public void setShapeLocked(Boolean locked, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: Locked unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setShapeStrokeAttribute(String, int, int, int) */
  public void setShapeStrokeAttribute(String strokeAttribute, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: StrokeAttribute unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setShapeStrokeColor(String, int, int, int) */
  public void setShapeStrokeColor(String strokeColor, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: StrokeColor unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setShapeStrokeDashArray(String, int, int, int) */
  public void setShapeStrokeDashArray(String strokeDashArray, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: StrokeDashArray unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setShapeStrokeLineCap(String, int, int, int) */
  public void setShapeStrokeLineCap(String strokeLineCap, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: StrokeLineCap unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setShapeStrokeLineJoin(String, int, int, int) */
  public void setShapeStrokeLineJoin(String strokeLineJoin, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: StrokeLineJoin unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setShapeStrokeMiterLimit(Integer, int, int, int) */
  public void setShapeStrokeMiterLimit(Integer strokeMiterLimit, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: StrokeMiterLimit unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setShapeStrokeOpacity(Float, int, int, int) */
  public void setShapeStrokeOpacity(Float strokeOpacity, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: StrokeOpacity unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setShapeStrokeWidth(Integer, int, int, int) */
  public void setShapeStrokeWidth(Integer strokeWidth, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: StrokeWidth unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setShapeText(String, int, int, int) */
  public void setShapeText(String text, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: Text unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setShapeTextAnchor(String, int, int, int) */
  public void setShapeTextAnchor(String textAnchor, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: TextAnchor unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setShapeTextDecoration(String, int, int, int) */
  public void setShapeTextDecoration(String textDecoration, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: TextDecoration unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setShapeTextFill(String, int, int, int) */
  public void setShapeTextFill(String textFill, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: TextFill unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setShapeTextStroke(String, int, int, int) */
  public void setShapeTextStroke(String textStroke, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: TextStroke unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setShapeTheT(Integer, int, int, int) */
  public void setShapeTheT(Integer theT, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: TheT unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setShapeTheZ(Integer, int, int, int) */
  public void setShapeTheZ(Integer theZ, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: TheZ unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setShapeVectorEffect(String, int, int, int) */
  public void setShapeVectorEffect(String vectorEffect, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: VectorEffect unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setShapeVisibility(Boolean, int, int, int) */
  public void setShapeVisibility(Boolean visibility, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: Visibility unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setShapeWritingMode(String, int, int, int) */
  public void setShapeWritingMode(String writingMode, int imageIndex, int roiIndex, int shapeIndex) {
    // NB: WritingMode unsupported for schema version 2003-FC
  }

  // - StageLabel property storage -

  /* @see loci.formats.meta.MetadataStore#setStageLabelName(String, int) */
  public void setStageLabelName(String name, int imageIndex) {
    if (name == null) return;
    StageLabelNode stageLabelNode = getStageLabelNode(imageIndex, true);
              stageLabelNode.setName(name);
      }

  /* @see loci.formats.meta.MetadataStore#setStageLabelX(Float, int) */
  public void setStageLabelX(Float x, int imageIndex) {
    if (x == null) return;
    StageLabelNode stageLabelNode = getStageLabelNode(imageIndex, true);
              stageLabelNode.setX(x);
      }

  /* @see loci.formats.meta.MetadataStore#setStageLabelY(Float, int) */
  public void setStageLabelY(Float y, int imageIndex) {
    if (y == null) return;
    StageLabelNode stageLabelNode = getStageLabelNode(imageIndex, true);
              stageLabelNode.setY(y);
      }

  /* @see loci.formats.meta.MetadataStore#setStageLabelZ(Float, int) */
  public void setStageLabelZ(Float z, int imageIndex) {
    if (z == null) return;
    StageLabelNode stageLabelNode = getStageLabelNode(imageIndex, true);
              stageLabelNode.setZ(z);
      }

  // - StagePosition property storage -

  /* @see loci.formats.meta.MetadataStore#setStagePositionPositionX(Float, int, int, int) */
  public void setStagePositionPositionX(Float positionX, int imageIndex, int pixelsIndex, int planeIndex) {
    // NB: PositionX unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setStagePositionPositionY(Float, int, int, int) */
  public void setStagePositionPositionY(Float positionY, int imageIndex, int pixelsIndex, int planeIndex) {
    // NB: PositionY unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setStagePositionPositionZ(Float, int, int, int) */
  public void setStagePositionPositionZ(Float positionZ, int imageIndex, int pixelsIndex, int planeIndex) {
    // NB: PositionZ unsupported for schema version 2003-FC
  }

  // - Thumbnail property storage -

  /* @see loci.formats.meta.MetadataStore#setThumbnailHref(String, int) */
  public void setThumbnailHref(String href, int imageIndex) {
    if (href == null) return;
    ThumbnailNode thumbnailNode = getThumbnailNode(imageIndex, true);
              thumbnailNode.sethref(href);
      }

  /* @see loci.formats.meta.MetadataStore#setThumbnailID(String, int) */
  public void setThumbnailID(String id, int imageIndex) {
    if (id == null) return;
    ThumbnailNode thumbnailNode = getThumbnailNode(imageIndex, true);
              thumbnailNode.setNodeID(id);
      }

  /* @see loci.formats.meta.MetadataStore#setThumbnailMIMEtype(String, int) */
  public void setThumbnailMIMEtype(String mimEtype, int imageIndex) {
    if (mimEtype == null) return;
    ThumbnailNode thumbnailNode = getThumbnailNode(imageIndex, true);
              thumbnailNode.setMIMEtype(mimEtype);
      }

  // - TiffData property storage -

  /* @see loci.formats.meta.MetadataStore#setTiffDataFileName(String, int, int, int) */
  public void setTiffDataFileName(String fileName, int imageIndex, int pixelsIndex, int tiffDataIndex) {
    // NB: FileName unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setTiffDataFirstC(Integer, int, int, int) */
  public void setTiffDataFirstC(Integer firstC, int imageIndex, int pixelsIndex, int tiffDataIndex) {
    if (firstC == null) return;
    TiffDataNode tiffDataNode = getTiffDataNode(imageIndex, pixelsIndex, tiffDataIndex, true);
              tiffDataNode.setFirstC(firstC);
      }

  /* @see loci.formats.meta.MetadataStore#setTiffDataFirstT(Integer, int, int, int) */
  public void setTiffDataFirstT(Integer firstT, int imageIndex, int pixelsIndex, int tiffDataIndex) {
    if (firstT == null) return;
    TiffDataNode tiffDataNode = getTiffDataNode(imageIndex, pixelsIndex, tiffDataIndex, true);
              tiffDataNode.setFirstT(firstT);
      }

  /* @see loci.formats.meta.MetadataStore#setTiffDataFirstZ(Integer, int, int, int) */
  public void setTiffDataFirstZ(Integer firstZ, int imageIndex, int pixelsIndex, int tiffDataIndex) {
    if (firstZ == null) return;
    TiffDataNode tiffDataNode = getTiffDataNode(imageIndex, pixelsIndex, tiffDataIndex, true);
              tiffDataNode.setFirstZ(firstZ);
      }

  /* @see loci.formats.meta.MetadataStore#setTiffDataIFD(Integer, int, int, int) */
  public void setTiffDataIFD(Integer ifd, int imageIndex, int pixelsIndex, int tiffDataIndex) {
    if (ifd == null) return;
    TiffDataNode tiffDataNode = getTiffDataNode(imageIndex, pixelsIndex, tiffDataIndex, true);
              tiffDataNode.setIFD(ifd);
      }

  /* @see loci.formats.meta.MetadataStore#setTiffDataNumPlanes(Integer, int, int, int) */
  public void setTiffDataNumPlanes(Integer numPlanes, int imageIndex, int pixelsIndex, int tiffDataIndex) {
    if (numPlanes == null) return;
    TiffDataNode tiffDataNode = getTiffDataNode(imageIndex, pixelsIndex, tiffDataIndex, true);
              tiffDataNode.setNumPlanes(numPlanes);
      }

  /* @see loci.formats.meta.MetadataStore#setTiffDataUUID(String, int, int, int) */
  public void setTiffDataUUID(String uuid, int imageIndex, int pixelsIndex, int tiffDataIndex) {
    // NB: UUID unsupported for schema version 2003-FC
  }

  // - TransmittanceRange property storage -

  /* @see loci.formats.meta.MetadataStore#setTransmittanceRangeCutIn(Integer, int, int) */
  public void setTransmittanceRangeCutIn(Integer cutIn, int instrumentIndex, int filterIndex) {
    // NB: CutIn unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setTransmittanceRangeCutInTolerance(Integer, int, int) */
  public void setTransmittanceRangeCutInTolerance(Integer cutInTolerance, int instrumentIndex, int filterIndex) {
    // NB: CutInTolerance unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setTransmittanceRangeCutOut(Integer, int, int) */
  public void setTransmittanceRangeCutOut(Integer cutOut, int instrumentIndex, int filterIndex) {
    // NB: CutOut unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setTransmittanceRangeCutOutTolerance(Integer, int, int) */
  public void setTransmittanceRangeCutOutTolerance(Integer cutOutTolerance, int instrumentIndex, int filterIndex) {
    // NB: CutOutTolerance unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setTransmittanceRangeTransmittance(Integer, int, int) */
  public void setTransmittanceRangeTransmittance(Integer transmittance, int instrumentIndex, int filterIndex) {
    // NB: Transmittance unsupported for schema version 2003-FC
  }

  // - Well property storage -

  /* @see loci.formats.meta.MetadataStore#setWellColumn(Integer, int, int) */
  public void setWellColumn(Integer column, int plateIndex, int wellIndex) {
    // NB: Column unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setWellExternalDescription(String, int, int) */
  public void setWellExternalDescription(String externalDescription, int plateIndex, int wellIndex) {
    // NB: ExternalDescription unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setWellExternalIdentifier(String, int, int) */
  public void setWellExternalIdentifier(String externalIdentifier, int plateIndex, int wellIndex) {
    // NB: ExternalIdentifier unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setWellID(String, int, int) */
  public void setWellID(String id, int plateIndex, int wellIndex) {
    // NB: ID unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setWellReagent(String, int, int) */
  public void setWellReagent(String reagent, int plateIndex, int wellIndex) {
    // NB: Reagent unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setWellRow(Integer, int, int) */
  public void setWellRow(Integer row, int plateIndex, int wellIndex) {
    // NB: Row unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setWellType(String, int, int) */
  public void setWellType(String type, int plateIndex, int wellIndex) {
    // NB: Type unsupported for schema version 2003-FC
  }

  // - WellSample property storage -

  /* @see loci.formats.meta.MetadataStore#setWellSampleID(String, int, int, int) */
  public void setWellSampleID(String id, int plateIndex, int wellIndex, int wellSampleIndex) {
    // NB: ID unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setWellSampleImageRef(String, int, int, int) */
  public void setWellSampleImageRef(String imageRef, int plateIndex, int wellIndex, int wellSampleIndex) {
    // NB: ImageRef unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setWellSampleIndex(Integer, int, int, int) */
  public void setWellSampleIndex(Integer index, int plateIndex, int wellIndex, int wellSampleIndex) {
    // NB: Index unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setWellSamplePosX(Float, int, int, int) */
  public void setWellSamplePosX(Float posX, int plateIndex, int wellIndex, int wellSampleIndex) {
    // NB: PosX unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setWellSamplePosY(Float, int, int, int) */
  public void setWellSamplePosY(Float posY, int plateIndex, int wellIndex, int wellSampleIndex) {
    // NB: PosY unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setWellSampleTimepoint(Integer, int, int, int) */
  public void setWellSampleTimepoint(Integer timepoint, int plateIndex, int wellIndex, int wellSampleIndex) {
    // NB: Timepoint unsupported for schema version 2003-FC
  }

  // - WellSampleRef property storage -

  /* @see loci.formats.meta.MetadataStore#setWellSampleRefID(String, int, int, int) */
  public void setWellSampleRefID(String id, int screenIndex, int screenAcquisitionIndex, int wellSampleRefIndex) {
    // NB: ID unsupported for schema version 2003-FC
  }

  // -- Helper methods --

  // Dataset+
  private DatasetNode datasetNode = null;
  private int datasetNodeDatasetIndex = -1;
  private DatasetNode getDatasetNode(int datasetIndex, boolean create) {
    // check whether indices match last request (i.e., node is cached)
    boolean match = true;
    if (datasetNodeDatasetIndex != datasetIndex) match = false;
    if (match) return datasetNode;

    OMENode ome = (OMENode) root;
    // get Dataset+ node
    int count = ome.getDatasetCount();
    if (!create && count <= datasetIndex) return null;
    for (int i=count; i<=datasetIndex; i++) new DatasetNode(ome);
    List list = ome.getDatasetList();
    datasetNode = (DatasetNode) list.get(datasetIndex);
    datasetNodeDatasetIndex = datasetIndex;
    return datasetNode;
  }

  // Dataset+/ProjectRef+
  private ProjectRefNode datasetProjectRefNode = null;
  private int datasetProjectRefNodeDatasetIndex = -1;
  private int datasetProjectRefNodeProjectRefIndex = -1;
  private ProjectRefNode getProjectRefNode(int datasetIndex, int projectRefIndex, boolean create) {
    // check whether indices match last request (i.e., node is cached)
    boolean match = true;
    if (datasetProjectRefNodeDatasetIndex != datasetIndex) match = false;
    if (datasetProjectRefNodeProjectRefIndex != projectRefIndex) match = false;
    if (match) return datasetProjectRefNode;

    // get Dataset+ node
    DatasetNode dataset = getDatasetNode(datasetIndex, create);
    if (dataset == null) return null;
    // get ProjectRef+ node
    int count = dataset.getProjectRefCount();
    if (!create && count <= projectRefIndex) return null;
    for (int i=count; i<=projectRefIndex; i++) new ProjectRefNode(dataset);
    List list = dataset.getProjectRefList();
    datasetProjectRefNode = (ProjectRefNode) list.get(projectRefIndex);
    datasetProjectRefNodeDatasetIndex = datasetIndex;
    datasetProjectRefNodeProjectRefIndex = projectRefIndex;
    return datasetProjectRefNode;
  }

  // Experiment+
  private ExperimentNode experimentNode = null;
  private int experimentNodeExperimentIndex = -1;
  private ExperimentNode getExperimentNode(int experimentIndex, boolean create) {
    // check whether indices match last request (i.e., node is cached)
    boolean match = true;
    if (experimentNodeExperimentIndex != experimentIndex) match = false;
    if (match) return experimentNode;

    OMENode ome = (OMENode) root;
    // get Experiment+ node
    int count = ome.getExperimentCount();
    if (!create && count <= experimentIndex) return null;
    for (int i=count; i<=experimentIndex; i++) new ExperimentNode(ome);
    List list = ome.getExperimentList();
    experimentNode = (ExperimentNode) list.get(experimentIndex);
    experimentNodeExperimentIndex = experimentIndex;
    return experimentNode;
  }

  // Experimenter+
  private ExperimenterNode experimenterNode = null;
  private int experimenterNodeExperimenterIndex = -1;
  private ExperimenterNode getExperimenterNode(int experimenterIndex, boolean create) {
    // check whether indices match last request (i.e., node is cached)
    boolean match = true;
    if (experimenterNodeExperimenterIndex != experimenterIndex) match = false;
    if (match) return experimenterNode;

    OMENode ome = (OMENode) root;
    // get Experimenter+ node
    int count = ome.getExperimenterCount();
    if (!create && count <= experimenterIndex) return null;
    for (int i=count; i<=experimenterIndex; i++) new ExperimenterNode(ome);
    List list = ome.getExperimenterList();
    experimenterNode = (ExperimenterNode) list.get(experimenterIndex);
    experimenterNodeExperimenterIndex = experimenterIndex;
    return experimenterNode;
  }

  // Experimenter+/GroupRef+
  private GroupRefNode experimenterGroupRefNode = null;
  private int experimenterGroupRefNodeExperimenterIndex = -1;
  private int experimenterGroupRefNodeGroupRefIndex = -1;
  private GroupRefNode getGroupRefNode(int experimenterIndex, int groupRefIndex, boolean create) {
    // check whether indices match last request (i.e., node is cached)
    boolean match = true;
    if (experimenterGroupRefNodeExperimenterIndex != experimenterIndex) match = false;
    if (experimenterGroupRefNodeGroupRefIndex != groupRefIndex) match = false;
    if (match) return experimenterGroupRefNode;

    // get Experimenter+ node
    ExperimenterNode experimenter = getExperimenterNode(experimenterIndex, create);
    if (experimenter == null) return null;
    // get GroupRef+ node
    int count = experimenter.getGroupRefCount();
    if (!create && count <= groupRefIndex) return null;
    for (int i=count; i<=groupRefIndex; i++) new GroupRefNode(experimenter);
    List list = experimenter.getGroupRefList();
    experimenterGroupRefNode = (GroupRefNode) list.get(groupRefIndex);
    experimenterGroupRefNodeExperimenterIndex = experimenterIndex;
    experimenterGroupRefNodeGroupRefIndex = groupRefIndex;
    return experimenterGroupRefNode;
  }

  // Group+
  private GroupNode groupNode = null;
  private int groupNodeGroupIndex = -1;
  private GroupNode getGroupNode(int groupIndex, boolean create) {
    // check whether indices match last request (i.e., node is cached)
    boolean match = true;
    if (groupNodeGroupIndex != groupIndex) match = false;
    if (match) return groupNode;

    OMENode ome = (OMENode) root;
    // get Group+ node
    int count = ome.getGroupCount();
    if (!create && count <= groupIndex) return null;
    for (int i=count; i<=groupIndex; i++) new GroupNode(ome);
    List list = ome.getGroupList();
    groupNode = (GroupNode) list.get(groupIndex);
    groupNodeGroupIndex = groupIndex;
    return groupNode;
  }

  // Group+/Contact
  private ContactNode groupContactNode = null;
  private int groupContactNodeGroupIndex = -1;
  private ContactNode getContactNode(int groupIndex, boolean create) {
    // check whether indices match last request (i.e., node is cached)
    boolean match = true;
    if (groupContactNodeGroupIndex != groupIndex) match = false;
    if (match) return groupContactNode;

    // get Group+ node
    GroupNode group = getGroupNode(groupIndex, create);
    if (group == null) return null;
    // get Contact node
    ContactNode contact = group.getContact();
    if (contact == null) {
      if (create) contact = new ContactNode(group);
      else return null;
    }
    groupContactNode = contact;
    groupContactNodeGroupIndex = groupIndex;
    return groupContactNode;
  }

  // Image+
  private ImageNode imageNode = null;
  private int imageNodeImageIndex = -1;
  private ImageNode getImageNode(int imageIndex, boolean create) {
    // check whether indices match last request (i.e., node is cached)
    boolean match = true;
    if (imageNodeImageIndex != imageIndex) match = false;
    if (match) return imageNode;

    OMENode ome = (OMENode) root;
    // get Image+ node
    int count = ome.getImageCount();
    if (!create && count <= imageIndex) return null;
    for (int i=count; i<=imageIndex; i++) new ImageNode(ome);
    List list = ome.getImageList();
    imageNode = (ImageNode) list.get(imageIndex);
    imageNodeImageIndex = imageIndex;
    return imageNode;
  }

  // Image+/ChannelInfo+
  private ChannelInfoNode imageChannelInfoNode = null;
  private int imageChannelInfoNodeImageIndex = -1;
  private int imageChannelInfoNodeChannelInfoIndex = -1;
  private ChannelInfoNode getChannelInfoNode(int imageIndex, int channelInfoIndex, boolean create) {
    // check whether indices match last request (i.e., node is cached)
    boolean match = true;
    if (imageChannelInfoNodeImageIndex != imageIndex) match = false;
    if (imageChannelInfoNodeChannelInfoIndex != channelInfoIndex) match = false;
    if (match) return imageChannelInfoNode;

    // get Image+ node
    ImageNode image = getImageNode(imageIndex, create);
    if (image == null) return null;
    // get ChannelInfo+ node
    int count = image.getChannelInfoCount();
    if (!create && count <= channelInfoIndex) return null;
    for (int i=count; i<=channelInfoIndex; i++) new ChannelInfoNode(image);
    List list = image.getChannelInfoList();
    imageChannelInfoNode = (ChannelInfoNode) list.get(channelInfoIndex);
    imageChannelInfoNodeImageIndex = imageIndex;
    imageChannelInfoNodeChannelInfoIndex = channelInfoIndex;
    return imageChannelInfoNode;
  }

  // Image+/ChannelInfo+/ChannelComponent+
  private ChannelComponentNode imageChannelInfoChannelComponentNode = null;
  private int imageChannelInfoChannelComponentNodeImageIndex = -1;
  private int imageChannelInfoChannelComponentNodeChannelInfoIndex = -1;
  private int imageChannelInfoChannelComponentNodeChannelComponentIndex = -1;
  private ChannelComponentNode getChannelComponentNode(int imageIndex, int channelInfoIndex, int channelComponentIndex, boolean create) {
    // check whether indices match last request (i.e., node is cached)
    boolean match = true;
    if (imageChannelInfoChannelComponentNodeImageIndex != imageIndex) match = false;
    if (imageChannelInfoChannelComponentNodeChannelInfoIndex != channelInfoIndex) match = false;
    if (imageChannelInfoChannelComponentNodeChannelComponentIndex != channelComponentIndex) match = false;
    if (match) return imageChannelInfoChannelComponentNode;

    // get Image+/ChannelInfo+ node
    ChannelInfoNode channelInfo = getChannelInfoNode(imageIndex, channelInfoIndex, create);
    if (channelInfo == null) return null;
    // get ChannelComponent+ node
    int count = channelInfo.getChannelComponentCount();
    if (!create && count <= channelComponentIndex) return null;
    for (int i=count; i<=channelComponentIndex; i++) new ChannelComponentNode(channelInfo);
    List list = channelInfo.getChannelComponentList();
    imageChannelInfoChannelComponentNode = (ChannelComponentNode) list.get(channelComponentIndex);
    imageChannelInfoChannelComponentNodeImageIndex = imageIndex;
    imageChannelInfoChannelComponentNodeChannelInfoIndex = channelInfoIndex;
    imageChannelInfoChannelComponentNodeChannelComponentIndex = channelComponentIndex;
    return imageChannelInfoChannelComponentNode;
  }

  // Image+/ChannelInfo+/DetectorRef
  private DetectorRefNode imageChannelInfoDetectorRefNode = null;
  private int imageChannelInfoDetectorRefNodeImageIndex = -1;
  private int imageChannelInfoDetectorRefNodeChannelInfoIndex = -1;
  private DetectorRefNode getDetectorRefNode(int imageIndex, int channelInfoIndex, boolean create) {
    // check whether indices match last request (i.e., node is cached)
    boolean match = true;
    if (imageChannelInfoDetectorRefNodeImageIndex != imageIndex) match = false;
    if (imageChannelInfoDetectorRefNodeChannelInfoIndex != channelInfoIndex) match = false;
    if (match) return imageChannelInfoDetectorRefNode;

    // get Image+/ChannelInfo+ node
    ChannelInfoNode channelInfo = getChannelInfoNode(imageIndex, channelInfoIndex, create);
    if (channelInfo == null) return null;
    // get DetectorRef node
    DetectorRefNode detectorRef = channelInfo.getDetectorRef();
    if (detectorRef == null) {
      if (create) detectorRef = new DetectorRefNode(channelInfo);
      else return null;
    }
    imageChannelInfoDetectorRefNode = detectorRef;
    imageChannelInfoDetectorRefNodeImageIndex = imageIndex;
    imageChannelInfoDetectorRefNodeChannelInfoIndex = channelInfoIndex;
    return imageChannelInfoDetectorRefNode;
  }

  // Image+/ChannelInfo+/LightSourceRef
  private LightSourceRefNode imageChannelInfoLightSourceRefNode = null;
  private int imageChannelInfoLightSourceRefNodeImageIndex = -1;
  private int imageChannelInfoLightSourceRefNodeChannelInfoIndex = -1;
  private LightSourceRefNode getLightSourceRefNode(int imageIndex, int channelInfoIndex, boolean create) {
    // check whether indices match last request (i.e., node is cached)
    boolean match = true;
    if (imageChannelInfoLightSourceRefNodeImageIndex != imageIndex) match = false;
    if (imageChannelInfoLightSourceRefNodeChannelInfoIndex != channelInfoIndex) match = false;
    if (match) return imageChannelInfoLightSourceRefNode;

    // get Image+/ChannelInfo+ node
    ChannelInfoNode channelInfo = getChannelInfoNode(imageIndex, channelInfoIndex, create);
    if (channelInfo == null) return null;
    // get LightSourceRef node
    LightSourceRefNode lightSourceRef = channelInfo.getLightSourceRef();
    if (lightSourceRef == null) {
      if (create) lightSourceRef = new LightSourceRefNode(channelInfo);
      else return null;
    }
    imageChannelInfoLightSourceRefNode = lightSourceRef;
    imageChannelInfoLightSourceRefNodeImageIndex = imageIndex;
    imageChannelInfoLightSourceRefNodeChannelInfoIndex = channelInfoIndex;
    return imageChannelInfoLightSourceRefNode;
  }

  // Image+/ChannelInfo+/OTFRef
  private OTFRefNode imageChannelInfoOTFRefNode = null;
  private int imageChannelInfoOTFRefNodeImageIndex = -1;
  private int imageChannelInfoOTFRefNodeChannelInfoIndex = -1;
  private OTFRefNode getOTFRefNode(int imageIndex, int channelInfoIndex, boolean create) {
    // check whether indices match last request (i.e., node is cached)
    boolean match = true;
    if (imageChannelInfoOTFRefNodeImageIndex != imageIndex) match = false;
    if (imageChannelInfoOTFRefNodeChannelInfoIndex != channelInfoIndex) match = false;
    if (match) return imageChannelInfoOTFRefNode;

    // get Image+/ChannelInfo+ node
    ChannelInfoNode channelInfo = getChannelInfoNode(imageIndex, channelInfoIndex, create);
    if (channelInfo == null) return null;
    // get OTFRef node
    OTFRefNode otfRef = channelInfo.getOTFRef();
    if (otfRef == null) {
      if (create) otfRef = new OTFRefNode(channelInfo);
      else return null;
    }
    imageChannelInfoOTFRefNode = otfRef;
    imageChannelInfoOTFRefNodeImageIndex = imageIndex;
    imageChannelInfoOTFRefNodeChannelInfoIndex = channelInfoIndex;
    return imageChannelInfoOTFRefNode;
  }

  // Image+/DisplayOptions
  private DisplayOptionsNode imageDisplayOptionsNode = null;
  private int imageDisplayOptionsNodeImageIndex = -1;
  private DisplayOptionsNode getDisplayOptionsNode(int imageIndex, boolean create) {
    // check whether indices match last request (i.e., node is cached)
    boolean match = true;
    if (imageDisplayOptionsNodeImageIndex != imageIndex) match = false;
    if (match) return imageDisplayOptionsNode;

    // get Image+ node
    ImageNode image = getImageNode(imageIndex, create);
    if (image == null) return null;
    // get DisplayOptions node
    DisplayOptionsNode displayOptions = image.getDisplayOptions();
    if (displayOptions == null) {
      if (create) displayOptions = new DisplayOptionsNode(image);
      else return null;
    }
    imageDisplayOptionsNode = displayOptions;
    imageDisplayOptionsNodeImageIndex = imageIndex;
    return imageDisplayOptionsNode;
  }

  // Image+/DisplayOptions/ROI+
  private ROINode imageDisplayOptionsROINode = null;
  private int imageDisplayOptionsROINodeImageIndex = -1;
  private int imageDisplayOptionsROINodeROIIndex = -1;
  private ROINode getROINode(int imageIndex, int roiIndex, boolean create) {
    // check whether indices match last request (i.e., node is cached)
    boolean match = true;
    if (imageDisplayOptionsROINodeImageIndex != imageIndex) match = false;
    if (imageDisplayOptionsROINodeROIIndex != roiIndex) match = false;
    if (match) return imageDisplayOptionsROINode;

    // get Image+/DisplayOptions node
    DisplayOptionsNode displayOptions = getDisplayOptionsNode(imageIndex, create);
    if (displayOptions == null) return null;
    // get ROI+ node
    int count = displayOptions.getROICount();
    if (!create && count <= roiIndex) return null;
    for (int i=count; i<=roiIndex; i++) new ROINode(displayOptions);
    List list = displayOptions.getROIList();
    imageDisplayOptionsROINode = (ROINode) list.get(roiIndex);
    imageDisplayOptionsROINodeImageIndex = imageIndex;
    imageDisplayOptionsROINodeROIIndex = roiIndex;
    return imageDisplayOptionsROINode;
  }

  // Image+/ImagingEnvironment
  private ImagingEnvironmentNode imageImagingEnvironmentNode = null;
  private int imageImagingEnvironmentNodeImageIndex = -1;
  private ImagingEnvironmentNode getImagingEnvironmentNode(int imageIndex, boolean create) {
    // check whether indices match last request (i.e., node is cached)
    boolean match = true;
    if (imageImagingEnvironmentNodeImageIndex != imageIndex) match = false;
    if (match) return imageImagingEnvironmentNode;

    // get Image+ node
    ImageNode image = getImageNode(imageIndex, create);
    if (image == null) return null;
    // get ImagingEnvironment node
    ImagingEnvironmentNode imagingEnvironment = image.getImagingEnvironment();
    if (imagingEnvironment == null) {
      if (create) imagingEnvironment = new ImagingEnvironmentNode(image);
      else return null;
    }
    imageImagingEnvironmentNode = imagingEnvironment;
    imageImagingEnvironmentNodeImageIndex = imageIndex;
    return imageImagingEnvironmentNode;
  }

  // Image+/ObjectiveRef
  private ObjectiveRefNode imageObjectiveRefNode = null;
  private int imageObjectiveRefNodeImageIndex = -1;
  private ObjectiveRefNode getObjectiveRefNode(int imageIndex, boolean create) {
    // check whether indices match last request (i.e., node is cached)
    boolean match = true;
    if (imageObjectiveRefNodeImageIndex != imageIndex) match = false;
    if (match) return imageObjectiveRefNode;

    // get Image+ node
    ImageNode image = getImageNode(imageIndex, create);
    if (image == null) return null;
    // get ObjectiveRef node
    ObjectiveRefNode objectiveRef = image.getObjectiveRef();
    if (objectiveRef == null) {
      if (create) objectiveRef = new ObjectiveRefNode(image);
      else return null;
    }
    imageObjectiveRefNode = objectiveRef;
    imageObjectiveRefNodeImageIndex = imageIndex;
    return imageObjectiveRefNode;
  }

  // Image+/Pixels+
  private PixelsNode imagePixelsNode = null;
  private int imagePixelsNodeImageIndex = -1;
  private int imagePixelsNodePixelsIndex = -1;
  private PixelsNode getPixelsNode(int imageIndex, int pixelsIndex, boolean create) {
    // check whether indices match last request (i.e., node is cached)
    boolean match = true;
    if (imagePixelsNodeImageIndex != imageIndex) match = false;
    if (imagePixelsNodePixelsIndex != pixelsIndex) match = false;
    if (match) return imagePixelsNode;

    // get Image+ node
    ImageNode image = getImageNode(imageIndex, create);
    if (image == null) return null;
    // get Pixels+ node
    int count = image.getPixelsCount();
    if (!create && count <= pixelsIndex) return null;
    for (int i=count; i<=pixelsIndex; i++) new PixelsNode(image);
    List list = image.getPixelsList();
    imagePixelsNode = (PixelsNode) list.get(pixelsIndex);
    imagePixelsNodeImageIndex = imageIndex;
    imagePixelsNodePixelsIndex = pixelsIndex;
    return imagePixelsNode;
  }

  // Image+/Pixels+/TiffData+
  private TiffDataNode imagePixelsTiffDataNode = null;
  private int imagePixelsTiffDataNodeImageIndex = -1;
  private int imagePixelsTiffDataNodePixelsIndex = -1;
  private int imagePixelsTiffDataNodeTiffDataIndex = -1;
  private TiffDataNode getTiffDataNode(int imageIndex, int pixelsIndex, int tiffDataIndex, boolean create) {
    // check whether indices match last request (i.e., node is cached)
    boolean match = true;
    if (imagePixelsTiffDataNodeImageIndex != imageIndex) match = false;
    if (imagePixelsTiffDataNodePixelsIndex != pixelsIndex) match = false;
    if (imagePixelsTiffDataNodeTiffDataIndex != tiffDataIndex) match = false;
    if (match) return imagePixelsTiffDataNode;

    // get Image+/Pixels+ node
    PixelsNode pixels = getPixelsNode(imageIndex, pixelsIndex, create);
    if (pixels == null) return null;
    // get TiffData+ node
    int count = pixels.getTiffDataCount();
    if (!create && count <= tiffDataIndex) return null;
    for (int i=count; i<=tiffDataIndex; i++) new TiffDataNode(pixels);
    List list = pixels.getTiffDataList();
    imagePixelsTiffDataNode = (TiffDataNode) list.get(tiffDataIndex);
    imagePixelsTiffDataNodeImageIndex = imageIndex;
    imagePixelsTiffDataNodePixelsIndex = pixelsIndex;
    imagePixelsTiffDataNodeTiffDataIndex = tiffDataIndex;
    return imagePixelsTiffDataNode;
  }

  // Image+/PlateRef
  private PlateRefNode imagePlateRefNode = null;
  private int imagePlateRefNodeImageIndex = -1;
  private PlateRefNode getPlateRefNode(int imageIndex, boolean create) {
    // check whether indices match last request (i.e., node is cached)
    boolean match = true;
    if (imagePlateRefNodeImageIndex != imageIndex) match = false;
    if (match) return imagePlateRefNode;

    // get Image+ node
    ImageNode image = getImageNode(imageIndex, create);
    if (image == null) return null;
    // get PlateRef node
    PlateRefNode plateRef = image.getPlateRef();
    if (plateRef == null) {
      if (create) plateRef = new PlateRefNode(image);
      else return null;
    }
    imagePlateRefNode = plateRef;
    imagePlateRefNodeImageIndex = imageIndex;
    return imagePlateRefNode;
  }

  // Image+/StageLabel
  private StageLabelNode imageStageLabelNode = null;
  private int imageStageLabelNodeImageIndex = -1;
  private StageLabelNode getStageLabelNode(int imageIndex, boolean create) {
    // check whether indices match last request (i.e., node is cached)
    boolean match = true;
    if (imageStageLabelNodeImageIndex != imageIndex) match = false;
    if (match) return imageStageLabelNode;

    // get Image+ node
    ImageNode image = getImageNode(imageIndex, create);
    if (image == null) return null;
    // get StageLabel node
    StageLabelNode stageLabel = image.getStageLabel();
    if (stageLabel == null) {
      if (create) stageLabel = new StageLabelNode(image);
      else return null;
    }
    imageStageLabelNode = stageLabel;
    imageStageLabelNodeImageIndex = imageIndex;
    return imageStageLabelNode;
  }

  // Image+/Thumbnail
  private ThumbnailNode imageThumbnailNode = null;
  private int imageThumbnailNodeImageIndex = -1;
  private ThumbnailNode getThumbnailNode(int imageIndex, boolean create) {
    // check whether indices match last request (i.e., node is cached)
    boolean match = true;
    if (imageThumbnailNodeImageIndex != imageIndex) match = false;
    if (match) return imageThumbnailNode;

    // get Image+ node
    ImageNode image = getImageNode(imageIndex, create);
    if (image == null) return null;
    // get Thumbnail node
    ThumbnailNode thumbnail = image.getThumbnail();
    if (thumbnail == null) {
      if (create) thumbnail = new ThumbnailNode(image);
      else return null;
    }
    imageThumbnailNode = thumbnail;
    imageThumbnailNodeImageIndex = imageIndex;
    return imageThumbnailNode;
  }

  // Instrument+
  private InstrumentNode instrumentNode = null;
  private int instrumentNodeInstrumentIndex = -1;
  private InstrumentNode getInstrumentNode(int instrumentIndex, boolean create) {
    // check whether indices match last request (i.e., node is cached)
    boolean match = true;
    if (instrumentNodeInstrumentIndex != instrumentIndex) match = false;
    if (match) return instrumentNode;

    OMENode ome = (OMENode) root;
    // get Instrument+ node
    int count = ome.getInstrumentCount();
    if (!create && count <= instrumentIndex) return null;
    for (int i=count; i<=instrumentIndex; i++) new InstrumentNode(ome);
    List list = ome.getInstrumentList();
    instrumentNode = (InstrumentNode) list.get(instrumentIndex);
    instrumentNodeInstrumentIndex = instrumentIndex;
    return instrumentNode;
  }

  // Instrument+/Detector+
  private DetectorNode instrumentDetectorNode = null;
  private int instrumentDetectorNodeInstrumentIndex = -1;
  private int instrumentDetectorNodeDetectorIndex = -1;
  private DetectorNode getDetectorNode(int instrumentIndex, int detectorIndex, boolean create) {
    // check whether indices match last request (i.e., node is cached)
    boolean match = true;
    if (instrumentDetectorNodeInstrumentIndex != instrumentIndex) match = false;
    if (instrumentDetectorNodeDetectorIndex != detectorIndex) match = false;
    if (match) return instrumentDetectorNode;

    // get Instrument+ node
    InstrumentNode instrument = getInstrumentNode(instrumentIndex, create);
    if (instrument == null) return null;
    // get Detector+ node
    int count = instrument.getDetectorCount();
    if (!create && count <= detectorIndex) return null;
    for (int i=count; i<=detectorIndex; i++) new DetectorNode(instrument);
    List list = instrument.getDetectorList();
    instrumentDetectorNode = (DetectorNode) list.get(detectorIndex);
    instrumentDetectorNodeInstrumentIndex = instrumentIndex;
    instrumentDetectorNodeDetectorIndex = detectorIndex;
    return instrumentDetectorNode;
  }

  // Instrument+/Filter+
  private FilterNode instrumentFilterNode = null;
  private int instrumentFilterNodeInstrumentIndex = -1;
  private int instrumentFilterNodeFilterIndex = -1;
  private FilterNode getFilterNode(int instrumentIndex, int filterIndex, boolean create) {
    // check whether indices match last request (i.e., node is cached)
    boolean match = true;
    if (instrumentFilterNodeInstrumentIndex != instrumentIndex) match = false;
    if (instrumentFilterNodeFilterIndex != filterIndex) match = false;
    if (match) return instrumentFilterNode;

    // get Instrument+ node
    InstrumentNode instrument = getInstrumentNode(instrumentIndex, create);
    if (instrument == null) return null;
    // get Filter+ node
    int count = instrument.getFilterCount();
    if (!create && count <= filterIndex) return null;
    for (int i=count; i<=filterIndex; i++) new FilterNode(instrument);
    List list = instrument.getFilterList();
    instrumentFilterNode = (FilterNode) list.get(filterIndex);
    instrumentFilterNodeInstrumentIndex = instrumentIndex;
    instrumentFilterNodeFilterIndex = filterIndex;
    return instrumentFilterNode;
  }

  // Instrument+/Filter+/Dichroic
  private DichroicNode instrumentFilterDichroicNode = null;
  private int instrumentFilterDichroicNodeInstrumentIndex = -1;
  private int instrumentFilterDichroicNodeFilterIndex = -1;
  private DichroicNode getDichroicNode(int instrumentIndex, int filterIndex, boolean create) {
    // check whether indices match last request (i.e., node is cached)
    boolean match = true;
    if (instrumentFilterDichroicNodeInstrumentIndex != instrumentIndex) match = false;
    if (instrumentFilterDichroicNodeFilterIndex != filterIndex) match = false;
    if (match) return instrumentFilterDichroicNode;

    // get Instrument+/Filter+ node
    FilterNode filter = getFilterNode(instrumentIndex, filterIndex, create);
    if (filter == null) return null;
    // get Dichroic node
    DichroicNode dichroic = filter.getDichroic();
    if (dichroic == null) {
      if (create) dichroic = new DichroicNode(filter);
      else return null;
    }
    instrumentFilterDichroicNode = dichroic;
    instrumentFilterDichroicNodeInstrumentIndex = instrumentIndex;
    instrumentFilterDichroicNodeFilterIndex = filterIndex;
    return instrumentFilterDichroicNode;
  }

  // Instrument+/Filter+/EmFilter
  private EmFilterNode instrumentFilterEmFilterNode = null;
  private int instrumentFilterEmFilterNodeInstrumentIndex = -1;
  private int instrumentFilterEmFilterNodeFilterIndex = -1;
  private EmFilterNode getEmFilterNode(int instrumentIndex, int filterIndex, boolean create) {
    // check whether indices match last request (i.e., node is cached)
    boolean match = true;
    if (instrumentFilterEmFilterNodeInstrumentIndex != instrumentIndex) match = false;
    if (instrumentFilterEmFilterNodeFilterIndex != filterIndex) match = false;
    if (match) return instrumentFilterEmFilterNode;

    // get Instrument+/Filter+ node
    FilterNode filter = getFilterNode(instrumentIndex, filterIndex, create);
    if (filter == null) return null;
    // get EmFilter node
    EmFilterNode emFilter = filter.getEmFilter();
    if (emFilter == null) {
      if (create) emFilter = new EmFilterNode(filter);
      else return null;
    }
    instrumentFilterEmFilterNode = emFilter;
    instrumentFilterEmFilterNodeInstrumentIndex = instrumentIndex;
    instrumentFilterEmFilterNodeFilterIndex = filterIndex;
    return instrumentFilterEmFilterNode;
  }

  // Instrument+/Filter+/ExFilter
  private ExFilterNode instrumentFilterExFilterNode = null;
  private int instrumentFilterExFilterNodeInstrumentIndex = -1;
  private int instrumentFilterExFilterNodeFilterIndex = -1;
  private ExFilterNode getExFilterNode(int instrumentIndex, int filterIndex, boolean create) {
    // check whether indices match last request (i.e., node is cached)
    boolean match = true;
    if (instrumentFilterExFilterNodeInstrumentIndex != instrumentIndex) match = false;
    if (instrumentFilterExFilterNodeFilterIndex != filterIndex) match = false;
    if (match) return instrumentFilterExFilterNode;

    // get Instrument+/Filter+ node
    FilterNode filter = getFilterNode(instrumentIndex, filterIndex, create);
    if (filter == null) return null;
    // get ExFilter node
    ExFilterNode exFilter = filter.getExFilter();
    if (exFilter == null) {
      if (create) exFilter = new ExFilterNode(filter);
      else return null;
    }
    instrumentFilterExFilterNode = exFilter;
    instrumentFilterExFilterNodeInstrumentIndex = instrumentIndex;
    instrumentFilterExFilterNodeFilterIndex = filterIndex;
    return instrumentFilterExFilterNode;
  }

  // Instrument+/Filter+/FilterSet
  private FilterSetNode instrumentFilterFilterSetNode = null;
  private int instrumentFilterFilterSetNodeInstrumentIndex = -1;
  private int instrumentFilterFilterSetNodeFilterIndex = -1;
  private FilterSetNode getFilterSetNode(int instrumentIndex, int filterIndex, boolean create) {
    // check whether indices match last request (i.e., node is cached)
    boolean match = true;
    if (instrumentFilterFilterSetNodeInstrumentIndex != instrumentIndex) match = false;
    if (instrumentFilterFilterSetNodeFilterIndex != filterIndex) match = false;
    if (match) return instrumentFilterFilterSetNode;

    // get Instrument+/Filter+ node
    FilterNode filter = getFilterNode(instrumentIndex, filterIndex, create);
    if (filter == null) return null;
    // get FilterSet node
    FilterSetNode filterSet = filter.getFilterSet();
    if (filterSet == null) {
      if (create) filterSet = new FilterSetNode(filter);
      else return null;
    }
    instrumentFilterFilterSetNode = filterSet;
    instrumentFilterFilterSetNodeInstrumentIndex = instrumentIndex;
    instrumentFilterFilterSetNodeFilterIndex = filterIndex;
    return instrumentFilterFilterSetNode;
  }

  // Instrument+/LightSource+
  private LightSourceNode instrumentLightSourceNode = null;
  private int instrumentLightSourceNodeInstrumentIndex = -1;
  private int instrumentLightSourceNodeLightSourceIndex = -1;
  private LightSourceNode getLightSourceNode(int instrumentIndex, int lightSourceIndex, boolean create) {
    // check whether indices match last request (i.e., node is cached)
    boolean match = true;
    if (instrumentLightSourceNodeInstrumentIndex != instrumentIndex) match = false;
    if (instrumentLightSourceNodeLightSourceIndex != lightSourceIndex) match = false;
    if (match) return instrumentLightSourceNode;

    // get Instrument+ node
    InstrumentNode instrument = getInstrumentNode(instrumentIndex, create);
    if (instrument == null) return null;
    // get LightSource+ node
    int count = instrument.getLightSourceCount();
    if (!create && count <= lightSourceIndex) return null;
    for (int i=count; i<=lightSourceIndex; i++) new LightSourceNode(instrument);
    List list = instrument.getLightSourceList();
    instrumentLightSourceNode = (LightSourceNode) list.get(lightSourceIndex);
    instrumentLightSourceNodeInstrumentIndex = instrumentIndex;
    instrumentLightSourceNodeLightSourceIndex = lightSourceIndex;
    return instrumentLightSourceNode;
  }

  // Instrument+/LightSource+/Arc
  private ArcNode instrumentLightSourceArcNode = null;
  private int instrumentLightSourceArcNodeInstrumentIndex = -1;
  private int instrumentLightSourceArcNodeLightSourceIndex = -1;
  private ArcNode getArcNode(int instrumentIndex, int lightSourceIndex, boolean create) {
    // check whether indices match last request (i.e., node is cached)
    boolean match = true;
    if (instrumentLightSourceArcNodeInstrumentIndex != instrumentIndex) match = false;
    if (instrumentLightSourceArcNodeLightSourceIndex != lightSourceIndex) match = false;
    if (match) return instrumentLightSourceArcNode;

    // get Instrument+/LightSource+ node
    LightSourceNode lightSource = getLightSourceNode(instrumentIndex, lightSourceIndex, create);
    if (lightSource == null) return null;
    // get Arc node
    ArcNode arc = lightSource.getArc();
    if (arc == null) {
      if (create) arc = new ArcNode(lightSource);
      else return null;
    }
    instrumentLightSourceArcNode = arc;
    instrumentLightSourceArcNodeInstrumentIndex = instrumentIndex;
    instrumentLightSourceArcNodeLightSourceIndex = lightSourceIndex;
    return instrumentLightSourceArcNode;
  }

  // Instrument+/LightSource+/Filament
  private FilamentNode instrumentLightSourceFilamentNode = null;
  private int instrumentLightSourceFilamentNodeInstrumentIndex = -1;
  private int instrumentLightSourceFilamentNodeLightSourceIndex = -1;
  private FilamentNode getFilamentNode(int instrumentIndex, int lightSourceIndex, boolean create) {
    // check whether indices match last request (i.e., node is cached)
    boolean match = true;
    if (instrumentLightSourceFilamentNodeInstrumentIndex != instrumentIndex) match = false;
    if (instrumentLightSourceFilamentNodeLightSourceIndex != lightSourceIndex) match = false;
    if (match) return instrumentLightSourceFilamentNode;

    // get Instrument+/LightSource+ node
    LightSourceNode lightSource = getLightSourceNode(instrumentIndex, lightSourceIndex, create);
    if (lightSource == null) return null;
    // get Filament node
    FilamentNode filament = lightSource.getFilament();
    if (filament == null) {
      if (create) filament = new FilamentNode(lightSource);
      else return null;
    }
    instrumentLightSourceFilamentNode = filament;
    instrumentLightSourceFilamentNodeInstrumentIndex = instrumentIndex;
    instrumentLightSourceFilamentNodeLightSourceIndex = lightSourceIndex;
    return instrumentLightSourceFilamentNode;
  }

  // Instrument+/LightSource+/Laser
  private LaserNode instrumentLightSourceLaserNode = null;
  private int instrumentLightSourceLaserNodeInstrumentIndex = -1;
  private int instrumentLightSourceLaserNodeLightSourceIndex = -1;
  private LaserNode getLaserNode(int instrumentIndex, int lightSourceIndex, boolean create) {
    // check whether indices match last request (i.e., node is cached)
    boolean match = true;
    if (instrumentLightSourceLaserNodeInstrumentIndex != instrumentIndex) match = false;
    if (instrumentLightSourceLaserNodeLightSourceIndex != lightSourceIndex) match = false;
    if (match) return instrumentLightSourceLaserNode;

    // get Instrument+/LightSource+ node
    LightSourceNode lightSource = getLightSourceNode(instrumentIndex, lightSourceIndex, create);
    if (lightSource == null) return null;
    // get Laser node
    LaserNode laser = lightSource.getLaser();
    if (laser == null) {
      if (create) laser = new LaserNode(lightSource);
      else return null;
    }
    instrumentLightSourceLaserNode = laser;
    instrumentLightSourceLaserNodeInstrumentIndex = instrumentIndex;
    instrumentLightSourceLaserNodeLightSourceIndex = lightSourceIndex;
    return instrumentLightSourceLaserNode;
  }

  // Instrument+/LightSource+/Laser/Pump
  private PumpNode instrumentLightSourceLaserPumpNode = null;
  private int instrumentLightSourceLaserPumpNodeInstrumentIndex = -1;
  private int instrumentLightSourceLaserPumpNodeLightSourceIndex = -1;
  private PumpNode getPumpNode(int instrumentIndex, int lightSourceIndex, boolean create) {
    // check whether indices match last request (i.e., node is cached)
    boolean match = true;
    if (instrumentLightSourceLaserPumpNodeInstrumentIndex != instrumentIndex) match = false;
    if (instrumentLightSourceLaserPumpNodeLightSourceIndex != lightSourceIndex) match = false;
    if (match) return instrumentLightSourceLaserPumpNode;

    // get Instrument+/LightSource+/Laser node
    LaserNode laser = getLaserNode(instrumentIndex, lightSourceIndex, create);
    if (laser == null) return null;
    // get Pump node
    PumpNode pump = laser.getPump();
    if (pump == null) {
      if (create) pump = new PumpNode(laser);
      else return null;
    }
    instrumentLightSourceLaserPumpNode = pump;
    instrumentLightSourceLaserPumpNodeInstrumentIndex = instrumentIndex;
    instrumentLightSourceLaserPumpNodeLightSourceIndex = lightSourceIndex;
    return instrumentLightSourceLaserPumpNode;
  }

  // Instrument+/Microscope
  private MicroscopeNode instrumentMicroscopeNode = null;
  private int instrumentMicroscopeNodeInstrumentIndex = -1;
  private MicroscopeNode getMicroscopeNode(int instrumentIndex, boolean create) {
    // check whether indices match last request (i.e., node is cached)
    boolean match = true;
    if (instrumentMicroscopeNodeInstrumentIndex != instrumentIndex) match = false;
    if (match) return instrumentMicroscopeNode;

    // get Instrument+ node
    InstrumentNode instrument = getInstrumentNode(instrumentIndex, create);
    if (instrument == null) return null;
    // get Microscope node
    MicroscopeNode microscope = instrument.getMicroscope();
    if (microscope == null) {
      if (create) microscope = new MicroscopeNode(instrument);
      else return null;
    }
    instrumentMicroscopeNode = microscope;
    instrumentMicroscopeNodeInstrumentIndex = instrumentIndex;
    return instrumentMicroscopeNode;
  }

  // Instrument+/OTF+
  private OTFNode instrumentOTFNode = null;
  private int instrumentOTFNodeInstrumentIndex = -1;
  private int instrumentOTFNodeOTFIndex = -1;
  private OTFNode getOTFNode(int instrumentIndex, int otfIndex, boolean create) {
    // check whether indices match last request (i.e., node is cached)
    boolean match = true;
    if (instrumentOTFNodeInstrumentIndex != instrumentIndex) match = false;
    if (instrumentOTFNodeOTFIndex != otfIndex) match = false;
    if (match) return instrumentOTFNode;

    // get Instrument+ node
    InstrumentNode instrument = getInstrumentNode(instrumentIndex, create);
    if (instrument == null) return null;
    // get OTF+ node
    int count = instrument.getOTFCount();
    if (!create && count <= otfIndex) return null;
    for (int i=count; i<=otfIndex; i++) new OTFNode(instrument);
    List list = instrument.getOTFList();
    instrumentOTFNode = (OTFNode) list.get(otfIndex);
    instrumentOTFNodeInstrumentIndex = instrumentIndex;
    instrumentOTFNodeOTFIndex = otfIndex;
    return instrumentOTFNode;
  }

  // Instrument+/OTF+/ObjectiveRef
  private ObjectiveRefNode instrumentOTFObjectiveRefNode = null;
  private int instrumentOTFObjectiveRefNodeInstrumentIndex = -1;
  private int instrumentOTFObjectiveRefNodeOTFIndex = -1;
  private ObjectiveRefNode getObjectiveRefNode(int instrumentIndex, int otfIndex, boolean create) {
    // check whether indices match last request (i.e., node is cached)
    boolean match = true;
    if (instrumentOTFObjectiveRefNodeInstrumentIndex != instrumentIndex) match = false;
    if (instrumentOTFObjectiveRefNodeOTFIndex != otfIndex) match = false;
    if (match) return instrumentOTFObjectiveRefNode;

    // get Instrument+/OTF+ node
    OTFNode otf = getOTFNode(instrumentIndex, otfIndex, create);
    if (otf == null) return null;
    // get ObjectiveRef node
    ObjectiveRefNode objectiveRef = otf.getObjectiveRef();
    if (objectiveRef == null) {
      if (create) objectiveRef = new ObjectiveRefNode(otf);
      else return null;
    }
    instrumentOTFObjectiveRefNode = objectiveRef;
    instrumentOTFObjectiveRefNodeInstrumentIndex = instrumentIndex;
    instrumentOTFObjectiveRefNodeOTFIndex = otfIndex;
    return instrumentOTFObjectiveRefNode;
  }

  // Instrument+/Objective+
  private ObjectiveNode instrumentObjectiveNode = null;
  private int instrumentObjectiveNodeInstrumentIndex = -1;
  private int instrumentObjectiveNodeObjectiveIndex = -1;
  private ObjectiveNode getObjectiveNode(int instrumentIndex, int objectiveIndex, boolean create) {
    // check whether indices match last request (i.e., node is cached)
    boolean match = true;
    if (instrumentObjectiveNodeInstrumentIndex != instrumentIndex) match = false;
    if (instrumentObjectiveNodeObjectiveIndex != objectiveIndex) match = false;
    if (match) return instrumentObjectiveNode;

    // get Instrument+ node
    InstrumentNode instrument = getInstrumentNode(instrumentIndex, create);
    if (instrument == null) return null;
    // get Objective+ node
    int count = instrument.getObjectiveCount();
    if (!create && count <= objectiveIndex) return null;
    for (int i=count; i<=objectiveIndex; i++) new ObjectiveNode(instrument);
    List list = instrument.getObjectiveList();
    instrumentObjectiveNode = (ObjectiveNode) list.get(objectiveIndex);
    instrumentObjectiveNodeInstrumentIndex = instrumentIndex;
    instrumentObjectiveNodeObjectiveIndex = objectiveIndex;
    return instrumentObjectiveNode;
  }

  // Plate+
  private PlateNode plateNode = null;
  private int plateNodePlateIndex = -1;
  private PlateNode getPlateNode(int plateIndex, boolean create) {
    // check whether indices match last request (i.e., node is cached)
    boolean match = true;
    if (plateNodePlateIndex != plateIndex) match = false;
    if (match) return plateNode;

    OMENode ome = (OMENode) root;
    // get Plate+ node
    int count = ome.getPlateCount();
    if (!create && count <= plateIndex) return null;
    for (int i=count; i<=plateIndex; i++) new PlateNode(ome);
    List list = ome.getPlateList();
    plateNode = (PlateNode) list.get(plateIndex);
    plateNodePlateIndex = plateIndex;
    return plateNode;
  }

  // Plate+/ScreenRef+
  private ScreenRefNode plateScreenRefNode = null;
  private int plateScreenRefNodePlateIndex = -1;
  private int plateScreenRefNodeScreenRefIndex = -1;
  private ScreenRefNode getScreenRefNode(int plateIndex, int screenRefIndex, boolean create) {
    // check whether indices match last request (i.e., node is cached)
    boolean match = true;
    if (plateScreenRefNodePlateIndex != plateIndex) match = false;
    if (plateScreenRefNodeScreenRefIndex != screenRefIndex) match = false;
    if (match) return plateScreenRefNode;

    // get Plate+ node
    PlateNode plate = getPlateNode(plateIndex, create);
    if (plate == null) return null;
    // get ScreenRef+ node
    int count = plate.getScreenRefCount();
    if (!create && count <= screenRefIndex) return null;
    for (int i=count; i<=screenRefIndex; i++) new ScreenRefNode(plate);
    List list = plate.getScreenRefList();
    plateScreenRefNode = (ScreenRefNode) list.get(screenRefIndex);
    plateScreenRefNodePlateIndex = plateIndex;
    plateScreenRefNodeScreenRefIndex = screenRefIndex;
    return plateScreenRefNode;
  }

  // Project+
  private ProjectNode projectNode = null;
  private int projectNodeProjectIndex = -1;
  private ProjectNode getProjectNode(int projectIndex, boolean create) {
    // check whether indices match last request (i.e., node is cached)
    boolean match = true;
    if (projectNodeProjectIndex != projectIndex) match = false;
    if (match) return projectNode;

    OMENode ome = (OMENode) root;
    // get Project+ node
    int count = ome.getProjectCount();
    if (!create && count <= projectIndex) return null;
    for (int i=count; i<=projectIndex; i++) new ProjectNode(ome);
    List list = ome.getProjectList();
    projectNode = (ProjectNode) list.get(projectIndex);
    projectNodeProjectIndex = projectIndex;
    return projectNode;
  }

  // Screen+
  private ScreenNode screenNode = null;
  private int screenNodeScreenIndex = -1;
  private ScreenNode getScreenNode(int screenIndex, boolean create) {
    // check whether indices match last request (i.e., node is cached)
    boolean match = true;
    if (screenNodeScreenIndex != screenIndex) match = false;
    if (match) return screenNode;

    OMENode ome = (OMENode) root;
    // get Screen+ node
    int count = ome.getScreenCount();
    if (!create && count <= screenIndex) return null;
    for (int i=count; i<=screenIndex; i++) new ScreenNode(ome);
    List list = ome.getScreenList();
    screenNode = (ScreenNode) list.get(screenIndex);
    screenNodeScreenIndex = screenIndex;
    return screenNode;
  }

  private void clearCachedNodes() {
    OMEXMLNode.clearCaches();
    // Dataset+
    datasetNode = null;
    datasetNodeDatasetIndex = -1;
    // Dataset+/ProjectRef+
    datasetProjectRefNode = null;
    datasetProjectRefNodeDatasetIndex = -1;
    datasetProjectRefNodeProjectRefIndex = -1;
    // Experiment+
    experimentNode = null;
    experimentNodeExperimentIndex = -1;
    // Experimenter+
    experimenterNode = null;
    experimenterNodeExperimenterIndex = -1;
    // Experimenter+/GroupRef+
    experimenterGroupRefNode = null;
    experimenterGroupRefNodeExperimenterIndex = -1;
    experimenterGroupRefNodeGroupRefIndex = -1;
    // Group+
    groupNode = null;
    groupNodeGroupIndex = -1;
    // Group+/Contact
    groupContactNode = null;
    groupContactNodeGroupIndex = -1;
    // Image+
    imageNode = null;
    imageNodeImageIndex = -1;
    // Image+/ChannelInfo+
    imageChannelInfoNode = null;
    imageChannelInfoNodeImageIndex = -1;
    imageChannelInfoNodeChannelInfoIndex = -1;
    // Image+/ChannelInfo+/ChannelComponent+
    imageChannelInfoChannelComponentNode = null;
    imageChannelInfoChannelComponentNodeImageIndex = -1;
    imageChannelInfoChannelComponentNodeChannelInfoIndex = -1;
    imageChannelInfoChannelComponentNodeChannelComponentIndex = -1;
    // Image+/ChannelInfo+/DetectorRef
    imageChannelInfoDetectorRefNode = null;
    imageChannelInfoDetectorRefNodeImageIndex = -1;
    imageChannelInfoDetectorRefNodeChannelInfoIndex = -1;
    // Image+/ChannelInfo+/LightSourceRef
    imageChannelInfoLightSourceRefNode = null;
    imageChannelInfoLightSourceRefNodeImageIndex = -1;
    imageChannelInfoLightSourceRefNodeChannelInfoIndex = -1;
    // Image+/ChannelInfo+/OTFRef
    imageChannelInfoOTFRefNode = null;
    imageChannelInfoOTFRefNodeImageIndex = -1;
    imageChannelInfoOTFRefNodeChannelInfoIndex = -1;
    // Image+/DisplayOptions
    imageDisplayOptionsNode = null;
    imageDisplayOptionsNodeImageIndex = -1;
    // Image+/DisplayOptions/ROI+
    imageDisplayOptionsROINode = null;
    imageDisplayOptionsROINodeImageIndex = -1;
    imageDisplayOptionsROINodeROIIndex = -1;
    // Image+/ImagingEnvironment
    imageImagingEnvironmentNode = null;
    imageImagingEnvironmentNodeImageIndex = -1;
    // Image+/ObjectiveRef
    imageObjectiveRefNode = null;
    imageObjectiveRefNodeImageIndex = -1;
    // Image+/Pixels+
    imagePixelsNode = null;
    imagePixelsNodeImageIndex = -1;
    imagePixelsNodePixelsIndex = -1;
    // Image+/Pixels+/TiffData+
    imagePixelsTiffDataNode = null;
    imagePixelsTiffDataNodeImageIndex = -1;
    imagePixelsTiffDataNodePixelsIndex = -1;
    imagePixelsTiffDataNodeTiffDataIndex = -1;
    // Image+/PlateRef
    imagePlateRefNode = null;
    imagePlateRefNodeImageIndex = -1;
    // Image+/StageLabel
    imageStageLabelNode = null;
    imageStageLabelNodeImageIndex = -1;
    // Image+/Thumbnail
    imageThumbnailNode = null;
    imageThumbnailNodeImageIndex = -1;
    // Instrument+
    instrumentNode = null;
    instrumentNodeInstrumentIndex = -1;
    // Instrument+/Detector+
    instrumentDetectorNode = null;
    instrumentDetectorNodeInstrumentIndex = -1;
    instrumentDetectorNodeDetectorIndex = -1;
    // Instrument+/Filter+
    instrumentFilterNode = null;
    instrumentFilterNodeInstrumentIndex = -1;
    instrumentFilterNodeFilterIndex = -1;
    // Instrument+/Filter+/Dichroic
    instrumentFilterDichroicNode = null;
    instrumentFilterDichroicNodeInstrumentIndex = -1;
    instrumentFilterDichroicNodeFilterIndex = -1;
    // Instrument+/Filter+/EmFilter
    instrumentFilterEmFilterNode = null;
    instrumentFilterEmFilterNodeInstrumentIndex = -1;
    instrumentFilterEmFilterNodeFilterIndex = -1;
    // Instrument+/Filter+/ExFilter
    instrumentFilterExFilterNode = null;
    instrumentFilterExFilterNodeInstrumentIndex = -1;
    instrumentFilterExFilterNodeFilterIndex = -1;
    // Instrument+/Filter+/FilterSet
    instrumentFilterFilterSetNode = null;
    instrumentFilterFilterSetNodeInstrumentIndex = -1;
    instrumentFilterFilterSetNodeFilterIndex = -1;
    // Instrument+/LightSource+
    instrumentLightSourceNode = null;
    instrumentLightSourceNodeInstrumentIndex = -1;
    instrumentLightSourceNodeLightSourceIndex = -1;
    // Instrument+/LightSource+/Arc
    instrumentLightSourceArcNode = null;
    instrumentLightSourceArcNodeInstrumentIndex = -1;
    instrumentLightSourceArcNodeLightSourceIndex = -1;
    // Instrument+/LightSource+/Filament
    instrumentLightSourceFilamentNode = null;
    instrumentLightSourceFilamentNodeInstrumentIndex = -1;
    instrumentLightSourceFilamentNodeLightSourceIndex = -1;
    // Instrument+/LightSource+/Laser
    instrumentLightSourceLaserNode = null;
    instrumentLightSourceLaserNodeInstrumentIndex = -1;
    instrumentLightSourceLaserNodeLightSourceIndex = -1;
    // Instrument+/LightSource+/Laser/Pump
    instrumentLightSourceLaserPumpNode = null;
    instrumentLightSourceLaserPumpNodeInstrumentIndex = -1;
    instrumentLightSourceLaserPumpNodeLightSourceIndex = -1;
    // Instrument+/Microscope
    instrumentMicroscopeNode = null;
    instrumentMicroscopeNodeInstrumentIndex = -1;
    // Instrument+/OTF+
    instrumentOTFNode = null;
    instrumentOTFNodeInstrumentIndex = -1;
    instrumentOTFNodeOTFIndex = -1;
    // Instrument+/OTF+/ObjectiveRef
    instrumentOTFObjectiveRefNode = null;
    instrumentOTFObjectiveRefNodeInstrumentIndex = -1;
    instrumentOTFObjectiveRefNodeOTFIndex = -1;
    // Instrument+/Objective+
    instrumentObjectiveNode = null;
    instrumentObjectiveNodeInstrumentIndex = -1;
    instrumentObjectiveNodeObjectiveIndex = -1;
    // Plate+
    plateNode = null;
    plateNodePlateIndex = -1;
    // Plate+/ScreenRef+
    plateScreenRefNode = null;
    plateScreenRefNodePlateIndex = -1;
    plateScreenRefNodeScreenRefIndex = -1;
    // Project+
    projectNode = null;
    projectNodeProjectIndex = -1;
    // Screen+
    screenNode = null;
    screenNodeScreenIndex = -1;
  }

}