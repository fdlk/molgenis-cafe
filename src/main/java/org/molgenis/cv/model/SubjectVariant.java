package org.molgenis.cv.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SubjectVariant
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-05-15T19:31:09.233299+02:00[Europe/Amsterdam]")

public class SubjectVariant   {
  @JsonProperty("componentID")
  private String componentID = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("source")
  private String source = null;

  @JsonProperty("hgvs")
  private String hgvs = null;

  @JsonProperty("allele")
  private String allele = null;

  @JsonProperty("genomebuild")
  private String genomebuild = null;

  @JsonProperty("chromosome")
  private String chromosome = null;

  @JsonProperty("range")
  private String range = null;

  @JsonProperty("referenceBases")
  private String referenceBases = null;

  @JsonProperty("alternateBases")
  private String alternateBases = null;

  @JsonProperty("variantType")
  private String variantType = null;

  @JsonProperty("frequency")
  private Integer frequency = null;

  @JsonProperty("variantInheritance")
  private String variantInheritance = null;

  @JsonProperty("origin")
  private String origin = null;

  @JsonProperty("pathogenic")
  private String pathogenic = null;

  @JsonProperty("zygosity")
  private String zygosity = null;

  @JsonProperty("start")
  private Integer start = null;

  @JsonProperty("end")
  private Integer end = null;

  public SubjectVariant componentID(String componentID) {
    this.componentID = componentID;
    return this;
  }

  /**
   * The component ID
   * @return componentID
  **/
  @ApiModelProperty(value = "The component ID")


  public String getComponentID() {
    return componentID;
  }

  public void setComponentID(String componentID) {
    this.componentID = componentID;
  }

  public SubjectVariant name(String name) {
    this.name = name;
    return this;
  }

  /**
   * An identifier for this variant e.g. rs id
   * @return name
  **/
  @ApiModelProperty(example = "rs8179178", value = "An identifier for this variant e.g. rs id")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SubjectVariant source(String source) {
    this.source = source;
    return this;
  }

  /**
   * The source of the identifier used in name parameter
   * @return source
  **/
  @ApiModelProperty(example = "dbSNP", value = "The source of the identifier used in name parameter")


  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public SubjectVariant hgvs(String hgvs) {
    this.hgvs = hgvs;
    return this;
  }

  /**
   * HGVS Nomenclature
   * @return hgvs
  **/
  @ApiModelProperty(example = "NM_000088.3:c.589G>T", value = "HGVS Nomenclature")


  public String getHgvs() {
    return hgvs;
  }

  public void setHgvs(String hgvs) {
    this.hgvs = hgvs;
  }

  public SubjectVariant allele(String allele) {
    this.allele = allele;
    return this;
  }

  /**
   * Get allele
   * @return allele
  **/
  @ApiModelProperty(value = "")

@Pattern(regexp="^([ATCGN]+)$") 
  public String getAllele() {
    return allele;
  }

  public void setAllele(String allele) {
    this.allele = allele;
  }

  public SubjectVariant genomebuild(String genomebuild) {
    this.genomebuild = genomebuild;
    return this;
  }

  /**
   * The genome build cordinates for this variant are based on e.g. GRCh38
   * @return genomebuild
  **/
  @ApiModelProperty(example = "GRCh38", value = "The genome build cordinates for this variant are based on e.g. GRCh38")


  public String getGenomebuild() {
    return genomebuild;
  }

  public void setGenomebuild(String genomebuild) {
    this.genomebuild = genomebuild;
  }

  public SubjectVariant chromosome(String chromosome) {
    this.chromosome = chromosome;
    return this;
  }

  /**
   * Reference name (chromosome). Accepting values 1-22, X, Y, MT
   * @return chromosome
  **/
  @ApiModelProperty(example = "1,X,Y,MT", value = "Reference name (chromosome). Accepting values 1-22, X, Y, MT")

@Pattern(regexp="^([1-9]|1[0-9]|2[0-2]|X|Y|MT)$") 
  public String getChromosome() {
    return chromosome;
  }

  public void setChromosome(String chromosome) {
    this.chromosome = chromosome;
  }

  public SubjectVariant range(String range) {
    this.range = range;
    return this;
  }

  /**
   * A comma separated list of genomic ranges in zero-based half open format, chromosome:start-end
   * @return range
  **/
  @ApiModelProperty(example = "1:6635137-6635325", value = "A comma separated list of genomic ranges in zero-based half open format, chromosome:start-end")


  public String getRange() {
    return range;
  }

  public void setRange(String range) {
    this.range = range;
  }

  public SubjectVariant referenceBases(String referenceBases) {
    this.referenceBases = referenceBases;
    return this;
  }

  /**
   * VCF-style reference alleles for this variant. At least one base.
   * @return referenceBases
  **/
  @ApiModelProperty(example = "G", value = "VCF-style reference alleles for this variant. At least one base.")

@Pattern(regexp="^([ATCGN]+)$") 
  public String getReferenceBases() {
    return referenceBases;
  }

  public void setReferenceBases(String referenceBases) {
    this.referenceBases = referenceBases;
  }

  public SubjectVariant alternateBases(String alternateBases) {
    this.alternateBases = alternateBases;
    return this;
  }

  /**
   * VCF-style alternate alleles for this variant. At least one base but can be \".\".
   * @return alternateBases
  **/
  @ApiModelProperty(example = "C", value = "VCF-style alternate alleles for this variant. At least one base but can be \".\".")

@Pattern(regexp="^([ATCGN.]+)$") 
  public String getAlternateBases() {
    return alternateBases;
  }

  public void setAlternateBases(String alternateBases) {
    this.alternateBases = alternateBases;
  }

  public SubjectVariant variantType(String variantType) {
    this.variantType = variantType;
    return this;
  }

  /**
   * Type of variant
   * @return variantType
  **/
  @ApiModelProperty(example = "SNV,INDEL", value = "Type of variant")


  public String getVariantType() {
    return variantType;
  }

  public void setVariantType(String variantType) {
    this.variantType = variantType;
  }

  public SubjectVariant frequency(Integer frequency) {
    this.frequency = frequency;
    return this;
  }

  /**
   * The frequency of the variant in this subject
   * @return frequency
  **/
  @ApiModelProperty(value = "The frequency of the variant in this subject")


  public Integer getFrequency() {
    return frequency;
  }

  public void setFrequency(Integer frequency) {
    this.frequency = frequency;
  }

  public SubjectVariant variantInheritance(String variantInheritance) {
    this.variantInheritance = variantInheritance;
    return this;
  }

  /**
   * From which parent(s) was the variant inherited or was it de novo
   * @return variantInheritance
  **/
  @ApiModelProperty(example = "maternal", value = "From which parent(s) was the variant inherited or was it de novo")


  public String getVariantInheritance() {
    return variantInheritance;
  }

  public void setVariantInheritance(String variantInheritance) {
    this.variantInheritance = variantInheritance;
  }

  public SubjectVariant origin(String origin) {
    this.origin = origin;
    return this;
  }

  /**
   * Is the variant germline or somatic in origin in this subject
   * @return origin
  **/
  @ApiModelProperty(example = "germline, somatic", value = "Is the variant germline or somatic in origin in this subject")


  public String getOrigin() {
    return origin;
  }

  public void setOrigin(String origin) {
    this.origin = origin;
  }

  public SubjectVariant pathogenic(String pathogenic) {
    this.pathogenic = pathogenic;
    return this;
  }

  /**
   * Whether this variant was causal for the phenotype in this subject
   * @return pathogenic
  **/
  @ApiModelProperty(example = "pathogenic, non-pathogenic", value = "Whether this variant was causal for the phenotype in this subject")


  public String getPathogenic() {
    return pathogenic;
  }

  public void setPathogenic(String pathogenic) {
    this.pathogenic = pathogenic;
  }

  public SubjectVariant zygosity(String zygosity) {
    this.zygosity = zygosity;
    return this;
  }

  /**
   * Zygosity of the variant in this subject
   * @return zygosity
  **/
  @ApiModelProperty(example = "heterozygous", value = "Zygosity of the variant in this subject")


  public String getZygosity() {
    return zygosity;
  }

  public void setZygosity(String zygosity) {
    this.zygosity = zygosity;
  }

  public SubjectVariant start(Integer start) {
    this.start = start;
    return this;
  }

  /**
   * The start coordinate of the variant in the genome
   * @return start
  **/
  @ApiModelProperty(example = "1234567", value = "The start coordinate of the variant in the genome")


  public Integer getStart() {
    return start;
  }

  public void setStart(Integer start) {
    this.start = start;
  }

  public SubjectVariant end(Integer end) {
    this.end = end;
    return this;
  }

  /**
   * The end coordinate of this variant in the genome
   * @return end
  **/
  @ApiModelProperty(example = "1234570", value = "The end coordinate of this variant in the genome")


  public Integer getEnd() {
    return end;
  }

  public void setEnd(Integer end) {
    this.end = end;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubjectVariant subjectVariant = (SubjectVariant) o;
    return Objects.equals(this.componentID, subjectVariant.componentID) &&
        Objects.equals(this.name, subjectVariant.name) &&
        Objects.equals(this.source, subjectVariant.source) &&
        Objects.equals(this.hgvs, subjectVariant.hgvs) &&
        Objects.equals(this.allele, subjectVariant.allele) &&
        Objects.equals(this.genomebuild, subjectVariant.genomebuild) &&
        Objects.equals(this.chromosome, subjectVariant.chromosome) &&
        Objects.equals(this.range, subjectVariant.range) &&
        Objects.equals(this.referenceBases, subjectVariant.referenceBases) &&
        Objects.equals(this.alternateBases, subjectVariant.alternateBases) &&
        Objects.equals(this.variantType, subjectVariant.variantType) &&
        Objects.equals(this.frequency, subjectVariant.frequency) &&
        Objects.equals(this.variantInheritance, subjectVariant.variantInheritance) &&
        Objects.equals(this.origin, subjectVariant.origin) &&
        Objects.equals(this.pathogenic, subjectVariant.pathogenic) &&
        Objects.equals(this.zygosity, subjectVariant.zygosity) &&
        Objects.equals(this.start, subjectVariant.start) &&
        Objects.equals(this.end, subjectVariant.end);
  }

  @Override
  public int hashCode() {
    return Objects.hash(componentID, name, source, hgvs, allele, genomebuild, chromosome, range, referenceBases, alternateBases, variantType, frequency, variantInheritance, origin, pathogenic, zygosity, start, end);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubjectVariant {\n");
    
    sb.append("    componentID: ").append(toIndentedString(componentID)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    hgvs: ").append(toIndentedString(hgvs)).append("\n");
    sb.append("    allele: ").append(toIndentedString(allele)).append("\n");
    sb.append("    genomebuild: ").append(toIndentedString(genomebuild)).append("\n");
    sb.append("    chromosome: ").append(toIndentedString(chromosome)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    referenceBases: ").append(toIndentedString(referenceBases)).append("\n");
    sb.append("    alternateBases: ").append(toIndentedString(alternateBases)).append("\n");
    sb.append("    variantType: ").append(toIndentedString(variantType)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    variantInheritance: ").append(toIndentedString(variantInheritance)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    pathogenic: ").append(toIndentedString(pathogenic)).append("\n");
    sb.append("    zygosity: ").append(toIndentedString(zygosity)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

